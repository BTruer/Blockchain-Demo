import java.util.Arrays;

/**
 * This class implements a Block in a blockchain.
 * 
 * @author BTruer
 *
 */
public class Block {
    /**
     * Pointer to previous block 
     */ 
    private int previous_hash;
    /**
     * Current block's hash 
     */ 
    private int block_hash;
    /**
     * Array of strings where each string is a transcation payload. 
     * This string payload will have format "USER:<ID> <ACTION> USER:<ID> <AMOUNT:COIN>"
     * USER:ID is the public key or wallet id of the user
     * ACTION is SENT or RECIEVED
     * Amount is a double: Coin is BTC, ETH, etc. 
     */ 
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