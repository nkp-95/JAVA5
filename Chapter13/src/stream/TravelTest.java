package stream;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {

	public static void main(String[] args) {
		// stream 활용 테스트
		TravelCustomer lee = new TravelCustomer("이순신", 40, 100);
		TravelCustomer kim = new TravelCustomer("김유신", 20, 100);
		TravelCustomer hong = new TravelCustomer("홍길동", 13, 50);

		List<TravelCustomer> custList = new ArrayList<>();
		custList.add(lee);
		custList.add(kim);
		custList.add(hong);

		System.out.println("===고객명단 추가된 순서대로 출력====");
		custList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
		int total = 0;
		total = custList.stream().mapToInt(c -> c.getPrice()).sum(); // 합계
		System.out.println("\n총 여행 비용은 : " + total + "입니다.");

		System.out.println("\n== 20세이상 고객 명단 정렬하여 출력 ==");
		custList.stream().filter(c -> c.getAge() >= 20).map(c -> c.getName()).sorted()
				.forEach(s -> System.out.println(s));
	}

}
