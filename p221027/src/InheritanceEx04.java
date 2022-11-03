/*
 * [final] : 금지
 * - class		: 상속 금지
 * - method		: 오버라이딩 금지
 * - variable	: 초기화한 값 변경 고정 -> 값 변경 금지
 * 
 */
//final class ParentFour {
class ParentFour{
	String address;
	
	public ParentFour() {}
	
	public ParentFour(String address) {
		this.address = address;
	}
	
	final public void clean() {
		System.out.println("집 청소를 합니다.");
	}
	
	public void showInfo() {
		System.out.println("집 주소 : " + this.address);
	}
}


class ChildFour extends ParentFour {
	
	public ChildFour(String address) {
		super(address);
	}

	/*
	// 어노테이션 : 1. 컴파일러 문법 검사 2. 사용자(개발자) : 시각적 정보 제공
	@Override
	public void clean() {
		System.out.println("자식 : 내 방만 청소합니다.");
	}
	*/
}


public class InheritanceEx04 {
	public static void main(String[] args) {

		// ChildFour c = new ChildFour("서울 구로구");
		// c.showInfo();
		// c.clean();
	}

}
