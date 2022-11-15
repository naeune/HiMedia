package generic;

class Parent<T> {
	T item;
	
	public Parent() {}
	
	public Parent(T t) {
		this.item = t;
	}
}

// 부모가 제네릭 클래스라면 자식도 제네릭 파라미터 표현 필요
class Child<T> extends Parent<T> {
	
	// 이미 제네릭 클래스로 선언 -> 메서드 안에 파라미터를 넣으면 중복!
	public void showType(T t) {
		System.out.println("Type >> " + t);
	}
}

public class Ex05 {

	public static void main(String[] args) {
		Child<String> c = new Child<String>();
		c.showType(new String("홍길동"));
		
	}

}
