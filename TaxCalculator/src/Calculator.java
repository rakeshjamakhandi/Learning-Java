import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter The Purchase Amount");
		int purchaseAmount =scan.nextInt();
		System.out.println("Enter the tax rate");
		double taxRate =scan.nextDouble();
		System.out.println(doublecalculateTotalWithTax(purchaseAmount,taxRate));
		
		//System.out.println("The Result Is: "+totalAmount);
	}
	public static double doublecalculateTotalWithTax(double purchaseAmount,double TaxRate) {
		return  (purchaseAmount*TaxRate+purchaseAmount);
	}

}
