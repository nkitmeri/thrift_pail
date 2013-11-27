package thriftpailtest;

import com.backtype.hadoop.pail.Pail;
import com.backtype.hadoop.pail.Pail.TypedRecordOutputStream;
import java.io.IOException;

/**
 *
 * @author nikos
 */
public class ThriftPailTest 
{

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main( String[] args ) throws IOException
    {
        Pail pail = Pail.create( "/tmp/inpail" );
        TypedRecordOutputStream os = pail.openWrite();
        
        os.writeObject( new byte[] { 1, 2, 3 } );
        
        os.close();
    }
    
}
