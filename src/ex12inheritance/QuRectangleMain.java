/*
 * 정사각형을 의미하는 Square클래스와 직사각형을 의미하는 Rectangle클래스를 정의하고자 한다.
 * 그런데 정사각형은 직사각형의 일종이므로, 다음의 형태로 클래스의 상속관계를 구성하고자 한다.
 * 아래의 소스를 참조하여 구현하시오. 

 */

package ex12inheritance;

//직사각형을 표현한 클래스
class Rectangle {
	int width;
	int height;

	// Rectangle 클래스 생성자
	public Rectangle(int a, int b) {
		this.width = a;
		this.height = b;
	}

	public void showAreaInfo() {
		int area = width * height;
		System.out.printf("직사각형 면적: %d\n", area);
	}

} 
//정사각형을 표현한 클래스(정사각형은 직사각형의 일종)
class Square extends Rectangle {
	
	/*
	 * Square 생성자
	 * 정사각형은 모든 변의 길이가 같으므로 width와 height 대신 side로 설정하고,
	   super 키워드로 부모 클래스인 Rectangle 클래스의 생성자를 호출한 후
	   width와 height를 받아 동일한 값인 side로 초기화한다.
	 */
	public Square(int side) {
		super(side, side);
	}
	
	@Override
	public void showAreaInfo() {
		int area = width * height;
		System.out.printf("정사각형 면적: %d\n", area);
	}
}
public class QuRectangleMain {
	
	public static void main(String[] args) {
		Rectangle rec = new Rectangle(4, 3);
		rec.showAreaInfo();

		Square sqr = new Square(7);
		sqr.showAreaInfo();
	}

}

