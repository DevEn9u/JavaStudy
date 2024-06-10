
package quiz;

public class QuUpgradeGuGu {

    public static void main(String[] args) {
        for (int i = 2; i < 10; i++) {
        	
            for (int j = 1; j < 10; j++) {
            	// Math.pow()는 거듭제곱의 값을 리턴하는 메서드
                int result = (int) Math.pow(i, j);
                
                // 처음값만 i X 1 = i로 나오게 하기
                if (j == 1) {
                    System.out.print(i + " X 1");
                }
                // 이후 거듭제곱 표현
                else {
                    System.out.print(i);
                    for (int k = 1; k < j; k++) {
                        System.out.print(" X " + i);
                    }
                }         
                System.out.println(" = " + result);
            }
            System.out.println();
        }
    }
}