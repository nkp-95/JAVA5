package innerclass;

class Outer{
	// 멤버 변수
	int outNum = 100;
	//정적변수 
	static int sNum = 200;
	
	//메서드
	public Runnable getRunnable(int i) { //final  자동으로 들어가있음 
		int num = 100;  //final  자동으로 들어가있음 //지역변수는 메서드 호출시 스택에 생성  //상수로 변환됨 => 읽을수는 있지만 변경불가
		//안드로이드에서 자주 씀
		return new Runnable() { // 익명 내부 클래스 //익명 으로 인스턴스 넘겨줌  (MyRunnable 클래스 불필요) 
			int localNum = 10;
			@Override
			public void run() {  //인터페이스가 가진 추상 메서드 구현 
				// TODO Auto-generated method stub
				// 메서드 지역변수는 클래스에 사용되면 상수로 변환
				//num = 200;  똑같이 클래스 인스턴스이기 때문에 사용 불가
				//i = 100;
				System.out.println("i = " + i);  //5
				System.out.println("num = " + num);  //100
				System.out.println("localNum = " + localNum);  // 10
				System.out.println("outNum = " + outNum + "(외부클래스 인스턴스변수)");    //100
				System.out.println("Outer.sNum = " + Outer.sNum + "(외부클래스 정적변수)");  //200
			}
		};
		
		
		
//		class MyRunnalbe implements Runnable{  //지역 내부 클래스
//			//멤버변수
//			int localNum = 10;
//			//메서드
//			@Override
//			public void run() {
//				// 메서드 지역변수는 클래스에 사용되면 상수로 변환
//				//num = 200;
//				//i = 100;
//				System.out.println("i = " + i);  //5
//				System.out.println("num = " + num);  //100
//				System.out.println("localNum = " + localNum);  // 10
//				System.out.println("outNum = " + outNum + "(외부클래스 인스턴스변수)");    //100
//				System.out.println("Outer.sNum = " + Outer.sNum + "(외부클래스 정적변수)");  //200
//			}
//			
//		}
//		
//		return new MyRunnalbe();
		
	}
}


public class LocalInnerTest {

	public static void main(String[] args) {
		// 지역내부 클래스
		 Outer out = new Outer();
		 Runnable runner = out.getRunnable(5);  //runner  =return new MyRunnalbe();   //메서드  내부가 아니기 때문에 i 변경 가능
		 runner.run();
	}

}
