package inter;

interface A {}
interface B {}
interface C extends A {}
interface D extends A, B {}	// 다중 상속 허용

class E {}
class F {}
class G extends E {}
// class H extends E, F {} // Error! 다중 상속 불허용
// class I extends A {}	   // Error!
class J implements A {}	   // implements 구현하다

class K extends E implements A, B{} 	// 부모로 둘 수 있는 클래스는 1개, 인터페이스는 여러 개 가능

// class L implements A extends E {} 	// Error! 클래스를 정의할 때, 같은 타입의 클래스가 먼저 와야함

// interface M implements E {}			// Error! 인터페이스는 클래스를 부모로 둘 수 없다.


public class Ex01 {
	public static void main(String[] args) {

	}

}
