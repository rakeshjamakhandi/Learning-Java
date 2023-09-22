import java.util.Scanner;
public class AgeStatus {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Your Age");
		int age=scan.nextInt();
		if(age>=50 && age<=100) {
			
			if(age>=90 ) {
				System.out.println("You are nearer to death");
			}
			else { 
				System.out.println("You turned as granny...");
			}
		  }
		else {
			System.out.println("young.younger,youngest"+"OR"+"if  you are above 100);
		}
		
		}
		

	}


