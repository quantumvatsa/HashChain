import java.util.Arrays;

public class Block
{
  private int previousHash;
  String[] transactions;
  private int hash;
  private blockHash;
  
  public Block(int previousHash, String[] transactions)
  {
    this.previousHash=previousHash;
    this.transactions=transactions;
    
    Object[] contents = {Array.hashCode(transactions), previousHash};
    this.blockHash= Array.hashCode(contents)
  }
  
  public int getPreviousHash()
  {
    return previousHash;
  }
  
  
  public String getTransaction()
  {
    return transactions;
  }
  
  public int getBlockHash()
  {
    return blockHash;
  }
  
}
