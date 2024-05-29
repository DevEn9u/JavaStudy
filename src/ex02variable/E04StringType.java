package ex02variable;

public class E04StringType {

	public static void main(String[] args) {

		/*
		 * String 클래스: 참조형 변수로 기본자료형이 아닌 클래스이다.
		   문자열을 저장하고 조작하는 기능을 가짐
		   Java에서는 문자열을 표현할 때 double quotation으로 감싸주면 되고 연결시 '+'기호 사용.
		 */
		int number;
		number = 99;
		
		/*
		 * 클래스를 통해 생성한 참조형 변수와 기본 자료형 사이에서는 형변환이 불가하다.
		 * 서로 사용하는 메모리 공간이 다르기 때문이다.
		 * 기본자료형: Stack 영역을 사용한다.
		 * 참조형(클래스) 변수: Heap 영역을 사용한다.
		 * 메모리 공간은 코드, 데이터, 스탭, 힙 4가지 영역이 있다.
		 */
		
		// 아래 두 개의 문장은 에러 발생
//		int stringNumber1 = (int)"100";
//		String stringNumber2 = (String)100;
		
		// String + int = > 단순 연결돼서 출력된다.
		String strNumber = "100";
		System.out.println(strNumber + number);

		// String은 클래스이므로 new 키워드를 사용해서 변수 생성 가능.
		String newString = new String("new 키워드 사용");
		System.out.println(newString);
		
		// String 변수는 주로 double quotaion을 사용해서 생성
		String stringBasic = "클래스지만";
		String plusString = "기본자료형처럼 사용";
		// + 기호는 문자열을 연결하는 기능으로 사용됨 
		System.out.println(stringBasic +" "+ plusString);
		
		/*
		 * 문자열 + 정수: 우선순위가 없다면 일반적으로 문자열로 출력된다.
		   단 산술연산의 결과를 출력하고 싶다면 아래와 같이 소괄호로 묶어 우선순위에 대한 변화를 주면된다.
		 */
		int kor=100, eng=99, math=98;
		System.out.println("총점: "+kor+eng+math); // 총점: 10009998
		System.out.println("총점: "+(kor+eng+math)); // 총점: 297
	}

}
