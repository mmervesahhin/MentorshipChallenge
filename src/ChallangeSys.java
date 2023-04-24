import java.math.BigInteger;

public class ChallangeSys {

	public static boolean isPrime(BigInteger num) {
		BigInteger zero=BigInteger.ZERO;
		BigInteger one=BigInteger.ONE;
		
		BigInteger i=BigInteger.TWO;
		
		while(num.compareTo(i)==1) {
			if(num.mod(i).compareTo(zero)==0)
				return false;
			i=i.add(one);
		}
		
		return true;
	}
}
