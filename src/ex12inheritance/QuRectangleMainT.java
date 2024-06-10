/*
 * 정사각형을 의미하는 Square클래스와 직사각형을 의미하는 Rectangle클래스를 정의하고자 한다.
 * 그런데 정사각형은 직사각형의 일종이므로, 다음의 형태로 클래스의 상속관계를 구성하고자 한다.
 * 아래의 소스를 참조하여 구현하시오. 

 */

package ex12inheritance;

// 직사각형을 표현한 클래스
class Rectangle1 {
	// 멤버변수: 가로, 세로 길이를 표현
	int width;
	int height;

	// Rectangle 클래스 생성자
	public Rectangle1(int width, int height) {
		this.width = width;
		this.height = height;
	}

	// 넓이를 출력하는 멤버메서드
	public void showAreaInfo() {
		// 멤버변수 사용시 this는 항상 붙이도록 한다.
		System.out.println("직사각형 면적: " + (this.width * this.height));
	}
} 
//정사각형을 표현한 클래스(정사각형은 직사각형의 일종)
class Square1 extends Rectangle1 {
	/*
	 * 직사각형은 가로, 세로 두 변의 길이가 서로 다르므로 2개의 멤버변수가
	   필요하다.
	   하지만 정사각형은 길이가 동일하므로 1개의 값으로 2개의 멤버변수를
	   초기화할 수 있다.
	   즉 해당 클래스는 멤버변수의 확장이 필요하지 않다.
	 */
	public Square1(int w) {
		super(w, w);
	}
	
	@Override
	public void showAreaInfo() {
		// 부모의 멤버변수를 통해 사각형의 넓이를 계산한다.
		System.out.println("정사각형 면적: " + (super.width * super.height));
	}
}
public class QuRectangleMainT {
	
	public static void main(String[] args) {
		// 부모클래스의 인스턴스(직사각형)
		Rectangle1 rec = new Rectangle1(4, 3);
		rec.showAreaInfo();

		// 자식클래스의 인스턴스
		Square1 sqr = new Square1(7);
		sqr.showAreaInfo();
	}

}

