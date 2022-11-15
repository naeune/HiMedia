package generic;

class Cool<T> {
	T count;
	// 제네릭 배열은 생성 불가능!
	// 배열 객체 생성 시 타입을 알아야하는데 제네릭은 타입형이 정해지지 않아서 배열 생성 불가능
	// T[] array = new T[10];	// Error!
	public Cool() {}
	
	public Cool(T count) {
		this.count = count;
	}
}

public class Ex07 {

	public static void main(String[] args) {
		// Object ob = new Object();
		// Object ob2 = new String();	// 다형성
		
		// Cool<Object> co = new Cool<Object>();
		// 제네릭 자체는 상속이 안됨(object 타입의 제네릭은 String 타입을 사용할 수 없음 -> 다형성 구현 안됨
		// Cool<Object> co2 = new Cool<String>();	// Error!
		
	}

}
