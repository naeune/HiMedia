/*
 * [내부 클래스] inner class
 * - class 내부에 정의된 클래스
 * 
 * - 멤버 class
 * 	 cf) class 내 member : field, method, class
 * - 외부 클래스와 내부 클래스는 서로 긴밀한 관계일 때 정의 
 * - 내부 클래스의 장점
 * 	 1) 내부 클래스는 외부 클래스의 멤버에 접근 가능
 * 	 2) 관련 있는 클래스를 논리적으로 묶어 표현함으로써, 코드의 캡슐화 증가
 * 	 3) 외부에서 내부 클래스에 접근할 수 없으므로, 코드의 복잡성을 줄일 수 있음
 * 
 *  - inner class 종류
 *   1) instance inner class
 *   	: non-static inner class(비정적 내부 클래스)
 *   	: static 멤버 불가능
 *		   
 *   2) static inner class(정적 내부 클래스)
 *   	: Outer class의 static method 내에서 사용될 목적
 *   
 *   3) local inner class
 *   	: method 또는 constructor 내 정의된 클래스
 *   	: 해당 영역 내에서만 사용 가능한 클래스
 *   	: static 멤버 불가능
 *   
 *   4) ✦ anonymous class(익명 클래스)
 *   	: 이름이 없는 클래스
 *   	: 클래스 정의와 동시에 객체 생성하므로, 하나의 객체만 생성 가능
 *   	  --> 일회용 클래스
 *   	: 생성자를 정의할 수 없음 <-- 이름이 없는 클래스, 생성자명은 클래스명과 같아야함
 *   	: 오버라이딩(재정의)을 하기 위한 목적
 */
package inner;

// default, public
class OuterClass {
	// field
	// private int one;
	// public int two;
	
	// member class
	// private, default, public
	// 외부에 드러나지 않게 보호 가능(캡슐화) - 기본적으로 외부 접근 안됨
	class InnerClass {
		
	}
}

public class Summary {

}
