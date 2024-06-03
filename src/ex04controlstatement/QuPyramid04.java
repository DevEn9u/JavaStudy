package ex04controlstatement;

/*
 * 문제4) 다음과 같은 모양을 출력하는 프로그램을 while문으로 작성하시오.
  *
  * *
  * * *
  * * * *
  * * * * *
  * * * * 
  * * * 
  * * 
  * 
*/
public class QuPyramid04 {

	public static void main(String[] args) {
		for(int i = 0; i <= 4; i++ ) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
 		}
		for(int i = 3; i >= 0; i--) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
