import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("Welcome to the Temperature Conversion Tool!");
		System.out.println("Select an option: ");
		System.out.println("1. Convert Celsius to Fahrenheit");
	    System.out.println("2. Convert Fahrenheit to Celsius");

        int option=scan.nextInt();
		if(option == 1 || option == 2) {
			switch (option) {
			case 1:
			System.out.println("Enter the temperature in celsius");
			break;
			case 2:
			System.out.println("Enter the temperature in fahrenheit);                                                ");
			break;
		}
		
			double T=scan.nextDouble();
			if (option == 1) {
				System.out.println(T+"C is equivalent to"+celsiusToFahrenheit(67.0)+"f");
				
			}
			else {
				System.out.println(T+"F is equivalent to"+fahrenheitToCelsius(87.0)+"c");
			}
		}
		else {
			System.out.println("invalid option");
		}
		
		
    }
	  public static double celsiusToFahrenheit(double celsius) {
		return (celsius * 9 / 5 + 32);
	  }

	  public static double fahrenheitToCelsius(double fahrenheit) {
		return (fahrenheit - 32) * 5 / 9;
	  }
} 
