package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
		//메서드
	public Class loadClass(String fileName, String className) throws 
			FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
	}
	
	public static void main(String[] args) {
		//throws 로 예외 미루기
		ThrowsException test = new ThrowsException();  //인스턴스
//		try {
//			test.loadClass("a.txt", "java.lang.String");
//		} catch (FileNotFoundException | ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		try {    //실무
			test.loadClass("a.txt", "java.lang.String");
//		}catch(Exception e){
//			e.printStackTrace();  //얘가 상황 안가리고 오류 다잡아버림 뒤 상황이 제어 불가
			
		} catch (FileNotFoundException e) {   //예외 각 상황마다 다른방식 처리 가능
			e.printStackTrace();
		} catch (ClassNotFoundException e) {  //예외 각 상황마다 다른방식 처리 가능
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();  // 여기에 둬야 정해진 예외 상황 이외의 오류 잡을수 있음
		}
	}
}
