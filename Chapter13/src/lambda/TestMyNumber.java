package lambda;

public class TestMyNumber {

	public static void main(String[] args) {
		
		MyNumber max1 = new MyNumber() {  //인스턴스
			
			@Override
			public int getMax(int num1, int num2) {
				// TODO Auto-generated method stub
				return (num1 >= num2) ? num1 : num2;
			}
		};
			System.out.println(max1.getMax(10, 20));
		
//			BinaryOperator max1 = new BinaryOperator<T>() {
//				
//			};
			
//			MyNumber max1 = new MyNumber() {
//				
//				@Override
//				public int getMax(int num1, int num2) {
//					// TODO Auto-generated method stub
//					return (num1 >= num2) ? num1 : num2;
//				}
//			};
			
		// 람다식 구현과 호출
		MyNumber max = (num1, num2) -> (num1 >= num2) ? num1 : num2; //getMax 수행문
		//BinaryOperator acc = (num1, num2) -> (num1 >= num2) ? num1 : num2;(stream 이랑 비교)
		// override 의 getMax 생략 리턴도 생략  interface에 getMax 하나 밖에 없기 때문에 쉽게 추론
		// interface에 여러개 스여있으면 추론 불가 -> 오류 @FunctionalInterface 로 막아줌
		System.out.println(max.getMax(10, 20));

	}

}
