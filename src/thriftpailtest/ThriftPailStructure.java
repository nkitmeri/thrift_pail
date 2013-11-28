package thriftpailtest;

import com.backtype.hadoop.pail.PailStructure;
import java.util.List;
import org.apache.thrift.TBase;
import org.apache.thrift.TDeserializer;
import org.apache.thrift.TException;
import org.apache.thrift.TSerializer;

/**
 *
 * @author nikos
 * @param <T>
 */
public abstract class ThriftPailStructure< T extends Comparable > implements
        PailStructure<T>
{
    private transient TSerializer ser;
    private transient TDeserializer des;
    
    private TSerializer getSerializer()
    {
        if( ser == null )
            ser = new TSerializer();
        
        return ser;
    }
    
    private TDeserializer getDeserializer()
    {
        if( des == null ) 
            des = new TDeserializer();
        
        return des;
    }
    
    @Override
    public byte[] serialize( T obj )
    {
        try
        {
            return getSerializer().serialize( ( TBase ) obj );
        } 
        catch( TException e )
        {   
            throw new RuntimeException(e);
        }
    }
    
    @Override
    public T deserialize( byte[] record )
    {
        T ret = createThriftObject();       // ???
        
        try 
        {
            getDeserializer().deserialize( ( TBase ) ret, record );
        } 
        catch( TException e )
        {
            throw new RuntimeException(e);
        }
        
        return ret;
    }
    
    protected abstract T createThriftObject();
    
    @Override
    public boolean isValidTarget(String... strings)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<String> getTarget(T t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Class getType() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
