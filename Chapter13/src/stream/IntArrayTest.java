package stream;

import java.util.Arrays;

public class IntArrayTest {

	public static void main(String[] args) {
		// 정수배열에서 스트림 활용하기
		int [] arr = {1, 2, 3, 4, 5};
		
//		IntStream obj = Arrays.stream(arr);  //obj 여러번 사용 불가 // 스트림 소모 => 새로 작성(함수로 선언해서 계속 사용 불가) 계속 새로 써줘야 사용O
//		int sumVal = obj.sum();     
//		int sumVal = obj.count();   //runtime 오류남
		
		int sumVal = Arrays.stream(arr).sum();  //체이닝 메서드 기법  //배열 스트림 생성
		int count = (int)Arrays.stream(arr).count();  // 스트림 소모 => 새로 작성(함수로 선언해서 계속 사용 불가) 계속 새로 써줘야 사용O
		
		System.out.println(sumVal);
		System.out.println(count);
				
	}

}
