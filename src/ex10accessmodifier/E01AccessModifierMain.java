package ex10accessmodifier;

// 이 클래스는 sub패키지에 정의되었으므로 사용을 위해서는 반드시 import 해야 함.
import ex10accessmodifier.sub.E01AccessModifier2;

public class E01AccessModifierMain {

	public static void main(String[] args) {

		System.out.println("E01AccessModifier1 객체 생성 및 접근");
		
		/*
		 * 동일한 패키지에 선언된 클래스이므로 import 없이 인스턴스를 생성할 수 있다.
		 */
		E01AccessModifier1 one = new E01AccessModifier1();
		
		/*
		 * private으로 선언된 멤버는 동일 패키지에 선언하더라도 접근할 수 없다.
		 * 동일한 클래스 내에서만 접근을 허용한다.
		 */
//		System.out.println("one.privateVar = " + one.privateVar);
		// 동일한 패키지이므로 접근 가능
		System.out.println("one.defaultVar = " + one.defaultVar);
		// 접근법위가 없으므로 어디서든 접근 가능
		System.out.println("one.publicVar = " + one.publicVar);
		
		
		// 멤버 메서드도 접근 범위는 멤버변수와 동일하다.
//		one.privateMethod();
		one.defaultMethod();
		one.publicMethod();
		
		// 동일한 패키지에 선언된 클래스이므로 import 없이 인스턴스 생성이 가능하다.
		System.out.println("DefaultClass 객체 생성 및 접근");
		new DefaultClass1().myFunc();
		
		//////////////////////////////////////////////////
		
		E01AccessModifier2 two = new E01AccessModifier2();
		
		System.out.println("E01AccessModifier2 객체 생성 및 접근");
		
		/*
		 * 다른 패키지에 선언된 클래스이므로 인스턴스 생성을 위해 import 선언을 해야한다.
		   import 선언시 접근할 수 있는 것은 public이고, private과 default는
		   접근할 수 없다.
		 */
		// private은 동일한 클래스 내에서만 접근 허용
//		System.out.println("two.privateVar = " + two.privateVar); //에러발생
		// default는 동일한 패키지 내에서만 접근 허용 
//		System.out.println("two.defaultVar = " + two.defaultVar); //에러발생
		System.out.println("two.publicVar = " + two.publicVar);
		
//		two.privateMethod(); //에러발생
//		two.defaultMethod(); //에러발생
		two.publicMethod();
		
		/*
		 * 다른 패키지에 선언된 default 클래스이므로 인스턴스 생성이 불가능하다.
		 * 또한 import 자체도 불가능하므로 아예 사용할 수 없는 클래스가 된다.
		 */
		System.out.println("DefaultClass 객체 생성 및 접근");
//		new DefaultClass2().myFunc(); //에러발생
	}

}
