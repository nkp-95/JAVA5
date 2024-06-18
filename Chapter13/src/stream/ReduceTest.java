package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

//이름있는 클래스
class CompareString implements BinaryOperator<String>{

	@Override
	public String apply(String str1, String str2) {
		if(str1.getBytes().length >= str2.getBytes().length) {
			return str1;
		}else {
			return str2;
		}
	}
	
	/*
		BinaryOperator<String> accumulator = (str1, str2) -> {   //reduce 에 들어있는 BinaryOperator 공식
											   		if(str1.getBytes().length >= str2.getBytes().length) {
														return str1;
													}else {
														return str2;
													}
											   
											   	};
	   or
	   (str1, str2) -> (str1.getBytes().length >= str2.getBytes().length) ? str1  :str2;
	   
	   
	   
	 */
	
}


public class ReduceTest {

	public static void main(String[] args) {
		String[] greetings = {"안녕하세요~~~", "hello", "Good mornig", "반갑습니다.^^"};
		String str = Arrays.stream(greetings).reduce("", new CompareString());  // reduce에 클래스도 가능
		//BinaryOperator<String> accumulator = new ComparString();  => 바이너리로 선언된 클래스도 넣을수 있음
		System.out.println(str);
		System.out.println();
		String strTemp = Arrays.stream(greetings).reduce("", (str1, str2) -> {   //람다식이 인스턴스
	   		if(str1.getBytes().length >= str2.getBytes().length) {
				return str1;
			}else {
				return str2;
			}
	   	});
		
		System.out.println(strTemp);
		
		
	}

}
