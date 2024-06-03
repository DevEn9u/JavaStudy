package ex05method;

import java.util.Scanner;

public class QuSimpleOperation {

	public static void main(String[] args) {
	/*
	 * 문제1) 파일명 : QuSimpleOperation.java
	   두개의 정수를 입력받아서 사칙연산의 결과를 출력하는 메서드와 main 메서드를 작성해보자.
	   단 나눗셈은 몫과 나머지를 각각 출력해야 한다.
	   인수(파라미터)로 전달되는 두 숫자는 모두 0 이상의 양의 정수이다.
	   메서드명 : arithmetic()
	   
	   덧셈결과 -> 177
	   뺄셈결과 -> 23
	   곱셈결과 -> 7700
	   나눗셈 몫 -> 1
	   나눗셈 나머지 -> 23
	 */
		arithmetic();
	}
	
	static void arithmetic() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫 번째 숫자를 입력하세요.");
		int num1 = scanner.nextInt();
		System.out.println("두 번째 숫자를 입력하세요.");
		int num2 = scanner.nextInt();
		int sum = num1 + num2;
		System.out.println("덧셈결과: " + sum);
		int sub = num1 - num2;
		System.out.println("뺄셈결과: " + sub);
		int mul = num1 * num2;
		System.out.println("곱셈결과: " + mul);
		int div = num1 / num2;
		System.out.println("나눗셈 몫: " + div);
		int remain = num1 % num2;
		System.out.println("나눗셈 몫: " + remain);
	
	}
}
