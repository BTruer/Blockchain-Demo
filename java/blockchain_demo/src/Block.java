import java.util.Arrays;

/**
 * This class implements a Block in a blockchain.
 * 
 * @author BTruer
 *
 */
public class Block {

    private int previous_hash;
    private int block_hash;
    private String[] transactions;

    public Block(int previous_hash, String[] transactions) {
        this.previous_hash = previous_hash;
        this.transactions = transactions;
        Object[] content_array = {Arrays.hashCode(transactions), previous_hash};
        this.block_hash = Arrays.hashCode(content_array);

    }

    public int getPreviousHash() {
        return previous_hash;
    }

    public String[] getTransaction() {
        return transactions;
    }

    public int getBlockHash() {
        return block_hash;
    }

}