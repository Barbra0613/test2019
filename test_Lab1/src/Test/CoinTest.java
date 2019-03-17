package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Lab1.Coin;

public class CoinTest {
	
	Coin cal = new Coin();
	
	@Test
	public void testJudge() {
		assertEquals( true, cal.judge(50) );
		assertEquals( true, cal.judge(23) );
		assertEquals( false, cal.judge(14) );
	}
	
	public static void main(String[] args) {
		
		CoinTest test = new CoinTest();
		test.testJudge();
	}


}
