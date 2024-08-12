package ex21jdbc.callable;

import java.sql.SQLException;
import java.sql.Types;

import ex21jdbc.crud.MyConnection;

public class InsertProcCall extends MyConnection {

	public InsertProcCall() {
		super("study", "1234");
	}
	
	@Override
	public void dbExecute() {
		try {
			/* 프로시저는 함수와는 다르게 반환값이 별도로 없으므로 호출시 좌측항이 필요하지 않다.
			 3개의 인파라미터와 1개의 아웃파라미터를 설정한다. */
			csmt = con.prepareCall("{call MyMemberInsert(?, ?, ?, ?)}");
			// Java에서 입력한 값으로 설정
			csmt.setString(1, inputValue("아이디"));
			csmt.setString(2, inputValue("패스워드"));
			csmt.setString(3, inputValue("이름"));
			// 아웃파라미터는 타입을 숫자로 지정
			csmt.registerOutParameter(4, Types.NUMERIC);
			// 프로시저 실행
			csmt.execute();
			// 아웃파라미터는 4번 인덱스이므로 값을 저장
			int affected = csmt.getInt(4);
			// 결과 확인
			if (affected == 0)
				System.out.println("오류발생 : 입력 실패");
			else 
				System.out.println(affected + "행 입력 성공");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			dbClose();
		}
	}
	
	public static void main(String[] args) {
		new InsertProcCall().dbExecute();
	}

}
