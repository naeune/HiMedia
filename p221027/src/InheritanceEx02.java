class ParentTwo {
	String lastName;
	
	public ParentTwo() {
	}
	
	public ParentTwo(String lastName) {
		System.out.println("부모의 생성자 실행");
		this.lastName = lastName;
	}
}

class ChildTwo extends ParentTwo {
	// String lastName;
	
	// 생성자
	public ChildTwo() {
		// super();
		System.out.println("자식의 매개변수가 없는 생성자 실행됨");
	}
	
	/*
	public ChildTwo(String lastName) {
		// 호출되는 생성자 코드를 제일 첫 줄에 작성!
		// 부모의 생성자 호출 -> 자동으로 생성
		super();
		System.out.println("자식의 생성자 실행");
		super.lastName = lastName;
	}
	*/
	
	// 부모의 생성자를 통해서, 멤버 변수 lastName에 값 설정
	public ChildTwo(String lastName) {
		super(lastName);
		System.out.println("자식의 생성자 실행");
	}
	
	public void showInfo() {
		System.out.println("저는 " + this.lastName + "씨 입니다.");
	}
}
public class InheritanceEx02 {
	public static void main(String[] args) {

		ChildTwo c = new ChildTwo("홍");
		c.showInfo();
		
		// ChildTwo c2 = new ChildTwo();
	}

}
