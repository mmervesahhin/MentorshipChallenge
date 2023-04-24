import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ChallangeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		BigInteger zero=BigInteger.ZERO;
		BigInteger one=BigInteger.ONE;
		BigInteger num=BigInteger.valueOf(-1);
		
		 try {
			  System.out.println("Enter a number to check if it's prime or not (0 to stop):");
		      num=input.nextBigInteger();
		    } catch (InputMismatchException e) {
		      System.out.print("This input is not valid! ");
		      input.nextLine(); 
		    }

		while(num.compareTo(zero)!=0) {
			if(num.compareTo(zero)==-1)
				System.out.print("Enter a positive integer!\n");
			else if(num.compareTo(one)==0)
				System.out.println("1 is not prime by definition!");
			else {
				if(ChallangeSys.isPrime(num)) 
					System.out.print ("\n" + num + " is prime!");
				else
					System.out.print ("\n" + num + " is not prime!");
			}	
			
			try {
				  System.out.println("\nEnter a number to check if it's prime or not (0 to stop):");
			      num=input.nextBigInteger();
			    } catch (InputMismatchException e) {
			      System.out.print("This input is not valid! ");
			      input.nextLine(); 
			    }
		}
		
		System.out.println("\nProgram Stopped");
	}

}
