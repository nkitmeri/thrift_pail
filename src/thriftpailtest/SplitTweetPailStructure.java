package thriftpailtest;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.apache.thrift.TFieldIdEnum;
import org.apache.thrift.meta_data.FieldMetaData;

/**
 *
 * @author nikos
 */
public class SplitTweetPailStructure extends TweetPailStructure
{
    protected static interface FieldStructure
    {
        public boolean isValidTarget( String[] dirs );
        public void fillTarget( List< String > ret, Object val );
    }
    
    protected static class PropertyStructure implements FieldStructure
    {
        private TFieldIdEnum valueId;
        private HashSet< Short > validIds;
        
        public PropertyStructure( Class prop )
        {
            try 
            {
                Map< TFieldIdEnum, FieldMetaData > propMeta = 
                        getMetadataMap( prop );
                Class valClass = Class.forName( prop.getName() + "Value" );
                valueId = get
            }
            catch (Exception e) {
            }
        }
        
        private static Map< TFieldIdEnum, FieldMetaData > 
                getMetadataMap( Class c )
        {
            try 
            {
                Object o = c.newInstance();
                
                return ( Map ) c.getField( "meataDataMap" ).get(o);
            }
            catch( Exception e )
            {
                throw new RuntimeException(e);
            }
        }
        
        @Override
        public boolean isValidTarget(String[] dirs)
        {
            
        }

        @Override
        public void fillTarget(List<String> ret, Object val) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
    }
}
