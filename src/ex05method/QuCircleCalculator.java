package ex05method;


/*
 * 원의 반지름을 인수(파라미터)로 전달하면
   원의 넓이와 둘레를 계산하여 반환하는 메소드를 각각 정의하자.
   이를 호출하는 main 메소드를 정의하시오.
 
   메서드명 : circleArea() > 원의넓이, circleRound() > 원의둘레
   넓이공식 : 3.14 * 반지름 * 반지름
   둘레공식 : 2 * 3.14 * 반지름

   실행결과]
   원의 둘레(5.5) : 34.54
   원의 넓이(5.5) : 94.985

 */
public class QuCircleCalculator {

	public static void main(String[] args) {
//		double area = circleArea(5.5);
		circleRound(5.5);
		circleArea(5.5);
	}
	static void circleRound(double r) {
		double round = 2 * 3.14 * r;
		System.out.printf("원의 둘레(%.1f) : " + round +  "%n", r);
	}
	static void circleArea(double r) {
		// 반지름을 입력받는 변수 r
		double area = 3.14 * r * r;
		System.out.printf("원의 넓이(%.1f) : " + area, r);
	}
	

}
