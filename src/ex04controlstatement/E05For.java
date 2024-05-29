package ex04controlstatement;

/*
 * for문
 * while문과 같은 반복문으로 초기값, 조건식, 증감식이 한줄에 있어
   반복의 횟수를 명확히 알 수 있는 반복문.
 * 반복의 횟수가 정해져있는 경우 주로 사용.
 */
public class E05For {

	public static void main(String[] args) {
		
		// 변수 i가 1부터 5까지 1씩 증가하므로 5번 반복됨
		for(int i = 1; i <= 5; i++) {
			System.out.println("i = " + i);
		}
		
		/*
		 * 시나리오] 1~100까지의 함을 구하는 프로그램을 for문을 이용하여 작성하시오.
		 */
		// 누적합 저장용 변수 sum 선언 
		int sum = 0;
		// 1~100가지의 구간을 정한 후 변수를 1씩 증가
		for(int j = 1; j <= 100; j++) {
			// 증가하는 j를 누적해서 더해준다.
			sum += j;
		}
		System.out.println("1~100까지의 합: " + sum);
		
		/*
		 * 시나리오] for문을 이용하여 1~10까지의 정수중 2의 배수의 합을 구하는 프로그램을 작성하시오.
		 */
		/*
		 * 방법 1] 1~10까지 10번 반복해서 if문을 통해 2의 배수를 찾은 후 누적해서 더한다.
		 */
		int total = 0;
		for(int i = 1; i <= 10; i++) {
			// 2의 배수인지 확인
			if(i % 2 == 0) {
				// 2의 배수일때만 누적해서 더한다.
				total += i;
			}
		}
		System.out.println("1~10까지의 수중 2의 배수의 합(방법1): " + total);
		
		/*
		 * 방법 2] if 문 없이 초기값을 0으로 시작해서 2씩 증가시켜 더하는 방법
		 */
		total = 0;
		for(int i = 1; i <= 10; i += 2) {
			total += i;
		}
		System.out.println("1~10까지의 수중 2의 배수의 합(방법2): " + total);
		
		// for문으로 반복문을 만들 때는 (;;)와 같이 표현한다.
		// while(true)와 동일한 표현이다.
		int a = 1;
		for(;;) {
			System.out.println("for문으로 만든 무한루프입니다." + a);
			a++;
			/* 
			 * 루프 내에서 a를 증가시키고 1000이 되면 반복문을 탈출한다.
			 * 반복문에서 break를 만나면 즉시 탈출하게 된다.
			 */
			if(a==1000) break;
		}
		
		/*
		 * for문의 끝에 ;을 사용하면 반복할 문장이 없는 것으로 간주되어
		   for문과 상관없이 한 번만 실행된다. 즉 잘못된 문장.
		 */
		for(int j = 0; j <= 5; j++) {
			System.out.println("나는 누구..? 여긴 어디..?");
		}
		
		/* 
		 * for문의 초기식에서 선언된 변수 j는 for문이 종료되는 순간 메모리에서 소멸된다.
		   여기서 사용된 변수 j는 지역변수(local variables)라고 한다.
		   지역변수는 해당 지역(블럭)을 벗어나면 메모리에서 소멸되는 특징을 가지고 있다.
		 */
		// for문의 블럭을 벗어나면 변수 j는 메모리에서 소멸되므로 에러가 발생한다.
//		System.out.println("위 for문에서 선언한 변수 j= " + j);
		System.out.println("위 main함수 지역에서 선언한 변수 total= " + total);
		
		/*
		 * 초기값, 조건, 증감식을 분리해서 외부(더 넓은 지역, 여기서는 main 메서드 지역)에서 선언하면
		   해당 변수는 for문의 안쪽(좁은지역)에서 사용할 수 있다.
		   즉 알대에 선언한 변수 i는 main 메서드의 지역변수로 선언된다. 
		 */
		int i = 0 ;
		for( ; i <= 5; i++) {
			System.out.println("for문 안에서의 i값 = " + i);
		}
		System.out.println("for문 밖에서의 i값 = " + i);
		/*
		 * Java에서는 중괄호가 나오면 하나의 지역이라 생각하면 된다.
		 * 즉 if문, while문 등의 제어문도 하나의 지역을 형성하게 된다.
		 */
		
		/*
		 * 연습문제1] 구구단을 출력하는 프로그램을 for문으로 작성하시오.
		 */
		// 단에 해당하는 for문
		for(int dan = 2; dan <= 9; dan++) {
			System.out.println(dan + "단");
			for(int su = 1; su <= 9; su++) {
				// 출력은 되지만 정확한 정렬은 되지 않는다.
//				System.out.print(dan + "*" + su + "=" + dan*su);
				
				// 서식문자를 통해 칸을 미리 확보하여 정렬해서 출력한다.
				System.out.printf("%dx%d=%2d", dan, su, dan*su);
				//각 항목을 구분하기 위해 띄어쓰기
				System.out.print(" ");
			}
			// 하나의 단을 모두 출력한 후 줄바꿈 처리
			System.out.println();
		}
	}
}


