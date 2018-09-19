public class CtoFTester{

	public static void main(String [] args){
		System.out.println("F: 20.0 C:"+(fahrenheitToCelsius(20)));
		System.out.println("C:260.0 F:"+(celsiusToFahrenheit(260)));
		System.out.println("F: 40 C:"+(fahrenheitToCelsius(40)));
		System.out.println("C: 32.0 F:"+(celsiusToFahrenheit(32))); 
	}

	public static double celsiusToFahrenheit(double a){
		return a*1.8+32.0;

	}	
	public static double fahrenheitToCelsius(double a){
		return (a -32) / 1.8;
	}

}
