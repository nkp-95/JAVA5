package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ArrayExceptionHandling {

	public static void main(String[] args) throws FileNotFoundException {  //throws FileNotFoundException 위로 던져서 오류 발생시 위에서 오류 처리(오류메시지)
		int[] arr = new int[5];
		
		try {
			for(int i=0; i<=5; i++) {  //i<=5오류   i<5 정상   예외처리
				arr[i] = i;
				System.out.println(arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
			System.out.println("########################### 예외처리부분");
		}
		
		System.out.println("계속되는 작업");
		System.out.println("프로그램 종료");
		
//		try {
		
			FileInputStream fis = new FileInputStream("a.txt");
			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}

}
