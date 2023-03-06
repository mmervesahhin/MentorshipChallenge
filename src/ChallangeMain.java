import java.util.Scanner;

public class ChallangeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
	
		System.out.println("Enter a number to check if it's prime or not (0 to stop):");
		double num=input.nextDouble();

		while(num!=0) {
			if(num%1!=0)
				System.out.println("This input is not valid! Enter an integer\n");
			else if(num<0)
				System.out.println("This input is not valid! Enter a positive number\n");
			else {
				if(num==1)
					System.out.println("1 is not prime by definition!");
				else {
					if(ChallangeSys.isPrime(num))
						System.out.printf("\n%.0f is prime!", num);
					else
						System.out.printf("\n%.0f is not prime!", num);
				}
			}	
			
			System.out.println("\nEnter a number to check if it's prime or not (0 to stop):");
			num=input.nextDouble();
		}
		
		System.out.println("\nProgram Stopped");
	}

}
