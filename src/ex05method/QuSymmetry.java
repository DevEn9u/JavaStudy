package ex05method;

public class QuSymmetry {
 
	public static void rotationSymmetry() {
		int x = 4;
		while(x >= 1) {
			// 행이 고정된 상태에서 열을 4번 반복
			for(int y = 1; y <= 4; y++) {
				if(x == y) {
					System.out.print("1 ");					
				}
				else {
					System.out.print("0 ");
				}
			}
			// 하나의 행이 출력되면 다음 행을 출력하기 위해 줄바꿈한다.
			System.out.println();
			x--;
		}
	}
	
	public static void main(String[] args) {
		rotationSymmetry();
	}
}