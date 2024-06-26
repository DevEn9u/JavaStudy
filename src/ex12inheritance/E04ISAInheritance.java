package ex12inheritance;

/*
 * Is-A 관계
 * X is a Y => X는 Y의 일종이다로 표현가능한 관계
 * 노트북은 컴퓨터의 일종이다.
 * 휴대폰은 전화기의 일종이다.
 * 이와 같이 Is-A 관계가 성립하는 객체를 상속으로 표현하기에 적합하다.
 * 따라서 실제 업무에서도 유사한 기능의 클래스들을 묶어서 정의한다.
 */

// 컴퓨터: 입력, 연산기능을 가진 컴퓨터
class Computer {
	// 멤버변수: 컴퓨터의 소유주
	String owner;
	
	// 생성자
	// public Computer() {}
	public Computer (String name) {
		owner = name;
	}
	/*
	 * private 접근 지정자로 선언된 멤버메서드는 외부클래스 혹은 상속받은 클래스에서
	   접근이 가능하므로, public으로 선언된 메서드를 통해 간접적으로 호출해야 한다.
	 */
	private void keyboardTouch() {
		System.out.println("키보드를 통해서 입력한");
	}
	private void calculate() {
		System.out.println("요청된 내용을 계산한다.");
	}
	/*
	 * private으로 선언된 멤버메서드를 외부에서 호출할 수 있도록 public으로 지정하여
	   선언하였다.
	   호출할 메서드의 순서까지 고려하여 정의하였으므로 "캡슐화(Encapsulation)"하고 있다.
	 */
	public void calculateFunc() {
		keyboardTouch(); // 입력 후에
		calculate(); // 계산을 수행한다.
	}
}

/*
 * Computer를 상속한 NotebookComputer
   컴퓨터가 가진 기본 연산 기능에 휴대성을 확장하여 정의한다.
   노트북은 전원이 없어도 사용할 수 있어야 하므로 배터리를 추가하여 정의하였다.
 */
class NotebookComputer extends Computer {
	// 자식클래스에 확장한 멤버변수
	int battery;
	
	// 생성자
	public NotebookComputer(String name, int initCharge) {
		/*
		 * 부모클래스의 생성자를 호출하기 위해 사용하는 super()는 생략할 수 있지만,
		   앞에 다른 문장이 먼저 기술되면 에러가 발생한다.
		   또한 여기서는 부모클래스에 default 생성자가 없는 상태이므로 생략하는 즉시
		   에러가 발생한다.
		 */
		super(name);
		battery = initCharge;
	}
	// 배터리 충전
	public void charging() {
		battery += 5;
	}
	// 휴대하면서 노트북을 사용하는 것을 표현
	public void movingCal() {
		// 사용전 배터리 잔량을 확인 후 사용여부 판단
		if(battery < 1) {
			System.out.println("배터리가 방전되어 사용불가");
			/*
			 * 메서드에서 아래와 같이 return을 만나게 되면 실행이 중지된다.
			 */
			return;
		}
		
		System.out.println("이동하면서 ");
		
		/*
		 * 아래 2개의 메서드는 private으로 선언되었으므로 상속을 받은 자식클래스에서도
		   접근할 수 없어 에러가 발생한다.
		   이 경우 public으로 선언된 메서드를 통해 호출해야 한다.
		 */
//		keyboardTouch(); // private이기 때문에 호출불가
//		calculate(); 	 // private이기 때문에 호출불가
		calculateFunc();
		
		// 사용하면 배터리는 1씩 차감
		battery -= 1;
		
	}
}
/*
 * 태블릿 노트북
   컴퓨터의 기본 연산기능, 노트북의 휴대이용에 더해 전용펜으로 드로잉 할 수 있는 기능까지
   추가된 컴퓨터
 */
class TabletNotebook extends NotebookComputer {
	// 태블릿 사용을 위한 펜슬을 표현한 멤버변수
	String registPencil;
	// 생성자
	public TabletNotebook (String name, int initCharge, String pen) {
		// 부모 인스턴스 생성을 위해 인수 2개를 전달한다.
		super(name, initCharge);
		// 1개는 자신의 멤버변수를 초기화한다.
		registPencil = pen;
	}
	// 태블릿 사용을 위한 배터리량 체크 및 등록된 펜인지 확인
	public void write(String penInfo) {
		// 배터리 잔량 확인
		if(battery < 1) {
			System.out.println("배터리가 방전되어 사용불가");
			return;
		}
		/*
		 * 등록된 펜인지 문자열비교를 통해 확인한다.
		   A.compareTo(B): 문자열 A와 B를 비교하여 0이 반환되면 동일한 문자열,
		   -1 혹은 1이 반환되면 다른 문자열로 판단하는 String 클래스에 정의된 메서드
		 */
		if(registPencil.compareTo(penInfo) != 0) {
			System.out.println("등록된 펜이 아닙니다.");
			return;
		}
		/*
		 * 부모클래스에 정의된 메서드를 super를 통해 호출한다.
		   상속받은 자식클래스에서는 이와 같이 부모의 멤버메서드를 호출하여 자신의 멤버처럼
		   사용할 수 있다. 단 접근이 가능한 접근지정자로 선언되어야 한다.
		   super는 생략할 수 있다.
		 */
		super.movingCal();
		System.out.println("스크린에 펜으로 그림을 그린다.");
		battery -= 1;
	}
}

public class E04ISAInheritance {

	public static void main(String[] args) {
		
		// 노트북 및 태블릿 인스턴스 생성
		NotebookComputer notebook = new NotebookComputer("공유", 5);
		TabletNotebook tablet = new TabletNotebook("이동욱", 5, "ISE-1234");
		
		System.out.println("==노트북 컴퓨터 사용==");
		notebook.movingCal();
		notebook.movingCal();
		notebook.movingCal();
		notebook.movingCal();
		notebook.movingCal();
		notebook.movingCal();// 배터리 모두 사용되어 사용 불가
		notebook.movingCal();
		notebook.movingCal();
		
		// 등록된 펜이므로 사용 가능
		System.out.println("==ISE-1234 펜으로 태블릿 사용==");
		tablet.write("ISE-1234");

		// 등록되지 않은 펜이므로 사용 불가
		System.out.println("==XYZ-9876 펜으로 태블릿 사용==");
		tablet.write("XYZ-9876");
	}

}
