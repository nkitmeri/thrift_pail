package bigdatabook.pail;

import bigdatabook.thrift.Data;
import java.util.Collections;
import java.util.List;
import thriftpailtest.ThriftPailStructure;

/**
 *
 * @author nikos
 */
public class DataPailStructure extends ThriftPailStructure< Data >
{
    @Override
    public Class getType()
    {
        return Data.class;
    }

    @Override
    protected Data createThriftObject() 
    {
        return new Data();
    }
    
    @Override
    public List< String > getTarget( Data object )
    {
        return Collections.EMPTY_LIST;
    }
    
    @Override
    public boolean isValidTarget( String... dirs )
    {
        return true;
    }
}
