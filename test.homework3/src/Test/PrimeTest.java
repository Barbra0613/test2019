package Test;

import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Before;
import org.junit.Test;
import com.prime.Prime;

public class PrimeTest {
	
    Prime pri = new Prime();
    ByteArrayOutputStream out =  new ByteArrayOutputStream();
    
    @Before
    public void before()
    {
        pri = new Prime();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void testPrintPrimes() 
    {

        pri.printPrimes(4);
        String result = "Prime: 2\r\nPrime: 3\r\nPrime: 5\r\nPrime: 7\r\n";
        assertEquals(result, out.toString()); 
        
    }

}