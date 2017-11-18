public class Run {

    public static void main(String[] args) {

        String[] genesisTransactions = {"USER:bob SENT USER:alice 1000BTC","USER:alice SENT USER:bob 500BTC"};
        Block genesisBlock = new Block(0, genesisTransactions);

        String[] block2Transactions = {"USER:eve SENT USER:satoshi 1000BTC", "USER:satoshi SENT USER:tony 1BTC"};
        Block block2 = new Block(genesisBlock.getBlockHash(), block2Transactions);

        String[] block3Transactions = {"USER:jack SENT USER:ash 100BTC"};
        Block block3 = new Block(block2.getBlockHash(), block3Transactions);

        System.out.println("Hash of genesis block:");
        System.out.println(genesisBlock.getBlockHash());

        System.out.println("Hash of block 2:");
        System.out.println(block2.getBlockHash());

        System.out.println("Hash of block 3:");
        System.out.println(block3.getBlockHash());

    }


}