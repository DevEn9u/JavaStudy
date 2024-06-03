package ex04controlstatement;

public class Qu3Or7Sum {

	public static void main(String[] args) {
		/*
		 * 문제1) 1~100까지의 숫자중 3의배수 이거나 7의배수인 숫자의 합을 구하는 프로그램을 while,
		   do~while, for문으로 각각 작성하시오. 단, 3과 7의 공배수인 경우 합에서 제외해야 한다.
		   출력의 결과는 누적되는 모든 수를 콘솔에 print한다. 하나의 파일에 한꺼번에 작성하므로
		   동일한 결과가 3번 출력됩니다.
		 */
		
		// while문
		System.out.println("### while문 ###");
		int total1 = 0;
		int k = 1;
		while(k <= 100) {
			// 3의 배수와 7의 배수는 or연산자로, 공배수인 21이 아닌 수는 And연산자로
			if((k % 3 == 0 ||  k % 7  == 0) && (k % 21 != 0 )) {
				total1 += k;
			}
			k++;
		}
		System.out.println("100이하의 자연수중 3과 7의 공배수를 제외한, "
				+ "3의 배수와 7의 배수의 합: " 
				+ total1);
		
		// do~while문
		System.out.println("### do~while문 ###");
		int total2 = 0;
		int j = 1;
		do {
			if((j % 3 == 0 ||  j % 7  == 0) && (j % 21 != 0 )) {
				total2 += j;
			}
			j++;
		} while (j <= 100);
		System.out.println("100이하의 자연수중 3과 7의 공배수를 제외한, "
				+ "3의 배수와 7의 배수의 합: " 
				+ total2);
		// for문
		System.out.println("### for문 ###");
		int total3 = 0;
		for(int i = 0; i <= 100; i++) {
			if((i % 3 == 0 ||  i % 7  == 0) && (i % 21 != 0 )) {
				total3 += i;
			}
		}
		System.out.println("100이하의 자연수중 3과 7의 공배수를 제외한, "
				+ "3의 배수와 7의 배수의 합: " 
				+ total3);
	}
}
