package ex12inheritance;

// 자식클래스
public class DeChild extends DeParent {
	// 멤버변수
	String stNumber;
	
	// 생성자
	public DeChild(String name, int age, String stNumber) {
		/*
		 * 자식은 부모의 생성자 호출을 통해 먼저 부모인스턴스를 생성한 후
		   자신의 인스턴스를 생성해야 한다.
		 */
		super(name, age);
		this.stNumber = stNumber;
	}
	/*
	 * 자식클래스에서 확장한 메서드로 부모클래스에는 정의되어 있지 않다.
	 */
	public void study() {
		/*
		 * 부모의 멤버변수 name은 private이므로 자식에서는 getter를
		   통해 값을 반환받아야 한다.
		 */
		System.out.println(getName() + "이(가) 공부한다.");
		// 아래와 같이 직접 접근하면 에러가 발생한다.
//		System.out.println(name() + "이(가) 공부한다.");
	}
	/*
	 * 오버라이딩 아님: 부모클래스에서 private멤버로 선언했으므로
	   자식쪽에서는 보이지 않아 오버라이딩의 대상이 될 수 없다.
	   해당 메서드는 자식쪽에서 새롭게 확장한 메서드가 된다.
	 */
	private void eat() {
		System.out.println("학생이 먹는다.");
	}
	/*
	 * 메서드 오버라이딩의 조건
	   1) 부모크래스에서 선언될 때와 비교해서 접근지정자 범위가 동일하거나
	   더 넓으면 가능하다.
	   2) 부모에서 default로 선언하면 자식에서는 default 혹은 그보다
	   넓은 public으로 선언하면 오버라이딩이 성립한다.
	 * 여기서 부모인 DeParent 클래스에서 String sleep()으로 선언되었으므로
	   자식인 DeChild 클래스에서는 default or public으로 선언하면 된다.
	 */
	@Override
	public String sleep() {
		System.out.println("학생이 잔다.");
		return null;
	}
	/*
	 * 메서드의 형태가 부모쪽과는 다르므로 오버라이딩이 될 수 없다.
	   이 경우는 오버로딩으로 자식쪽서 확장한 메서드가 된다.
	 */
	public int walk(int age) {
		System.out.println("나이가 " + age + "살인 학생이 산책한다.");
		return 0;
	}
	// 오버라이딩 정의. 메서드의 형태가 완전 동일함.
	@Override
	public void exercise() {
		System.out.println("학생이 운동한다.");
	}
	
	// 오버라이딩 정의
	@Override
	public void printParent() {
		/*
		 * super의 두가지 활용법
		   1) super(): 부모클래스의 생성자를 호출한다.
		   2) super.멤버: 부모의 멤버변수 혹은 멤버메서드를 호출한다.
		 */
		super.printParent();
		System.out.printf(", 학번: %s\n", stNumber);
	}
	/*
	 * static(정적) 메서드는 오버라이딩의 대상이 될 수 없다.
	   클래스 외부(메서드영역)에 별도로 로드되므로 오버라이딩이 되지 않고
	   호출시 각 클래스명을 통해 접근할 수 있다.
	 */
	public static void staticMethod() {
		System.out.println("학생의 정적메서드");
	}
}
