package innerclass;

//class Person{
//	//메서드
//	public void introduce() {
//		System.out.println("사람입니다.");
//	}
//}

interface Personalbe{
	void introduce();
}

public class _01_AnonymousClass {

	public static void main(String[] args) {
//		Person person = new Person();
		Personalbe person = new Personalbe() {  //인터페이스 타입 기반
			
			@Override
			public void introduce() {  //익명 이너 클래스
				// TODO Auto-generated method stub
				System.out.println("사람입니다.");
			}
		};
		
		
		person.introduce();
	}
	
	/*
	   public int add(int x, int y){
	   		return x + y;
	   }
	   //간소한 식으로 표현 : 람다식
	     
	    (x, y) -> x + y;   ==> 컴퓨터가 익명 이너클래스로 만들어줌
	   
	   
	 */

}
