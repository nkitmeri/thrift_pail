package testpack;

import com.backtype.hadoop.pail.Pail;
import com.backtype.hadoop.pail.Pail.TypedRecordOutputStream;
import com.backtype.hadoop.pail.PailSpec;
import com.backtype.hadoop.pail.SequenceFileFormat;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author nikos
 */
public class TestMain
{

    /**
     * @param args the command line arguments
     */
    public static void main( String[] args ) throws IOException
    {
//        Pail< Login > loginPail = Pail.create( "/tmp/logins2",
//                new LoginPailStructure() );
//        TypedRecordOutputStream out = loginPail.openWrite();
//        
//        out.writeObject( new Login( "nikos2", 3434343434l ) );
//        out.writeObject( new Login( "mary2", 5656565656l ) );
//        
//        out.close();
//        Pail< Login > loginPail = new Pail<>( "/tmp/logins" );
        
//        for( Login l : loginPail )
//        {
//            System.out.println( l.userName + " " + l.loginUnixTime );
//        }
        
//        Pail< Login > loginPail = new Pail<>( "/tmp/logins" );
//        Pail< Login > updatePail = new Pail<>( "/tmp/logins2" );
//        
//        loginPail.absorb( updatePail );
//        
//        for( Login l : loginPail )
//        {
//            System.out.println( l.userName + " " + l.loginUnixTime );
//        }
        
//        Pail< Login > pail = Pail.create( "/tmp/partitioned_logins2",
//                new PartionedLoginPailStructure() );
//        
//        TypedRecordOutputStream out = pail.openWrite();
//        
//        out.writeObject( new Login( "nikos", 1434343434l ) );
//        out.writeObject( new Login( "mary", 1656565656l ) );
//        out.writeObject( new Login( "nikos2", 1656565656l ) );
//        out.writeObject( new Login( "mary2", 1434343434l ) );
        
//        out.close();
        
//        Map< String, Object > options = new HashMap<>();
//        
//        options.put( SequenceFileFormat.CODEC_ARG,
//                SequenceFileFormat.CODEC_ARG_BZIP2 );
//        options.put( SequenceFileFormat.TYPE_ARG,
//                SequenceFileFormat.TYPE_ARG_BLOCK );
//        
//        LoginPailStructure struct = new PartionedLoginPailStructure();
//        Pail compressed = Pail.create( "/tmp/compressed",
//                new PailSpec( "SequenceFile", options, struct ) );
//        TypedRecordOutputStream out = compressed.openWrite();
//        
//        out.writeObject( new Login( "nikos", 1434343434l ) );
//        out.writeObject( new Login( "mary", 1656565656l ) );
//        out.writeObject( new Login( "nikos2", 1656565656l ) );
//        out.writeObject( new Login( "mary2", 1434343434l ) );
//        
//        out.close();
    }
    
}
