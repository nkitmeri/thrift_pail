package testpack;

import com.backtype.hadoop.pail.PailStructure;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author nikos
 */
public class LoginPailStructure implements PailStructure< Login >
{
    @Override
    public Class getType()
    {
        return Login.class;
    }
    
    @Override
    public byte[] serialize( Login login )
    {
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        DataOutputStream dataOut = new DataOutputStream( byteOut );
        byte[] userBytes = login.userName.getBytes();
        
        try 
        {
            dataOut.writeInt( userBytes.length );
            dataOut.write( userBytes );
            dataOut.writeLong( login.loginUnixTime );
            dataOut.close();
        }
        catch( IOException e ) 
        {
            throw new RuntimeException(e);
        }
        
        return byteOut.toByteArray();
    }
    
    @Override
    public Login deserialize( byte[] serialized )
    {
        DataInputStream dataIn = new DataInputStream(
            new ByteArrayInputStream( serialized ) );
        
        try 
        {
            byte[] userBytes = new byte[ dataIn.readInt() ];
            dataIn.read( userBytes );                       // <- test this
            
            return new Login( new String( userBytes ), dataIn.readLong() );
        } 
        catch( IOException e )
        {
            throw new RuntimeException(e);
        }
    }
    
    @Override
    public List< String > getTarget( Login object )
    {
        return Collections.EMPTY_LIST;
    }
    
    @Override
    public boolean isValidTarget( String... dirs )
    {
        return true;
    }
    
}
