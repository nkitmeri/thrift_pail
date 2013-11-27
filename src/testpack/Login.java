package testpack;

/**
 *
 * @author nikos
 */
public class Login 
{
    public String userName;
    public long loginUnixTime;
    
    public Login( String userName, long loginUnixTime )
    {
        this.userName = userName;
        this.loginUnixTime = loginUnixTime;
    }
}
