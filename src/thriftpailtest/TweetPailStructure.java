package thriftpailtest;

import java.util.Collections;
import java.util.List;
import thriftpailtest.gen.Tweet;

/**
 *
 * @author nikos
 */
public class TweetPailStructure extends ThriftPailStructure< Tweet >
{
    @Override
    public Class getType()
    {
        return Tweet.class;
    }

    @Override
    protected Tweet createThriftObject()
    {
        return new Tweet();
    }
    
    @Override
    public List< String > getTarget( Tweet object )
    {
        return Collections.EMPTY_LIST;
    }
    
    @Override
    public boolean isValidTarget( String... dirs )
    {
        return true;
    }
}
