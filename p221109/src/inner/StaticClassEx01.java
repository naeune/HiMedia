package inner;

class OuterFour {
	
	/*
	 * ================ << static inner class >> ==================
	 * : 외부에서 Outer class의 객체 생성 없이 Inner class에 접근 가능
	 * : instance와 static의 모든 field 선언과 method 정의 가능
	 * : Outer class의 static method 내 static inner class 사용 가능
	 * ============================================================
	 */
	
	static class Inner {
		// instance field
		int num = 5;
		
		// static field
		static int user = 10;
		
		// constructor
		public Inner() {
			System.out.println("Inner class 생성자 실행됨...");
		}
		
		// instance method
		public void show() {
			System.out.println("instance field : num >> " + this.num);
			System.out.println("static field : user >> " + user);
		}
		
		// static method
		public static void showStatic() {
			// System.out.println("instance field : num >> " + num);	// Error!
			System.out.println("static field : user >> " + user);
		}
	}
}
public class StaticClassEx01 {

	public static void main(String[] args) {
		
		System.out.println("<< 객체 생성 전 >>");
		OuterFour.Inner.user = 500;
		OuterFour.Inner.showStatic();
		
		System.out.println("<< 객체 생성 후 >>");
		OuterFour.Inner in = new OuterFour.Inner();
		in.show();
		
		
	}

}
