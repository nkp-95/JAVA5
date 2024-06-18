package lambda;

public class TestStringConcat {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";
		
		StringConcat concat1 = new StringConcatImpl();
		concat1.makeString(s1, s2);
		int i = 100;  //지역 변수
		StringConcat concat2 = (s, v) -> {
			//i = 200;  // 상수화 되서 변경 불가
			System.out.println(i);  //두문장일땐 중괄호 생략 불가
			System.out.println(s + ", " + v); // 이 줄만 있으면 중괄호 생략 가능
		};
		//람다식은 객체를 생성해줌
		concat2.makeString(s1, s2);
		
		StringConcat concat3 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + ", " + s2); 
				
			}
		};
		concat3.makeString(s1, s2);
	}

}
