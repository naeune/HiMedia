/*
 * [다형성]
 *	부모type의 참조 변수로 자식type의 객체를 가리킴(접근)
 *	부모(자신)의 멤버만 접근 가능 -> 자식의 멤버는 접근 불가능
 *	단, 오버라이딩된 멤버 메서드는 접근 가능	
 *
 *	<< 문법 >>
 *	부모자료형 참조변수 = new 자식자료형(); 
 * 
 */
package polymorphism;

class Parent {
	// 백 단위 구분 기호 _ 사용 가능
	private int money = 1_000_000;
	
	public void spend(int money) {
		this.money -= money;
		System.out.println("남은 돈은 " + this.money + "입니다.");
	}
	
	void working() {
		System.out.println("부모님 : 열심히 일하는 중입니다.");
	}
}

class Son extends Parent {
	
	public void study() {
		System.out.println("아들 : 공부 중...");
	}
	
	@Override
	public void spend(int money) {
		System.out.println("아들 : 학원비 " + money + "원 주세요!");
	}
}

class Daughter extends Parent {
	public void play() {
		System.out.println("딸 : 홍대에 있습니다.");
	}
	@Override
	public void spend(int money) {
		System.out.println("딸 : 용돈 " + money + "원 주세요~");
	}
}


public class Ex01 {
	public static void main(String[] args) {

		Son son = new Son();
		son.working();
		son.study();
		son.spend(200000);
		
		Daughter daughter = new Daughter();
		daughter.working();
		daughter.spend(500000);
		
		// [다형성]
		// Parent p = new Son();
		
		// 부모 <- 자식 : 자동 형 변환(upcasting)
		Parent p = (Parent)son;
		p.working();
		// 부모는 자식의 멤버를 사용할 수 없지만, 유일하게 오버라이딩된 메서드는 접근 가능
		// 오버라이딩된 메서드는 따로 table에 정보 저장
		p.spend(900000);
		
		// 부모 -> 자식 : 강제 형 변환 필요 (downcasting)
		// (p)객체의 주소가 son이기 때문에 가능
		// Son s2 = (Son)p;
		
		
		Parent p2 = daughter;
		p2.spend(20000);
		
		// [객체 배열]
		/*
		Parent[] parent = new Parent[2];
		parent[0] = new Son();
		parent[1] = new Daughter();
		*/
		
		Parent[] parent = {new Son(), new Daughter()};
		
		parent[0].spend(100);
		parent[1].spend(100);
		
	}

}
