import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

ArrayList <Block> blockchain = new ArrayList <>();

public static void main (String args[])
{
  String[] genesisTransactions={"satoshi sent vatsa 10 bitcoins", "vatsa sent 1 bitcoin to rexile"};
  Block genesisBlock = (0, genesisTransactions);
  String[] Block2Transactions={"satoshi sent vatsa 10 bitcoins", "vatsa sent 1 bitcoin to rexile"};
  Block Block2 = (genesisBlock.getBlockHash(), Block2Transactions);
  String[] Block3Transactions={"satoshi sent vatsa 10 bitcoins", "vatsa sent 1 bitcoin to rexile"};
  Block Block3 = (Block2.getBlockHash() Block3Transactions);
  
  System.out.println(genesisBlock.getBlockHash());
  
}
