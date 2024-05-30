package ex05method;

public class E08RecursiveError {

	public static void main(String[] args) {
		showHi(3);
	}
	public static void showHi(int cnt) {
		System.out.println("Hi~!");
		System.out.println("cnt = " + cnt);
		/*
		 * 해당 위치에서 에러 발생.
		 * if문 상단에서 재귀호출되기 때문에 if문 블럭이 실행되지 않는다.
		 * 따라서 if문 하단에서 호출한다.
		 */
//		showHi(--cnt);
		if(cnt == 1) {
			return;
		}
		showHi(--cnt);
	}
	/*
	 * StackOverflor: 스택오버플로우 에러
	 * 스택은 함수가 종료되기 전까지의 모든 정보를 정하는 메모리이다.
	 * 무한한 공간이 아니므로 무한루프에 빠지게 되면 저장 능력을 초과해서 해당 예외가 발생한다.
	 */
}
