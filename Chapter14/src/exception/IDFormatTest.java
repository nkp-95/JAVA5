package exception;

public class IDFormatTest {
	private String userID;

	public String getUserID() {
		return userID;
	}

	// 입력값 Validation 체크
	// 실무에선 다 넘어온다음에 체크
	public void setUserID(String userID) throws IDFormatException {
		if (userID == null) {
			throw new IDFormatException("아이디는 null 일수 없습니다.");
		} else if (userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("아이디는 8자 이상 20자 이하로 쓰세요.");
		}
		this.userID = userID;
	}

	public static void main(String[] args) {
		// 사용자 정의 예외 테스트
		IDFormatTest test = new IDFormatTest();
		
		// 아이디값이 null인경우
		String userID = null;

		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());  //상위 Exception 클래스의 get 메시지 가져옴
		}
		
		//아이디 값이 7자인 경우
		userID = "1234567";
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
		
//		userID = "12345678";    // 개인 테스트
//		try {
//			test.setUserID(userID);
//		} catch (IDFormatException e) {
//			System.out.println(e.getMessage());
//			
//		}System.out.println("O");
//		
		
	}

}
