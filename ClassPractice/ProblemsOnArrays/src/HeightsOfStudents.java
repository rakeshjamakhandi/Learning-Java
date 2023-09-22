import java.util.*;
public class HeightsOfStudents {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	double Height[]=new double[10];
	for(int i=0;i<=Height.length-1;i++) {
		System.out.println("Enter Height of the players "+i);
		Height[i]=sc.nextDouble();
		
	}
	System.out.println("The Heights of the player are ");
	for(int i=0;i<=Height.length-1;i++) {
	
	System.out.print(Height[i]+" ");
	}

}
}
