/*
 * ================ << local inner class >> ==================
 * : method 내 정의된 클래스
 * : 접근권한(접근 제한자) public, private 사용 불가능
 * 	 -> why? 메소드 내에서만 접근 가능하기 때문에 접근 권한 불필요
 * : static class 불가능
 * : 원래는 static 멤버 사용 불가능했지만 비공식적으로 허용됨 -> 사용 자제
 * ===========================================================
 */
package inner;

class OuterSix {
	
	public void show() {
		
		/*
		Inner in = new Inner();
		in.printNum();
		Inner.user = 500;
		System.out.println("static field : user >> " + Inner.user);
		*/
		// Error! -> 자바는 순서가 없지만, 메서드 내에서는 순서가 있기 때문에 클래스 정보가 먼저 와야함
		
		// 메서드 내 class 정의
		// Outer의 멤버 아님 -> 메서드 안에 있기 때문에 메서드 실행 시에만 만들어졌다가 실행 종료되면 소멸됨(지역변수 처럼!)
		/*
		class Inner {
			// instance field
			int num = 10;
			
			// static field
			static int user = 100;
			
			// constructor
			public Inner() {
				System.out.println("<< 지역 클래스 생성자 실행됨 >>");
			}
			
			// instance method
			public void printNum() {
				System.out.println("field : num >> " + this.num);
			}
		} // End Inner class
		*/
		
		/*
		// [method 내에서 객체 생성]
		Inner in = new Inner();
		in.printNum();
		Inner.user = 500;
		System.out.println("static field : user >> " + Inner.user);
		*/
		
	}// End show() method
}

public class LocalClassEx01 {
	public static void main(String[] args) {

		OuterSix six = new OuterSix();
		six.show();
	}

}
