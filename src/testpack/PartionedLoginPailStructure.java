package testpack;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author nikos
 */
public class PartionedLoginPailStructure extends LoginPailStructure
{
    private static final SimpleDateFormat FORMATTER = 
            new SimpleDateFormat( "yyyy-MM-dd" );
    
    @Override
    public List< String > getTarget( Login object )
    {
        List< String > directoryPath = new ArrayList<>();
        //Date date = new Date( object.loginUnixTime * 1000l );
        
        //directoryPath.add( FORMATTER.format( date ) );
        
        directoryPath.add( object.userName.substring( 0, 3 ) );
        
        return directoryPath;
    }
    
    @Override
    public boolean isValidTarget( String... strings )
    {
        if( strings.length != 2 ) 
            return false;
        
        try 
        {   
            return strings[0] != null;
            //return ( FORMATTER.parse( strings[0] ) != null );
        } 
        catch( Exception e )
        {
            return false;
        }
    }
}
