import java.util.Scanner;

public class ChallangeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
	
		System.out.println("Enter a number to check if it's prime or not (0 to stop):");
		double num=input.nextDouble();
		
		while(num!=0) {
			if(num!=(int)num || num<0)
				System.out.println("This input is not valid!\n");
			
			else {
				if(num==1)
					System.out.println("1 is not prime by definition!");
				else {
					if(ChallangeSys.isPrime((int)num))
						System.out.println("\n"+ (int)num+" is prime!");
					else
						System.out.println("\n"+ (int)num+" is not prime!");
				}
			}	
			
			System.out.println("\nEnter a number to check if it's prime or not (0 to stop):");
			num=input.nextDouble();
		}
		
		System.out.println("\nProgram Stopped");
	}

}
