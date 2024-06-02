package ex05method;

/*문제3
 * 섭씨(Celsius)를 입력받아서 화씨(Fahrenheit)로 변환하여 리턴하는
   함수와 화씨를 입력받아서 섭씨로 변환하여 리턴하는 함수를 만들어라.
   공식은 아래와 같습니다.
   
   메서드명 : celsiusToFahrenheit() , fahrenheitToCelsius()
   공식]
   화씨 = 1.8 * 섭씨 + 32
   섭씨 = (화씨 - 32) / 1.8

 */
public class QuTemperature {

	public static void main(String[] args) {
		celsiusToFahrenheit(32);
		fahrenheitToCelsius(100);
	}
	
	// 입력할 섭씨를 담을 변수 c 선언, 화씨로 바꾸는 공식을 fahr로 선언한다.
	static void celsiusToFahrenheit(double c) {
		double fahr = 1.8 * c + 32;
		/*
		 * 소수점을 반올림하는 Math.round()메서드
		 * 100을 곱한 값을 Math.round()한 뒤 100으로 나눠주면
		 * 둘째 자리까지 출력 가능하다.
		 */
		System.out.printf("입력한 섭씨(%.2f)℃를 화씨로 변환하면: " + 
				Math.round(fahr * 100) / 100.0
				+ "℉" + "%n", c);
	}
	// 입력할 화씨를 담을 변수 f 선언, 화씨로 바꾸는 공식을 cel로 선언한다.
	static void fahrenheitToCelsius(double f) {
		double cel = (f - 32) / 1.8;
		System.out.printf("입력한 화씨(%.2f)℉를 섭씨로 변환하면: " +
				Math.round(cel * 100) / 100.0
				+ "℃", f);
	}
}
