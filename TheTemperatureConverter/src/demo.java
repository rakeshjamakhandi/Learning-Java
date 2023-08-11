import java.util.Scanner;
public class demo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the fehreniet");
		double fahrenheit=sc.nextDouble();
		TemperatureConverter tc = new TemperatureConverter();

		System.out.println(tc.convertFahrenheitToCelsius(fahrenheit));
		
	}

}

