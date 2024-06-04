package ex08class;
/*
 시나리오]
 다음에 주어진 조건으로 '사람'을 추상화 하시오.
 - 속성: 이름, 나이, 에너지
 - 행동: 걷는다, 생각한다, 먹는다, 상태표현
 - 행동의 조건
 	1) 먹으면 에너지가 2 증가
 	2) 걸으면 에너지가 1 감소
 	3) 생각하면 에너지가 2 감소
 	4) 단, 에너지의 최대/최소 범위는 0~10으로 한다.
 	   무한히 먹을 수 없고, 에너지는 마이너스가 될 수 없기 때문
 */
public class Human {

	/*
	 * 멤버변수
	 * 객체의 속성을 표현한다.
	   나이의 경우 산술연산이 필요치 않다면 String 으로 설정해도 된다.
	   energy는 증감 연산이 필요하기 때문에 반드시 int type으로 설정해야 한다.
	 */
	String name;
	int age;
	int energy;
	
	// 멤버메서드: 객체의 동작을 표현한다.
	void walking() {
		/*
		 * '걷기'를 표현한 메서드
		 * 호출될 때마다 에너지를 1 차감한다..
		 * 만약 차감한 결과가 음수라면 해당 시나리오의 조건을 위배하므로 0으로 고정시킨다.
		 */
		energy--;
		if(energy < 0) {
			// 차감 후 만약 음수가 되면 0으로 고정시킨다.
			energy = 0;
			System.out.println("[walking]에너지는 0이 최소입니다.");
			System.out.println("0으로 고정됩니다.");
		}
		else {
			// 정상적으로 차감된 경우 메세지 출력
			System.out.println("[walking]에너지가 1 감소하였습니다.");
		}
	}
	// '생각'하는 것을 표현
	void thinking() {
		energy -= 2;
		if(energy < 0) {
			energy = 0;
			System.out.println("[thinking]에너지는 0이 최소입니다.");
			System.out.println("0으로 고정됩니다.");
		}
		else {
			System.out.println("[thinking]에너지가 2 감소하였습니다.");
		}
	}
	// '먹는것'을 표현. 2 증가후 10을 초과한다면 10으로 고정.
	void eating() {
		energy += 2;
		if(energy > 10) {
			energy = 10;
			System.out.println("[eating]에너지는 10이 최대입니다.");
		}
		else {
			System.out.println("[eating]에너지가 2 증가하였습니다.");
		}
	}
	// 인스턴스의 상태를 출력하는 멤버메서드
	void showState() {
		System.out.println("===님의 현재 상태는===");
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("에너지: " + energy);
		System.out.println("====================");
	}

} 
   