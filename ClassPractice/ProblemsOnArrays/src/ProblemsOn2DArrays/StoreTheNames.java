package ProblemsOn2DArrays;
import java.util.*;
public class StoreTheNames {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		String arr[][]=new String[5][6];
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.println("The bank no "+i+" name of costomer "+j);
				arr[i][j]=scan.next();
			}
		}
     			for(int i=0;i<=arr.length-1;i++) {
				for(int j=0;j<=arr[i].length-1;j++) {
					System.out.print(arr[i][j]+" | ");
				
			}
			System.out.println();
		}
	}
}

