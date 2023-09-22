package ProblemsOn2DArrays;
import java.util.Scanner;
public class StoreAgesOfStudents {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age[][]=new int[3][4];
		for(int i=0;i<=age.length-1;i++) {
			for(int j=0;j<=age[i].length-1;j++) {
				System.out.println("The ages of "+i+" Student"+j);
				age[i][j]=sc.nextInt();
			}
		}
				System.out.println("The ages are..");
				for(int i=0;i<=age.length-1;i++) {
			        for(int j1=0;j1<=age[i].length-1;j1++) {
			        	System.out.print(age[i][j1]+" ");
			        }
	    				System.out.println();
				}		
			}
		}

	


