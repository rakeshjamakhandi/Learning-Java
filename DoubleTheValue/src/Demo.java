import java.util.*;
public class Demo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		System.out.println("The double result is :"+doubleTheNumber(n));
     
        
    }
	public static int doubleTheNumber(int num) {
	    return num*2;
	    
	}

}
