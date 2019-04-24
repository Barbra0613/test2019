import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class testBackPack {

	public BackPack bp;
	
	@Before
	public void setUp() {
		bp = new BackPack();
	}
	
	@Test
	public void test() {
		 int m = 10;
	     int n = 3;
	     int w[] = {3, 4, 5};
	     int p[] = {4, 5, 6};
	     int c[][] = bp.BackPack_Solution(m, n, w, p);
         int result[][] = {{0,0,0,0,0,0,0,0,0,0,0},{0,0,0,4,4,4,4,4,4,4,4},{0,0,0,4,5,5,5,9,9,9,9},{0,0,0,4,5,6,6,9,10,11,11}};
         assertArrayEquals(result,c); 
         
         int m1 = 9;
	     int n1 = 3;
	     int w1[] = {3, 4, 5};
	     int p1[] = {4, 5, 6};
	     int c1[][] = bp.BackPack_Solution(m1, n1, w1, p1);
         int result1[][] = {{0,0,0,0,0,0,0,0,0,0},{0,0,0,4,4,4,4,4,4,4},{0,0,0,4,5,5,5,9,9,9},{0,0,0,4,5,6,6,9,10,11}};
         assertArrayEquals(result1,c1); 
         
         int m2 = 7;
	     int n2 = 3;
	     int w2[] = {1, 4, 5};
	     int p2[] = {1, 5, 6};
	     int c2[][] = bp.BackPack_Solution(m2, n2, w2, p2);
         int result2[][] = {{0,0,0,0,0,0,0,0},{0,1,1,1,1,1,1,1},{0,1,1,1,5,6,6,6},{0,1,1,1,5,6,7,7}};
         assertArrayEquals(result1,c1); 
        
	}

}
