package testmisc;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author nikos
 */
public class TestMiscMain 
{

    /**
     * @param args the command line arguments
     */
    public static void main( String[] args ) throws IOException
    {
        String s = "PAOK";
        byte[] bytes = s.getBytes();
        StringBuilder binary = new StringBuilder();
        for (byte b : bytes)
        {
           int val = b;
           for (int i = 0; i < 8; i++)
           {
              binary.append((val & 128) == 0 ? 0 : 1);
              val <<= 1;
           }
           binary.append(' ');
        }
        System.out.println("'" + s + "' to binary: " + binary);
    }
    
}
