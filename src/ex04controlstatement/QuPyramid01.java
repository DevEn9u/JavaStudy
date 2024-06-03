package ex04controlstatement;

/*
 * 문제2) 다음과 같은 모양을 출력하는 프로그램을 while문으로 작성하시오.
   *
   * *
   * * *
   * * * *
   * * * * *
 */
public class QuPyramid01 {

	public static void main(String[] args) {

		int i = 1;
		int j = 1;
		
		while(i < 6) {
			while(j <= i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			j = 1;
			i++;
		}
	}
}