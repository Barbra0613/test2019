package Lab1;

public class Coin {
	
	public boolean judge ( int money )
	{
		
		int coins[] = {50,20,5,5,1,1,1};
		
		for ( int i = 0 ; i < coins.length ; i++ ) {	
			if ( money >= coins[i] )
			{
				money -= coins[i];
				if ( judgeZero(money) ) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	public boolean judgeZero ( int money ){
		
		if ( money == 0 ){
			return true; 
		}else {
			return false;
		}
	}

}
