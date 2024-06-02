package ex04controlstatement;

/*
 * 문제3) 다음과 같은 모양을 출력하는 프로그램을 for문으로 작성하시오.
         *
       * * *
     * * * * *
   * * * * * * *
 * * * * * * * * *
*/
public class QuPyramid03 {

	public static void main(String[] args) {
		int rows = 5;
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < rows - i - 1; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		
	}

}
