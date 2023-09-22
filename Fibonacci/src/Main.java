import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("START");
		int n=scan.nextInt();
		printFibonacciSeries(n);

	}
	public static void printFibonacciSeries(int n) {
		
		int num1=0;
		int num2=1;
		 
			if(n==1) {
				System.out.print(num1);
			}
			else  {
				System.out.print(num1+" "+num2);
		   }
			//else {
				//System.out.print(num1+" "+num2);
				
			//}
			for(int j=3; j<n;j++) {
				
				int nextnum=num1+num2;
				System.out.print(" "+nextnum);
				num1=num2;
				num2=nextnum;
			
				
			}
		
		}
	}


