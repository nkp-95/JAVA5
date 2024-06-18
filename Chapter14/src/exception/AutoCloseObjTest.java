package exception;

public class AutoCloseObjTest {

	public static void main(String[] args) {
		// try-with-resources문 강제 예외 발생 (java7 부터)
		
		//java9 부터 추가된 문법
		AutoCloseObj obj = new AutoCloseObj();//9부터 밖으로 빼낼수 있게됨 전버전은 try() 괄호 안에 써야함
		
		try(obj){  //리소스 자동 클로즈 (무조건)  
			throw new Exception();  //강제예외 (throws 랑 다름)
		}catch(Exception e) {
			System.out.println("예외부분입니다."); //예외 출력
		}

	}

}
