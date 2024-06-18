package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		//try-catch 문 사용하기
		try {
		fis = new FileInputStream("a.txt");
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();  //실무에선 X  개발시점에만 오류찾기위해 사용
			System.out.println(e.getMessage());
		}finally {  //무조건 수행
			if(fis != null) {
				try {
					fis.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println("항상 수행 됩니다.");
		}
		
		System.out.println("여기까지도 수행 됩니다.");
		
	}
}
