package ex13interface;

/*
 * 추상클래스
 - 상속을 목적으로 제작되므로 인스턴스 생성은 허용되지 않는다.
 - 추상클래스는 대부분 추상메서드를 포함하고 있으므로, 이를 상속받는 클래스는
   반드시 추상메서드를 오버라이딩해야 한다.
 - 클래스의 상속관계에서 설계도와 같은 역할을 한다.
 - 인스턴스 생성은 할 수 없지만 그 외 참조변수 선언, 상속등의 모든 기능을
   사용할 수 있다.
   
  * 추상메서드
  - 오버라이딩을 목적으로 선언한다.
  - 메서드의 실헁부가 없으므로 중괄호 대신 세미콜론으로 마무리한다.
 */

// 추상클래스1 : 추상메서드를 포함하지 않은 클래스
abstract class AbsClass1 {
	// int형으로 표현할 수 있는 최대값을 표현한 정적 상수
	public static final int MAX_INT = Integer.MAX_VALUE;
	// 인스턴스 멤버메서드
	void instanceMethod() {}
	// 정적메서드
	static void staticMethod() {}
}

/*
 * 추상메서드를 포함하지 않은 추상클래스를 상속하면 오버라이딩은 강제사항이
   아닌 선택사항이 된다. 즉 필요한 경우에는 오버라이딩하면 된다.
   현재 오버라이딩 된 메서드는 삭제해도 에러가 발생하지 않는다.
 */
class AbsClassChild1 extends AbsClass1 {
	@Override
	void instanceMethod() {
		System.out.println("선택적 오버라이딩");
	}
}


/*
 * 추상클래스 2 : 추상메서드를 포함한 클래스. 추상 메서드를 멤버로 표현한
   클래스는 반드시 abstract로 선언해야 한다. 그렇지 않으면 에러가 발생한다.
    ↳ 자바의 규칙이다.
 */
abstract class AbsClass2 {
/*
 * void absMethod(int number) {} 처럼 실행부 없이 메서드를 선언하려면 아래처럼
   abstract 키워드를 붙이고, 추상메서드가 1개 이상인 경우에는 해당 클래스에도
   abstract를 붙여야 한다.
 */
	/*
	 * 추상메서드는 실행부가 없으므로 {} 를 기술하지 않는다.
	   오버라이딩을 목적으로 생성한다.
	 */
	abstract void absMethod(int number);
}
/*
 * 위 클래스를 상속하면 부모가 가진 추상메서드를 그대로 상속받게 되므로
   해당 클래스도 abstract로 선언해야 한다.
   단 이 경우 해당 클래스로도 인스턴스를 생성할 수 없게 된다.
   따라서 인스턴스 생성을 위해서는 부모의 추상메서드를 자식쪽에서 필수로
   오버라이딩을 해야한다.
 */
class AbsClassChild2 extends AbsClass2 {
	/*
	 * 오버라이딩은 부모쪽의 메서드를 가리고, 새로운 기능을 재정의하는 것이므로
	   자식 클래스는 추상메서드를 포함하지 않는 상태가 된다.
	   따라서 인스턴스 생성을 할 수 있다.
	 * 오버라이딩된 메서드를 삭제하면 에러가 발생한다.
	 */
	@Override
	void absMethod(int number) {
		System.out.println("필수적 오버라이딩");
	}
	void newMethod() {
		System.out.println("확장한 메서드");
	}
}


public class E01AbstractMain {

	public static void main(String[] args) {
		// 추상클래스는 인스턴스 생성을 할 수 없다.
//		AbsClass1 absClass1 = new AbsClass1(); 
		
		// 추상클래스를 상속한 하위클래스는 인스턴스 생성을 할 수 있다.
		AbsClassChild1 absClassChild1 = new AbsClassChild1();
		
		/*
		 * 추상클래스는 인스턴스 생성은 할 수 없지만 참조변수로 사용할 수 있다.
		 * 부모타입의 참조변스로 자식 인스턴스를 참조한다.
		 */
		AbsClass2 absClass2 = new AbsClassChild2();
		/* 
		 * 부모타입인 absClass2의 absMethod는 부모쪽의 멤버 메서드를 호출할 수
		   있지만 오버라이딩 되었으므로 실제로 실행되는 것은 자식 클래스의
		   멤버 메서드인 absMethod(int number)가 실행된다. 
		 */
		absClass2.absMethod(100);
		/*
		 * 부모타입의 참조변수인 absClass2로 자식영역에 접근은 불가능하므로,
		   접근을 위해 자식 타입으로 다운캐스팅 해야 한다. 
		 */
		((AbsClassChild2)absClass2).newMethod();
		
		/*
		 * 추상클래스내에 선언된 정적메서드는 오버라이딩의 대상이 될 수 없으므로
		   static의 기본 규칙을 따른다. 인스턴스 생성엉ㅄ이 단지 클래스명으로
		   접근하여 호출할 수 있다.
		   static 메서드는 메모리의 메서드영역에 저장된다.
		 */
		AbsClass1.staticMethod();
		AbsClassChild1.staticMethod();
		System.out.println("int형의 최대값: " + AbsClass1.MAX_INT);
	}

}
