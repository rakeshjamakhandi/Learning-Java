import java.util.*;
public class StudentsAge {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[5];
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Enter Students marks ");
			arr[i]=scan.nextInt();
		}
		System.out.println("The marks are..");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
