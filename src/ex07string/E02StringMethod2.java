package ex07string;

public class E02StringMethod2 {

	public static void main(String[] args) {
		
		System.out.println("String 클래스의 주요 메서드 2");
		
		String str1 = "Welcome to java";
		String str2 = "자바야 놀자!";
		
		/*
		 6] codePointAt(): 문자열의 특정 인덱스의 문자를 찾은 후
		 	ASCII 코드(혹은 유니코드)로 반환한다.
		 */
		System.out.println("### 6 ###");
		// 대문자 W: 87
		System.out.println("str1 첫 번째 문자의 ASCII 코드: "+ 
				str1.codePointAt(0));
		// 한글 '야': 50556
		System.out.println("str2 세 번째 문자의 ASCII 코드: "+ 
				str2.codePointAt(2));
		
		/*
		 7] endsWith(): 특정 문자열로 끝나면 true를 반환
		 8] startsWith(): 특정 문자열로 시작하면 true를 반환
		 */
		System.out.println("### 7, 8 ###");
		System.out.println("www.daum.net".endsWith("net"));
		System.out.println("naver.com".startsWith("http"));
		
		/*
		 9] format(): 출력형실을 짖어하여 문자열로 반환할 때 사용한다.
		 	printf()와 사용법은 동일하고, 주로 웹앱 제작에 사용된다.
		 */
		System.out.println("### 9 ###");
		System.out.printf("국어: %d, 영어: %d, 수학: %d\n", 81, 92, 100);
		
		// 차후 웹앱 제작에서 이와 같이 처리하여 웹브라우저에 출력한다.
		String formatStr = String.format("국어: %d, 영어: %d, 수학: %d\n",
				81, 92, 100);
		System.out.println(formatStr);
		
		/*
		 10] indexOf(): 문자열에서 특정 문자열의 시작인덱스를 반환한다.
			 만약 존재하지 않으면 -1을 반환한다.
			 인덱스는 항상 0부터 시작하므로 -1은 해당 문자열이 없음을 의미한다.
		 */
		System.out.println("### 10 ###");
		String email1 = "hong@daum.net";
		System.out.println(str1.indexOf("ava")); // 12
		System.out.println(str1.indexOf("J")); // -1
		System.out.println((email1.indexOf("@") != -1) ?
				"이메일 형식 맞음" : "이메일 형식 아님");
		
	}

}
