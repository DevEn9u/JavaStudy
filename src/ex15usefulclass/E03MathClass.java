package ex15usefulclass;

// extends Object도 생략 가능
public class E03MathClass extends Object {

	public static void main(String[] args) {
		/*
		 * Math 클래스
		 - java.lang 패키지에 정의된 클래스
		 - 수학과 관련된 일련의 작업들을 처리하는 메서드가 정의되어 있다.
		 - 메서드는 static으로 선언되어 있어 인스턴스 생성 없이 클래스명으로 호출할
		 수 있다.
		 */
		System.out.println("원주율: " + Math.PI);
		
		// 정수와 실수형 변수 선언
		float f = -3.14f; // 실수는 기본이 double형이기 때문에 float형으로 선언하려면 f 붙임
		double d = -100.9;
		int num = -10;
		
		System.out.println("### 절댓값 ###");
		System.out.println("Math.abs:" + Math.abs(f));
		System.out.println("Math.abs:" + Math.abs(d));
		System.out.println("Math.abs:" + Math.abs(num));
		
		System.out.println("### 올림 ###");
		System.out.println("Math.ceil: " + Math.ceil(3.4)); // 4
		System.out.println("Math.ceil: " + Math.ceil(-3.4)); // -3
		System.out.println("Math.ceil: " + Math.ceil(3.9)); // 4
		
		System.out.println("### 내림 ###");
		System.out.println("Math.floor: " + Math.floor(3.4)); // 3
		System.out.println("Math.floor: " + Math.floor(-3.4)); // -4
		System.out.println("Math.floor: " + Math.floor(3.9)); // 3
		
		/*
		 * round()의 경우 가장 가까운 정수쪽으로 올림/버림을 결정한다.
		 * x.5 이상이면 올림 처리, 미만이면 버림 처리를 한다.
		 * 따라서 3.4xxx라면 버림처리를 한다.
		 */
		System.out.println("### 반올림 ###");
		System.out.println("Math.round: " + Math.round(3.49999)); // 3(나머지 버림)
		System.out.println("Math.round: " + Math.round(-3.54444)); // -4(올림)
		System.out.println("Math.round: " + Math.round(-1.4));
		System.out.println("Math.round: " + Math.round(-1.5));
		System.out.println("Math.round: " + Math.round(-3.51));
		
		System.out.println("### 최대/최소 ###");
		System.out.println("Math.max: " + Math.max(100, 99));
		System.out.println("Math.min: " + Math.min(100, 99));
	
		/*
		 * random(): 0~1 사이의 실수값을 반환한다. 따라서 정수값을 만들고 싶다면
		   특정한 값을 곱한 후 소수점을 처리하면 된다.
		 */
		System.out.println("### 난수 ###");
		System.out.println((int)(Math.random() * 45) + 1);
		
		System.out.println("### 거듭제곱 ###");
		System.out.println("2의 10승은? : " + Math.pow(2, 10));
	}

}
