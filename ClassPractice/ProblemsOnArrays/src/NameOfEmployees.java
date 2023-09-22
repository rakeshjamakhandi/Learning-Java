import java.util.*;
public class NameOfEmployees {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		String arr[]=new String[8];
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("enter name");
			arr[i]=sc.next();
		}
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
}
