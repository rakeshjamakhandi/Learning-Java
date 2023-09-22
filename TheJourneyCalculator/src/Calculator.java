import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the valu");
		double speed= sc.nextDouble();
		double time=sc.nextDouble();
		calc c=new calc();

		System.out.println(c.calculateDistance(speed,time));
	}
	 
}
