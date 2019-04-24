import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class testBubbleSort {

    public BubbleSort bs;
    ByteArrayOutputStream out;
	
	@Before
	public void setUp() {
		bs = new BubbleSort();
		out =  new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
	}
	
	@Test
	public void test() {
		int arr[] = new int[]{1,6,2,2,5};
        BubbleSort.BubbleSort(arr);
        String result = "[1, 2, 2, 5, 6]";
        assertEquals(result, Arrays.toString(arr)); 
        
        int arr1[] = new int[]{1,6,2,2,5,5};
        BubbleSort.BubbleSort(arr1);
        String result1 = "[1, 2, 2, 5, 5, 6]";
        assertEquals(result1, Arrays.toString(arr1)); 
        
        int arr2[] = new int[]{1,6,2,2,5,5,0};
        BubbleSort.BubbleSort(arr2);
        String result2 = "[0, 1, 2, 2, 5, 5, 6]";
        assertEquals(result2, Arrays.toString(arr2)); 
        
        int arr3[] = new int[]{-1,0,6,2,2,5,5,0};
        BubbleSort.BubbleSort(arr3);
        String result3 = "[-1, 0, 0, 2, 2, 5, 5, 6]";
        assertEquals(result3, Arrays.toString(arr3)); 
	}

}
