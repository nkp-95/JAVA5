package exception;

public class AutoCloseObj implements AutoCloseable{

	@Override
	public void close() throws Exception {
		
		System.out.println("리소스가 자동 Close() 됩니다.");
	}
}
