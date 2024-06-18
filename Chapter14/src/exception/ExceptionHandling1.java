package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		//try-catch 문 사용하기
		try {
			FileInputStream fis = new FileInputStream("a.txt");
			if(fis != null) {
				try {
					fis.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();  //실무에선 X  개발시점에만 오류찾기위해 사용
			System.out.println(e.getMessage());
		}
		
		System.out.println("여기까지도 수행 됩니다.");
		
	}
}
