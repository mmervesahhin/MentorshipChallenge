
public class ChallangeSys {

	public static boolean isPrime(double num) {
		
		for(int i=2;i<num;i++) {
			if(num%i==0)
				return false;
		}
		
		return true;
	}
}
