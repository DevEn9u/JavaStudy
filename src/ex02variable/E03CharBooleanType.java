package ex02variable;

public class E03CharBooleanType {

	public static void main(String[] args) {
		
		/*
		 * char형: 하나의 문자를 저장할 수 있는 자료형으로 값을 저장할 때 ''(single quotation)으로
		   감싸서 표현한다.
		   만약 ""(Double quotation)으로 감싸면 문자열로 인식하므로 String으로 선언해야 한다.
		 */
		char ch1 = '가';
		// 문자열이므로 char로 선언할 수 없다.
//		char chStr = '가나다라';
		// 문자열이므로 String으로 선언하고 double quotation으로 감싸서 표현한다.
		String chStr = "가나다라";
		System.out.println("ch1="+ ch1);;
		System.out.println("chStr="+ chStr);
		
		/*
		 * ASCII 코드: 1byte로 표현할 수 있는 문자로 영문, 숫자를 십진수로 정의한 것
		 * ex) A => 65, a = > 97로 표현
		 * 유니코드: 1byte로 표현할 수 없는 문자로 영문과 숫자를 제외한 모든 문자(한글, 한자 등)를 2byte로 표현.
		   보통 숫자가 크기 때문에 16진수로 표현.
		 */
		// 메모리에 65로 저장된다.
		char ch2 = 'A';
		// 정수형 변수를 선언 및 초기화한다. 
		int num1 = 2;
		// 문자 + 정수 => 아스키코드로 저장되므로 연산 가능
		int num2 = ch2 + num1;
		// 정수로 출력하면 65 + 2, 67이 된다.
		System.out.println("num2=" + num2);
		// 문자로 출력하면 C가 된다.
		System.out.println("(char)num2= "+ (char)num2);
		
		/*
		 * (char)(char + int => int) => char형 + int형은 int형이 더 커서 int형이 되나
		   (char)로 char형으로 강제형변환
		 */
		char ch3 = (char)(ch2+num1);
		System.out.println("ch3(문자출력)=> " + ch3);
		System.out.println("ch3(아스키코드출력)=> " + (int)ch3);
		
		// single quotation으로 감쌌기 때문에 문자1(ASCII: 49)이 할당된다.
		char ch4 = '1';
		// 연산결과는 50이고 이에 해당하는 문자는 '2'가 된다.
		char ch4_1 = '1' + 1;
		// ch4_1는 문자 '2'와 숫자 50이 출력된다.
		System.out.println("ch4=" + ch4 + ", ch4_1="+ ch4_1 +", ch4_1="+ (int)ch4_1);
		
		/*
		 * boolean 타입: true 혹은 false 두 가지중 하나의 값만 가질 수 있는 자료형
		   산술연산(+, -), 비교연산(<, >=)에서는 사용할 수 없고 논리연산에서만 사용 가능
		 */
		boolean bn1 = true;
		boolean bn2 = false;
		System.out.println("bn1=" + bn1 +", bn2=" + bn2);
		
		/*
		 * 논리연산자
		 * &&(논리And): 엠퍼센트를 사용하고 양쪽 모두 참일때만 참을 반환, 그 외에는 모두 거짓 반환
		 * ||(논리Or): 파이프를 사용하고 둘 중 하나만 참이어도 참을 반환, 둘 다 거짓일 때는 거짓 반환
		 */
		// T && F => false 반환
		boolean bn3 = bn1 && bn2;
		System.out.println("bn(And)=" + bn3);;
		// T || F = > true 반환
		bn3 = bn1 || bn2;
		System.out.println("bn3(0r)="+ bn3);
		
		// 문자 '가'는 ASCII 코드 44032로 표현되므로 true 반환
		bn3 = '가' > 30000;
		System.out.println("bn3=" + bn3);
	}

}
