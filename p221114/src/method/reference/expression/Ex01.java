/*
 * [메서드 참조 표현식]
 * method reference expression
 * 이중 콜론 연산자 :: 
 * 함수형 인터페이스를 람다식이 아닌 일반 메서드를 참조시켜 선언하는 방법
 * 즉, 컴파일러가 람다의 타입을 추론할 수 있도록 정보를 제공하는 역할
 * -> 람다식을 더 축약해서 쓸 수 있는 형태 but, 꼭 람다식에서만 사용할 수 있는 건 아님!
 * 
 * - interface는 반드시 abstract method가 1개
 * 	(Single Abstract Method : SAM)
 * 	@FunctionalInterface 어노테이션으로 보장
 * 
 * - 선언부가 완전히 같아야함
 * 	: 매개변수 정보와 리턴 타입은 동일하고 기능만 다르다는 것이 핵심
 * 
 * - 리턴 타입과 파라미터 타입이 동일한 "기존에 구현된" 메서드를
 * 	 빈 껍데기에 참조만 하면 더 간편하게 사용 가능
 * 
 * - 완벽히 구현된 타 클래스의 메서드의 바디를 주소를 통해 참조해서
 * 	 추상 메서드가 자신의 메서드 이름으로 바디를 구현함
 * 
 * - 참조 : 가리킨다(주소) -> 찾아가는 역할
 * 	 참조만 하기에, 메서드명만 사용하고 ()는 제외
 * 	 (호출이 아니기 때문에 괄호 작성 X, 메서드도 주소가 있지만 호출해서 사용하기 때문에 필요없음)
 * 
 * - 참조 가능한 메서드 : instance method, static method, constructor
 * 
 * - [문법]
 * 	 1) 인스턴스::메서드
 * 	 2) 인스턴스::new
 * 	 3) 클래스명::메서드명 - static method
 */

// 패키지명 사이에 .(접근연산자) 작성하면 하위 패키지 설정 가능
package method.reference.expression;

interface Fruit {
	// abstract method
	String selfIntroduction(String n1, String n2);
}

// 꼭! interface의 abstract method를 class로 구현해야 하는가?
// inheritance -> anonymous class -> lambda expression -? method reference expression

// 1) 상속(inheritance)
class Banana implements Fruit {
	@Override
	public String selfIntroduction(String n1, String n2) {
		return n1.concat(n2);
	}
}

// Add class는 Fruit interface와 관련 없음

// Add class의 staticAdd와 instanceAdd method의 선언부가
// Fruit interface의 abstract method와 같다!

class Add {
	// constructor
	public Add() {
		System.out.println("Add class의 생성자 실행됨");
	}
	
	// static method
	static String staticAdd(String n1, String n2) {
		return n1 + "-" + n2;
	}
	
	// instance method
	String instanceAdd(String n1, String n2) {
		return n1.concat(", ").concat(n2);
	}
}

public class Ex01 {
	public static void main(String[] args) {

		// 1. 객체 생성
		Banana banana = new Banana();
		System.out.println(banana.selfIntroduction("안녕~ ", "나는 바나나야~"));
		
		// 2. 익명 클래스(anonymous class)
		Fruit anonymous = new Fruit() {
			@Override
			public String selfIntroduction(String n1, String n2) {
				return "[익명 클래스] " + n1 + n2;
			}
		};
		System.out.println(anonymous.selfIntroduction("안녕, ", "만나서 반가워~"));
		
		// 3. 람다식(lambda expression)
		// Fruit lambda = (n1, n2) -> "[람다식] " + n1 + n2;
		Fruit lambda = (n1, n2) -> n1.concat(n2);
		System.out.println("[람다] " + lambda.selfIntroduction("안녕! ", "잘 부탁해~"));
		
		// 4-1. method reference expression : instance method
		// Add 객체 생성
		Add add = new Add();
		Fruit one = add::instanceAdd;
		System.out.println(one.selfIntroduction("ONE", "TWO"));
		
		// 4-2. method reference expression : static method
		Fruit two = Add::staticAdd;
		System.out.println(two.selfIntroduction("하나", "둘"));
		
		// 4-3. [문제] 생성자는 어떻게 참조할까요?
		// Add class의 constructor : 매개변수 없고, 리턴값 없음
		// Runnable : java.lang package - interface
		//			: run - 매개변수 없고, 리턴값 없음
		Runnable constructor = Add::new;
		constructor.run();
	}
	
	

}
