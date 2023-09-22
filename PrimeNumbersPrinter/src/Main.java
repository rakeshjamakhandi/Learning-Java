import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter range");
		int n=scan.nextInt();
		printPrimes(n);

	}
	public static void printPrimes(int n) {
	    int count=0;
		for(int i=3;count<n;i++){
			 boolean res=checkPrime(i);
			 if(res==true) {
				 System.out.print(i+" ");
				 count++;
			 }
		}
	  
	  }
	public static boolean checkPrime(int i) {
		for(int j=2;j<i;j++){
			if(i%j==0) {
				return false;
			}
		}
		return true;
	}

}
