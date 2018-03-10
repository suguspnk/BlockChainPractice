package data;

public class TransactionInput {
    public String transactionOutputId; //Reference to TransactionOutput -> transactionId
    public TransactionOutput UTXO; //Contains the Unspent transaction output

    public TransactionInput(String transactionOutputId) {
        this.transactionOutputId = transactionOutputId;
    }
}