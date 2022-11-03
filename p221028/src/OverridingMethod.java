/*
 * [접근 권한/접근 제어자/접근 제어 지시자]
 * private < default < protected < public
 * 
 * - 오버라이딩(overriding)
 *  : 오버라이딩된 메서드의 접근권한은
 *    부모 메서드의 접근권한보다 같거나 커야함
 * 
 */
class Parent {
	
	// 기본적으로 method는 public
	protected void clean() {
		System.out.println("부모 >> 집 청소합니다.");
	}
}

class Child extends Parent {
	
	// 부모의 메서드보다 자식 메서드의 접근 권한 범위가 같거나 넓어야함
	// 오버라이딩 된 메서드는 가시성이 감소할 수 없음
	@Override
	public void clean() {
		System.out.println("자식 >> 내 방만 청소합니다.");
	}
}
public class OverridingMethod {
	public static void main(String[] args) {

		Child  child = new Child();
		child.clean();
	}

}
