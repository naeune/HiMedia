/*
 * << static(클래스) 변수 >>
 * : class가 메모리에 로드(load)될 때, static(class) 영역에 할당
 * : 객체 생성과 상관없이 접근(사용) 가능
 * 	--> 객체 생성 없이 멤버 변수 사용하고자 할 때
 * : [문법]
 * 	 클래스명.변수명
 * : 해당 클래스로 생성된 객체들이 공유하는 변수	
 *
 * << static(class) 메서드 >>
 * : class가 메모리에 로드(load)될 때, static(class) 영역에 할당
 * : 객체 생성과 상관없이 접근(사용) 가능
 * 	--> 객체 생성 없이 메서드를 호출하고자 할 때
 * : [문법]
 * 	 클래스명.메서드명
 * : static(class) 메서드 내에서 static 멤버(변수, 메서드)만 접근(사용) 가능
 * 
 * cf) 인스턴스 멤버 ----------------------------------------------
 * << instance(객체) 변수>>
 * : 객체가 생성될 때, heap 영역에 할당
 * : 참조변수(주소)를 통해서 접근(사용) 가능
 * : [문법]
 * 	 참조변수.변수명
 * : 객체들마다 각자 자기만 사용하는 변수
 * 
 * << instance(객체) 메서드 >>
 * 	: 객체가 생성될 때, heap 영역에 할당
 *  : 참조변수(주소)를 통해서 접근
 *  : [문법]
 *    참조변수.메서드명
 *  : 객체들마다 각자 가짐 -> 자기만의 메서드
 *  : instance 메서드는 instance 멤버, static 멤버 접근(사용) 가능
 */

class Dog {
	// [멤버 변수]
	// : static(클래스) 변수
	static int count;
	
	// : instance(객체) 변수
	String name;
	
	// [멤버 메서드]
	// : static(클래스) 메서드
	static void increment() {
		Dog.count++;
		System.out.println();
	}
	
	// : instance(객체) 메서드
	void showInfo() {
		System.out.println("강아지 개수 : " + Dog.count);
		System.out.println("강아지 이름 : " + this.name);
	}
}
public class VariableStaticEx02 {
	public static void main(String[] args) {

		System.out.println("현재 강아지 개수 >> " + Dog.count);
		Dog.increment();
		System.out.println("현재 강아지 개수 >> " + Dog.count);
	}

}
