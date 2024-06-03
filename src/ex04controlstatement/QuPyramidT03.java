package ex04controlstatement;

public class QuPyramidT03 {

	public static void main(String[] args) {
		// 행의 개수 지정
		int rows = 5;
		
		for(int i = 0; i < rows; i++) {
			// 공백 출력하기
			for(int j = 1; j < rows - i; j++) {
				// i가 증가함에 따라 j의 반복은 감소함
				System.out.print(" ");
			}
			
			// 출력하기. 조건의 일반식에 의해 1, 3, 5, 7,...이 생성된다.
			for(int k = 0; k < i * 2 + 1; k++) {
				System.out.print("*");
			}
			// 한 행 출력 후 줄바꿈
			System.out.println();
			
		}
	}
}