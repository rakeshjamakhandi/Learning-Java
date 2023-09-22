import java.util.Scanner;
public class Caculator {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Number a");
		int num=scan.nextInt();
		System.out.println("Print the operation case");
		char n1=scan.next().charAt(0);
		System.out.println("Enter number b");
		int n=scan.nextInt();
		
		calculator(n,n1,num);

		
	
	}
	public static void calculator(int a,char name,int b) {
		switch (name) {
		case '+':
			System.out.println("the Result is: "+ (a+b));
			break;
		case '-':
			System.out.println("Result is: "+ (a-b));
			break;
		case '*':
			System.out.println("The Result is: "+ a*b);
			break;
		case '/':
			System.out.println("The Result is: "+ a/b);
			break;
		case '%':
			System.out.println("The Result is: "+a%b);
			break;
			default:
				System.out.println("Invalid Operator");
			
		}

}
}