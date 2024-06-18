package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling3 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		//try-catch 문 사용하기
		try {
		fis = new FileInputStream("a.txt");
		
		//try(FileInputStream fis = new FileInputStream("a.txt")){
			
			
		} catch (FileNotFoundException e) {
			
			
			System.out.println(e.getMessage());
			return; //리턴이 있어도 finally 무조건 수행 후 빠져나감
			
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
