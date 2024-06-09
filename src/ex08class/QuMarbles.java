/*
 * 문제3) QuMarbles.java (난이도:상)
 * 구슬치기 하는 아이들을 추상화하여 클래스로 정의해보자.
 * 어린아이가 보유하고 있는 구슬의 개수 정보를 담는다
 * 놀이를 통해 구슬을 획득 또는 상실하는 것을 표현한다.
 * 어린이의 현재 보유하고 있는 구슬의 개수를 표현한다.
 * 초기화는 다음과 같이 진행한다.
 * ◆어린이1의 보유갯수 : 구슬 20개
 * ◆어린이2의 보유갯수 : 구슬 15개
  
 * 게임은 다음과 같이 진행한다.
 * ◆1차게임 : 어린이1은 어린이2의 구슬 5개를 획득한다.
 * ◆2차게임 : 어린이2는 어린이1의 구슬 9개를 획득한다.
 * # 어린이 객체를 생성시 구슬의 보유갯수는 생성자를 통해 초기화 되어야 한다.
 */

package ex08class;

class ChildProperty {
	int beads;

	public ChildProperty(int beads) {
		this.beads = beads;
	}
	
	public void showProperty() {
		System.out.println(beads);
	}
	
	public void obtainBead(ChildProperty friend, int beads) {
		/*
		 * 다른 Child 클래스의 구슬을 가져오는 조건문
		 * 상대 클래스의 구슬 개수가 매개변수보다 많을때만 실행하고, 실행될 경우
		   상대 클래스의 구슬 개수를 감소하고 자신의 구슬 개수를 증가시킨다.
		 */
		if (friend.beads >= beads) {
			friend.beads -= beads;
			this.beads += beads;
		} else {
			System.out.println("구슬이 부족합니다.");
		}
	}
	
}

public class QuMarbles {

	public static void main(String[] args) {
		ChildProperty child1 = new ChildProperty(20);
		ChildProperty child2 = new ChildProperty(15);

		System.out.println("게임 전 구슬의 보유 개수");
		System.out.print("어린이1 : ");
		child1.showProperty(); 
		System.out.print("어린이2 : ");
		child2.showProperty(); 

		/*1차게임 : 어린이1은 어린이2의 구슬 5개 획득*/
		child1.obtainBead(child2, 5);

		/*2차게임 : 어린이2가 어린이1의 구슬 9개 획득*/
		child2.obtainBead(child1, 9);

		System.out.println("\n게임 후 구슬의 보유 개수");
		System.out.print("어린이1 : ");
		child1.showProperty(); 
		System.out.print("어린이2 : ");
		child2.showProperty();


	}

}
