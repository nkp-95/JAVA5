package lambda;

@FunctionalInterface
interface PrintString {
	void showString(String str);
}


public class TestLambda {
	public static void main(String[] args) {
		//매개변수로 전달하는 람다식
		PrintString lambdaStr = str -> System.out.println(str);  //1. 람다식을 변수에 대입  참조변수로 쓸수 있음
		
//		PrintString lambdaStr_ = new PrintString() {
//			
//			@Override
//			public void showString(String str) {
//				public void showString(String str) {
//				
//			}
//		};
		
		lambdaStr.showString("hello lambda local Variable");
		
		showMyString(lambdaStr);                                   //2. 메서드 매개변수로 전달
		
		PrintString reStr = returnString();
		reStr.showString("hello ");
	}
	
	public static void showMyString(PrintString p) {
		
		//PrintString p1 = str -> System.out.println(str);  같은의미  인스턴스를 넘겨주는것
		
		p.showString("hello lambda parameter");
	}
	
	public static PrintString returnString() {//람다식으로 리턴  //public void showString(String str) {  public void showString(String str) {  }}
		return s -> System.out.println(s + "world return lambda");                  //3. 반환값으로 사용 가능
	}

}
