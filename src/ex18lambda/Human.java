package ex18lambda;

public class Human {
	// 멤버변수: 이름, 성별, 점수
	private String name;
	private String gender;
	int score;
	/* 자동생성메뉴(alt + shift + s)로 생성한 생성자
	 * 참고: 매개변수가 없는 생성자를 default 생성자라고 하고
	   아래처럼 매개변수가 있는 생성자를 인자생성자라고 한다. 
	 */
	public Human(String name, String gender, int score) {
		/*
		 * extends Object가 생략되어 있는 것을 기억해라.
		 * super()는 Object class를 상속해서 생기는 것이고
		   안쓰는게 더 좋음!
		 */
//		super();
		this.name = name;
		this.gender = gender;
		this.score = score;
	}
	// 아래 getter와 setter를 alt + shift + s 로 자동생성
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
}
