package staticexample;

class Thing {
	// 멤버 변수(field) : instance field, static(class) field
	private int one;		// instance
	static int two; // static
	
	// 멤버 메서드(method) : instance method, static method
	public void printOne() {				// instance
		System.out.println(this.one);
	}
	
	public static void printTwo() {			// static
		System.out.println(Thing.two);
		// static 변수는 클래스명으로 접근! -> 클래스명으로 접근한 멤버는 모두 static 멤버!
		// static은 객체 생성 없이 사용 가능
		// System.out.println(this.one);	// Error! instance field
	}
}

public class Ex01 {

	public static void main(String[] args) {

		// static field
		System.out.println("static field >> " + Thing.two);
		
		// static method
		Thing.printTwo();
		
		// object
		// Thing thing = new Thing();
		
	}

}
