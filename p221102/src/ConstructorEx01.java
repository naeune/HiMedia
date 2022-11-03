class Parent {
	public Parent() {
		System.out.println("Parent() 생성자 실행됨...");
	}
}

class Child extends Parent {
	String name;
	
	public Child() {
		// 생성자 안에서 생성자 호출 코드를 제일 먼저 작성 -> 부모, 자식 생성자 생성 코드 동시 작성 불가능
		// super();
		this("무명");
	}
	
	public Child(String name) {
		this.name = name;
	}
}

public class ConstructorEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
