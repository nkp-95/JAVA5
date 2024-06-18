package homework;

import java.util.Arrays;
import java.util.List;

public class WorldLengthSum {

	public static void main(String[] args) {
		// 중복단어 제거후 문자열 리스트에서 각 단어의 길이의 합 출력 하시오
		List<String>words = Arrays.asList("cat", "dog", "elephant", "cat", "lion");
		
		//중복단어 제거후 단어길이 합산을 스트림을 활용하여 작성
		int totalLength = 0;
		
		//코드작성
		totalLength = words.stream().distinct()  //중복제거
		.mapToInt(s -> s.length()).sum();							//단어길이 추출
														//길이 합산
		
		
		//결과 출력
		System.out.println("중복 제거후 각단어 길이의 합: " + totalLength);

	}

}
