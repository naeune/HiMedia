/*
 * [추상 클래스] abstract class
 * - 추상 클래스 내에 abstract method가 있을 수도 없을 수도 있음
 * - 추상 클래스는 객체 생성 불가능
 * - 다형성 또는 상속으로 사용
 * 
 * [추상 메서드] abstract method
 * - body가 없는 메서드 --> 미완성 메서드
 * - 반드시 추상 클래스 내 존재
 * - 추상 메서드가 있는 추상 클래스를 상속 받은 자식 클래스는
 * 	 반드시 추상 메서드를 오버라이딩 해야함 --> 강제성!!
 */
package abstractexample;

// 추상 메서드는 추상 클래스 내에서만 정의 가능
abstract class Parent {
	// member field : instance field
	int num;
	
	// member field : static field
	static int numTwo;
	
	// 추상 메서드 - 미완성된 메서드, 세미콜론 작성
	public abstract void methodOne();
	
	// static 불가 <- 미완성
	// public static abstract void methodOne();	// Error!
	
	// member method : instance method
	public void methodTwo() {
		System.out.println("일반 메서드 : methodTwo()");
	}
	
	// member method : static method
	public static void methodThree() {
		System.out.println("static 메서드 : methodThree()");
	}
}

class Child extends Parent {
	@Override
	public void methodOne() {
		System.out.println("오버라이딩된 추상 메서드 : methodOne()");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		// 1. 자식 클래스로 객체 생성
		Child c = new Child();
		c.methodOne();
		
		// 2. 추상 클래스로 객체 생성 : Error!
		// Parent p = new Parent();
		
		// 3. 다형성
		Parent p = new Child();
		p.methodOne();
		p.methodTwo();
		Parent.methodThree();
	}

}
