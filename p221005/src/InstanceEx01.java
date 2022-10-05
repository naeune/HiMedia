/*
 * [클래스]class
 * - "클래스"는 "자료형"이다!
 * - 사용자 정의 자료형
 * - 참조형(reference type) <- reference는 주로 주소의 의미를 가짐
 *  cf) 기본 자료형(primitive type) : int, float, double, ...
 *  
 *  - 클래스명은 대문자로 시작(숫자로 시작하면 Error!)
 *  - 클래스 내 멤버 : 변수, 메서드
 *  
 *  - 객체(object), 인스턴스(instance) : 클래스로 생성된 구체화(실체화)된 대상
 *  - 자바는 모든 객체를 heap 영역에 생성 -> 멤버도 heap 영역에 할당
 *  - 객체는 heap 영역에 생성되면, 할당된 메모리 주소를 리턴(반환)
 *  - 생성된 객체는 반드시 주소를 통해 접근
 *  
 *  - 객체 생성 문법
 * 	  new 클래스명();
 * 
 * 	- 참조(reference) 변수 선언 문법
 *    클래스명 변수명;
 *    
 */


// class 정의
class Student {
	// 멤버 변수
	int age;
	String name;
	
	// 멤버 메서드 <- public static 안써도 가능
	// 메서드 이름은 동사를 많이 사용 -> 메서드(동작)
	void study() {
		System.out.println("공부를 열심히 해요~!");
	}
}

public class InstanceEx01 {
	public static void main(String[] args) {

		// 변수 선언
		// 자료형 변수명;
		// int num; -> 쓰레기값으로 초기화된 상태
		
		// 클래스명 변수명 = new 클래스명();
		Student hong = new Student();
		// 변수 선언 자체는 객체 생성과는 상관 없음
		
		System.out.println("멤버변수 age의 초기값 >> " + hong.age);
		// age는 참조변수가 아님 -> 변수 선언(기본 자료형)으로 생성
		
		hong.age = 25;
		System.out.println("멤버변수 age의 값 >> " + hong.age);
		
		System.out.println("멤버변수 name의 초기값 >> " + hong.name);
		// name은 참조 변수 -> 클래스 자료형을 사용해 생성
		
		// 멤버 메서드 study() 호출
		hong.study();
		
	}

}
