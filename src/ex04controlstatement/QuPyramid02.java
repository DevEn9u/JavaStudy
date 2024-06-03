package ex04controlstatement;
/*
 * 문제2) 다음과 같은 모양을 출력하는 프로그램을 do~while문으로 작성하시오.
   * * * * *
   * * * *
   * * *
   * *
   *
 */
public class QuPyramid02 {

	public static void main(String[] args) {

		int i = 0;
		int j = 0;
		do {
			i++;
			j = i;
			do {
				System.out.print("*");
				j++;
			} while(j < 6);
			System.out.println();
		}
		while(i < 5);	
	}
}
