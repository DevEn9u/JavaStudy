package ex21jdbc.callable;

import java.sql.Types;

import ex21jdbc.crud.MyConnection;

public class DeleteProcCall extends MyConnection {
	
	public DeleteProcCall() {
		super("study", "1234");
	}
	
	@Override
	public void dbExecute() {
		try {
			// 프로시저 호출 및 파라미터 설정
			csmt = con.prepareCall("{call MyMemberDelete(?, ?)}");
			csmt.setString(1, inputValue("삭제할 아이디"));
			csmt.registerOutParameter(2, Types.VARCHAR);
			// 실행
			csmt.execute();
			System.out.println("삭제 Procedure 실행 결과 : ");
			// 실행결과는 두번째 파라미터를 통해 확인
			System.out.println(csmt.getString(2));
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			dbClose();
		}
	}
	
	public static void main(String[] args) {
		new DeleteProcCall().dbExecute();
	}

}
