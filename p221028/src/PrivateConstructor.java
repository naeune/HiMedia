/*
 * [상속 불가능]
 * 	: final class
 * 	: private constructor
 */

class Fruit {

	// private constructor -> 부모 생성자 호출 불가능 -> 상속 불가
	// private constructor -> 외부 호출 불가능 -> 객체 생성 불가
	public Fruit() {
	}
	
}

class Banana extends Fruit {
	
	// 생성자
	/*
	public Banana() {
		super();
	}
	*/
}

public class PrivateConstructor {
	public static void main(String[] args) {
		
		// Fruit fruit = new Fruit();
		
		
	}

}
