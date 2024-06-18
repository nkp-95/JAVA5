package innerclass;

class OutClass {// 외부 클래스
	private int num = 10; // 외부 클래스 멤버 변수 = 인스턴스변수
	private static int sNum = 20; // 외부 클래스의 정적변수 = static 변수

	InClass inClass;  //멤버 변수 == 인스턴스 변수   

	public OutClass() {//생성자
		inClass = new InClass(); // 단 외부 클래스 생성된 후 내부 클래스 생성 가능  //여기 주석 처리 해도 (마지막줄)
	} 
	
	static class InStaticClass{  //외부클래스의 정적내부클래스
		int inNum = 100;         //정적내부클래스 내부의 인스턴스변수
		static int sInNum = 200; //정적내부클래스 내부의 정적변수
		
		void inTest() {  //정적내부클래스의 일반 메서드
			//System.out.println("OutClass num = " + num + "(외부클래스 인스턴스 변수)");  //num 사용 불가 //외부클래스 인스턴스 변수 사용 불가
			System.out.println("OutClass sNum = " + sNum + "(외부클래스의 정적 변수)"); //외부클래스의 정적변수는 사용 가능
			System.out.println("OutClass inNum = " + inNum + "(정적내부클래스의 인스턴스 변수)");
			System.out.println("OutClass sInNum = " + sInNum + "(정적내부클래스의 정적 변수)");
		}
		static void sTest() {  //static
			//num += 10; //num 사용 불가 //외부클래스 인스턴스 변수 사용 불가
			//inNum += 10;  //외부클래스와 정적내부 클래스의 인스턴스변수는 사용 불가
			//static끼리는 사용 가능
			System.out.println("OutClass sNum = " + sNum + "(외부클래스의 정적 변수)");
			System.out.println("OutClass sInNum = " + sInNum + "(정적내부클래스의 정적 변수)");
		}
	}
	
	

	class InClass { // 인스턴스 외부 클래스
		int inNum = 100; // 외부 클래스의 인스턴스 변수
		static int sInNum = 200;  // 인스턴스 내부클래스에서 정적변수 선언불가 jdk17 부터는 가능
		
		void inTest() {  //inClass 의 변수
			System.out.println("OutClass num = " + num + "(외부클래스 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부클래스의 정적 변수)");
		}
		static void sTest() {// 인스턴스 내부클래스에서 정적메서드 jdk17부터 가능
			//책이랑 다름 주의
		}
	}

	// Outer 클래스 메서드
	public void usingClass() {//메서드
		inClass.inTest();
	}

}

public class InnerTest {

	public static void main(String[] args) {
		// 내부 클래스 테스트
		OutClass outClass = new OutClass();
		System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
		outClass.usingClass();
		
		System.out.println(outClass.inClass.inNum); //InClass inClass;  에 private 지워서 디폴트로 바꿨을때
		
//		OutClass outClass = new OutClass();
//		OutClass.InClass inClass = outClass.new InClass();
//
//		inClass.inTest(); // 똑같이 나옴
		
	}

}
