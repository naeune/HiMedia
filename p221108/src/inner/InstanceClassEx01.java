package inner;

class Outer {
	class Inner {
		// instance field
		int num;
		
		// constructor
		public Inner(int num) {
			this.num = num;
			System.out.println("Inner class의 생성자 실행 완료!!");
		}
		
		// instance method
		void showNum() {
			System.out.println("Inner class의 instance field : num >> " + this.num);
		}
	}
}

public class InstanceClassEx01 {
	public static void main(String[] args) {

		// 1-1. Outer 객체 생성
		Outer outer = new Outer();
		
		// 1-2. Inner 객체 생성
		// Outer class에 의존 -> Outer class 먼저 생성해야 Inner class 객체 생성 가능
		// 생성해야 하는 객체 = Inner, new는 Inner 앞에 작성
		Outer.Inner in = outer.new Inner(15);
		in.showNum();
		
		// 2. Inner 객체 생성
		Outer.Inner inTwo = new Outer().new Inner(25);
		inTwo.showNum();
		
	}

}
