import java.util.*;

public class WB {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Is input valid (true/false):");
		boolean input=scan.nextBoolean();
		System.out.println("Does input meet a certain condition (true/false)");
		boolean condition=scan.nextBoolean();
		isValidInput(input,condition);
		if(isValidInput(condition,input)==true) {
			System.out.println("Valid Input");
		}
		else {
			System.out.println("invalid Input");
		}

	}
	public static boolean isValidInput(boolean input, boolean condition) {
		if(input==true&&condition==true) {
			return true;
		}
		return false;
	}

}
