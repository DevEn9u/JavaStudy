package ex05method;

public class QuTemperatureT {

	public static void main(String[] args) {
		System.out.println(
				"섭씨 28도 => 화씨: " + celsiusToFahrenheit(28));
		System.out.printf(
				"화씨 96도 => 화씨: %.2f", fahrenheitToCelsius(98));
	}
	
	public static double celsiusToFahrenheit(double cel) {
		// 화씨 = 1.8 * 섭씨 + 32
		return 1.8 * cel + 32;
	}
	
	
	public static double fahrenheitToCelsius(double fahr) {
		// 섭씨 = (화씨 - 32) / 1.8
		double cel = (fahr - 32) / 1.8;
		return cel;
	}


}