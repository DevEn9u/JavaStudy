package ex18lambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class Ex06Define2Supplier {

	public static void main(String[] args) {
		/*
		 * Supplier<T>
		 - 공급자라는 의미
		 - 매개변수는 없지만 리턴값은 있는 get() 메서드가 정의되어 있다.
		 - 주로 데이터를 생성하여 리턴한다.
		 
		 interface Supplier<T> {
		 	T get();
		 }
		 
		 여기서 타입 매개변수 T는 추상메서드의 반환타입으로 지정된다.
		 */
		/*
		 * 타입 매개변수로 Integer 클래스를 사용했으므로 정수값을 반환받는 용도로
		   정의하겠다는 의미이다. 0 ~ 99 사이의 난수를 생w성한 후 반환하는 람다식으로
		   정의되어있다.
		 */
		Supplier<Integer> sup = () -> {
			Random random = new Random();
			return random.nextInt(100);
		};
		// 추상메서드인 get()을 통해 람다식을 호출한다.
		int rNum = sup.get();
		System.out.println("생성된 난수 = " + rNum);
		
		// 난수를 생성하는 람다식 sup과 정수 10을 인수로 전달한다.
		List<Integer> list = makeRandomNum(sup, 10);
		System.out.println("### print문으로 출력1 ###");
		System.out.println(list);
		
		/*
		quiz 1] List를 forEach문을 통해 출력하시오.
		 */
		System.out.println("### forEach문으로 출력2 ###");
		for(Integer li : list) {
			System.out.printf("%d ", li);
		}
		System.out.println();
		/*
		quiz2] List를 Iterator를 통해 출력하시오.
		 */
		System.out.println("### Iterator문으로 출력3 ###");
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			Integer li = itr.next();
			System.out.print(li + " ");
		}
	}
	
	/*
	 * 매개변수로 전달된 람다식을 통해 난수를 생성한다. 이때 cnt만큼 반복하므로
	   결국 난수 10개를 생성하여 List에 저장한 후 반환하게 된다.
	 */
	public static List<Integer> makeRandomNum(Supplier<Integer> s, int cnt) {
		// 정수를 저장하기 위한 List 생성
		List<Integer> li = new ArrayList<Integer>();
		for(int i = 1; i <= cnt; i++) {
			/*
			 * 람다식의 get() 호출을 통해 난수를 생성한 후 List에 추가한다.
			 */
			li.add(s.get());
		}
		// 10개의 난수가 저장된 List를 반환한다.
		return li;
	}
}
