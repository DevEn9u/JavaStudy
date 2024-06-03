package ex04controlstatement;

public class QuPyramidT {

	public static void main(String[] args) {
		
		//for문 구현
		// i는 행을 반복
		for(int i = 1; i <= 5; i++) {
			// j는 열을 반복
			for(int j = 1; j <= 5; j++) {
				// i(행)의 개수만큼 j(열)를 출력한다.
				if(j <= i) {
					System.out.print("* ");					
				}
			}
			System.out.println();
		}
		
		System.out.println("======================");
		
		// while문 구현
		int i = 1;
		while(i <= 5) {
			int j = 1;
			// i번 만큼 반복해서 출력
			while(j <= i) {
				System.out.print("* ");
				j++;
			}
			System.out.println();
			j = 1;
			i++;
		}
	}
}