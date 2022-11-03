class GrandParent {
	//
}
class Parent {
	int money = 1000000;
	
	void buy(int money) {
		this.money -= money;
		System.out.println("남은 돈은 " + this.money + "입니다.");
	}
}

class Child extends Parent {
	// 함수 생성 : 정의
	void study() {
		System.out.println("저는 공부 중입니다.");
	}

	/*
	 * [메서드 오버라이딩] method overriding
	 * - 상속 관계에서 자식 class가 부모 class의 멤버 메서드 재정의
	 * - 부모 class의 멤버 메서드의 선언부 그대로, 바디(기능)만 수정
	 * - 단, 반환형, 메서드명, 매개변수 정보는 그대로(같아야 함!)
	 */
	
	void buy(int money) {
		// money = 매개변수, 부모 변수 아님
		System.out.println("부모님 용돈 " + money + "원 주세요~");
	}
	
	/*
	 * [메서드 오버로딩] method overloading
	 * - 같은 이름의 메서드 여러 개 정의
	 * - 단, 매개변수의 정보(자료형, 개수)가 달라야 함
	 * - 반환형과 관련 없음
	 */
	
	// 메서드 오버로딩
	void buy() {
		System.out.println("용돈 주세요~");
	}
}
public class InheritanceEx01 {
	public static void main(String[] args) {
		
		Child c = new Child();
		c.buy(1000);
		c.study();
		
		
	}

}
