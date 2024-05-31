package ex07string;

import java.util.Scanner;

public class E02StringMethod4 {

	public static void main(String[] args) {
		/*
		시나리오1] 주민등록번호를 이용하여 성별을 판단하는
		프로그램을 charAt()을 이용해서 작성하시오.
		190419-3000000 => 남자
		190419-4000000 => 여자
		*/
		System.out.println("### 시나리오 1 ###");
		String ssn1 = "190419-3000000";
		String ssn2 = "190419-4000000";
		System.out.println(ssn1.charAt(7) == '3' ? "남자입니다." : "여자입니다.");
		System.out.println(ssn2.charAt(7) == '3' ? "남자입니다." : "여자입니다.");
		
		// 입력받아보기
//		System.out.println("주민등록번호를 입력해주세요.");
//		Scanner scanner = new Scanner(System.in);
//		String ssn3;
//		ssn3 = scanner.nextLine();
//		System.out.println(ssn3.charAt(7) == '3' ? "남자입니다." : "여자입니다.");
		
		/*
		시나리오2] 해당 문자열이 이메일 형식인지 검사하는
		프로그램을 contains()를 이용해서 작성하시오.
		hong@daum.net => 이메일형식임
		not@naver => 이메일형식이아님
		*/
		System.out.println("### 시나리오 2 ###");
		String email1 = "hong@daum.net";
		String email2 = "not@naver";
//		System.out.println(email1.contains(".") ?
//				"이메일입니다." : "이메일이 아닙니다.");
//		System.out.println(email2.contains(".") ?
//				"이메일입니다." : "이메일이 아닙니다.");
		System.out.println(email1.contains("@") && email1.contains(".") ?
				"이메일 형식 맞음" : "이메일 형식 아님");
		
		/*
		시나리오3]주민등록번호로 성별을 구분하는 프로그램을 indexOf()와 charAt()을 
		이용해서 작성하시오.
		하이픈의 위치를 먼저 찾은 후 성별에 해당하는 문자를 추출한다.
		*/
		System.out.println("### 시나리오 3 ###");
		System.out.println("주민등록번호: " + ssn1);
		int hype = ssn1.indexOf("-") + 1;
		System.out.println(hype);
		System.out.println(ssn1.charAt(hype) == '3' ?
				"남자입니다." : "여자입니다.");
		
		/*
		시나리오4] 다음 파일명에서 확장자를 잘라내는 프로그램을
		작성하시오. 
		파일명 : my.file.images.jpg
		*/
		System.out.println("### 시나리오 4 ###");
		String fileName = "my.file.images.jpg";
		// 확장자의 index를 구하고 변수에 할당한다.
		System.out.println("파일명: " + fileName);
		int toDelete = fileName.lastIndexOf(".jpg");
		// substring()을 이용해 종료지점을 확장자 index를 담은 변수로 지정하고 잘라낸다.
		System.out.println("잘라낸 파일명: " +
				fileName.substring(0, toDelete));
	}

}
