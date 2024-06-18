package exception;

public class AutoCloseTest {

	public static void main(String[] args) {
		// try-with-resources문 사용하기
		try(AutoCloseObj obj = new AutoCloseObj()){  //try 부분에 괄호로 적어주면 finally 필요 X
			
		}catch(Exception e) {
			System.out.println("예외부분입니다.");
		}

	}

}
