package ex05method;

/*문제4
 * 전달된 값이 소수인지 아닌지를 판단하여 소수인 경우 true를 아니면 false를
   반환하는 메서드를 정의하고, 이를 이용해서 1부터 100사이의 소수를 전부 출력하는
   main 메서드를 정의하자.
   
   메서드명 :  isPrimeNumber()
   소수란 : 특정 정수를 나눌수 있는것이 1과 자기 자신밖에 없는 수.
 */
public class QuFindPrimeNumber {

	public static void main(String[] args) {
		// 1 ~ 100까지의 정수 중 소수인지 판단하기 위해 반복 호출
		for(int i = 2; i <= 100; i++) {
			// 소수인지 판단하여 boolean을 return
			boolean result = isPrimeNumber(i);
			// 소수인 경우에만 콘솔 출력
			if(result == true) {
				System.out.printf(i + "은/는 소수입니다. %n");
			}
		}
	}
	
	static boolean isPrimeNumber(int n) {
		if (n <= 1) return false;
		for(int i = 2; i < n; i++) {
			if(n % i == 0) return false;
		}		
		return true;
	}	
}
