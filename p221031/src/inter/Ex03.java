/*
 * [interface]
 * : 추상 class 보다 엄격해진 자료형
 * : 추상 class의 upgrade된 type
 * : 객체 생성 불가능 --> 상속, 다형성으로 사용
 * 
 * - member field
 * 	 * public static final 로 고정됨 --> constant(상수) --> 대문자
 *
 * 
 * - member method
 * 	 * public abstract : 추상 메서드
 */
package inter;

interface Method {
	// interface의 메서드는 기본적으로 추상 메서드!
	// public abstract
	void one(); // 추상 메서드
	public abstract void two();
	
	// 일반 메서드를 사용하고 싶을 때, default 사용
	// default method
	default void defaultMethod() {
		System.out.println("interface 내 default 멤버 메서드");
	}
	
	// static method
	public static void staticMethod() {
		System.out.println("interface 내 static 멤버 메서드");
	}
}

class Sub implements Method {

	// 오버라이딩
	@Override
	public void one() {
		System.out.println("Sub class : 오버라이딩된 메서드 one()");
	}

	@Override
	public void two() {
		System.out.println("Sub class : 오버라이딩된 메서드 two()");
	}
}

public class Ex03 {
	public static void main(String[] args) {
		// 1. interface는 객체 생성 불가능
		// Method m = new Method();	// Error!
		
		// 2. 다형성
		Method m = new Sub();
		m.one();
		m.two();
		m.defaultMethod();
		Method.staticMethod();
		
	}

}
