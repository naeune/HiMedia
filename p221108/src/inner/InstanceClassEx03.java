package inner;

class OuterThree {
	// instance field
	int one = 100;
	
	// static field
	static int two = 200;
	
	// instance method
	public void show() {
		System.out.println(one);
		System.out.println(two);
		// instance method에서 Inner class 객체 생성 가능
		Inner in = new Inner();
		in.showData();
	}
	
	// static method
	public static void showStatic() {
		// System.out.println(one);	// Error!
		System.out.println(two);
		
		// static method에서 Inner class 객체 생성 불가능
		// -> static method에서 사용하기 위해 static inner class 활용
		// Inner in = new Inner(); // Error!
	}
	
	// inner class
	class Inner {
		// Outer class의 멤버 사용 가능
		public void showData() {
			System.out.println(one);
			System.out.println(two);
			show();
			showStatic();
		}
	}
	
	// OuterThree class에서 Inner class 객체 생성 가능
	Inner in = new Inner();
}

public class InstanceClassEx03 {

	public static void main(String[] args) {

	}

}
