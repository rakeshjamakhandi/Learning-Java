import java.util.Scanner;
public class Arithmetic {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		
		int num1=s.nextInt();
		int num2=s.nextInt();
		
		System.out.println("the multiplication result is:"+multiplyNumbers(num1,num2));
		
	    num1=s.nextInt();
		num2=s.nextInt();
		
		System.out.println("The subtraction result is:"+subtractNumbers(num1,num2));
		
		num1=s.nextInt();
		num2=s.nextInt();
		
		
		System.out.println("The division result is:"+divideNumbers(num1,num2));
		
		num1=s.nextInt();
		num2=s.nextInt();
		
		
		System.out.println("The reminder result is:"+findRemainder(num1,num2));

	}
	public static int subtractNumbers(int num1, int num2) {

		return num2-num1;
	}

	public static int multiplyNumbers(int num1, int num2) {
		return num1*num2;
	}

	public static double divideNumbers(int num1, int num2) {
		return num1/num2;
	}

	public static int findRemainder(int num1, int num2) {
		return num1%num2;
	}

}
