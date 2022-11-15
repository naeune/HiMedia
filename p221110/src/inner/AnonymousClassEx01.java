/*
 * [anonymous class]
 * 익명 클래스는 선언과 동작에 따라 3가지 유형으로 나뉨
 * 1) 클래스 확장
 * 2) 인터페이스 구현
 * 3) 인수
 */
package inner;

class Super {
	
	// constructor
	public Super() {
		System.out.println("[Super class] Super 생성자 실행됨");
	}
	
	// instance method
	public void print() {
		System.out.println("[Super class] print method 실행됨");
	}
	
}

class Sub extends Super {
	// constructor
	public Sub() {
		System.out.println("[Sub class] constructor 실행됨");
	}
	
	// instance method
	public void show() {
		System.out.println("[Sub class] show method 실행됨");
	}
}

public class AnonymousClassEx01 {
	public static void main(String[] args) {

		// 다형성 구현
		// Super s = new Sub();
	
		
		// 익명 클래스 =======================================================
		Super anonymous = new Super() {
			
			// constructor 생성 불가능 <- 클래스명이 없음!
			
			// instance method
			// : 익명 클래스 내부에서만 사용 가능 -> 외부 호출 불가능
			/*
			public void say() {
				System.out.println("나는 익명 클래스 내 인스턴스 메서드야~");
			}
			*/
			
			@Override
			public void print() {
				System.out.println("나는 익명 클래스 내에서 재정의된 print 메서드야~");
			}
			
			@Override
			public String toString() {
				return "나는 익명클래스야~ 반가워~";
			}
		}; // 객체 생성 및 멤버 추가하기 위해 중괄호 + 세미콜론 (=확장)
		
		System.out.println(anonymous);
		anonymous.print();
	}

}
