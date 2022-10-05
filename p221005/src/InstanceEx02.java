// Person 클래스 정의
class Person {
	// 구현하고자 하는 사람의 특징 작성
	// 멤버 변수, 멤버 메서드
	// 변수에는 값을 저장하고, 변수를 사용하는 건 메서드가 함
	
	// 멤버 변수
	int age;
	String name;
	String address;
	
	// 멤버 메서드
	// setter, getter --------------
	
	// 멤버 변수 값 설정 : set변수명
	// 멤버 변수 값 리턴 : get변수명
	
	// 메서드 내에 같은 이름의 변수 사용 X
	// 객체가 만들어질 때, 본인 안에 자신의 주소를 담은 변수를 생성 -> this 변수
	// this : 참조변수(자기자신의 주소를 가지고 있음)
	// this 변수를 통해 접근할 수 있는 것 -> 멤버(변수, 메서드)
	// this가 붙은 것들은 모두 멤버!
	
	void setAge(int age) {
		this.age = age;
	}
	
	String getName() { // name 값을 가져오는 함수
		return name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	void showAge() {
		// int age;
		System.out.println("나이 >>> " + age);
	}
	
	void showInfo() {
		System.out.println("this >>> " + this);
	}

}

public class InstanceEx02 {
	public static void main(String[] args) {

		// 1. 참조변수 선언 -------------------
		
		// 자료형 변수명;
		// 클래스명 참조변수;
		Person p1;	// p1은 지역변수
		
		// 2. 객체 생성 ----------------------
		
		// new : 힙 영역에 할당하세요~
		// new 클래스명(); : 힙 영역에 클래스 멤버 할당하세요~
		p1 = new Person();
		
		// 3. 멤버 접근 ----------------------
		// 3-1. 멤버 변수에 값 설정
		// 참조변수를 통한 멤버변수 값 설정 : 외부접근
		// 외부 접근을 통한 멤버변수 값 설정은 객체 지향에서 권장하지 않음!
		// -> 보안 문제
		// 권장 방법 : 메서드를 통해 접근! setter, getter
		
		/*
		 p1.age = 35;
		 p1.name = "홍길동";
		 */

		p1.setName("다람쥐");
		System.out.println("이름 >> " + p1.getName());
		
		p1.setAge(25);
		
		// 3-2. 멤버 메서드 호출 <- 멤버 변수 값 사용
		p1.showAge();
		// 지역변수와 멤버변수의 이름이 같을 때,
		// 지역변수를 먼저 찾고 없으면 멤버변수를 사용
		// 힙 영역에는 지역변수가 없음
		// (멤버)메소드 내의 지역변수는 메서드가 호출 될 때 스택메모리에 생성
		
		// 4. 참조변수 p1과 this의 값 확인
		System.out.println("p1 >> " + p1);
		p1.showInfo();
		// p1 == this
		
		
	}

}
