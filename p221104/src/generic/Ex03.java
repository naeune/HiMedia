package generic;

interface Available {
	void selfIntroduction();
}

class Tree {
	String sort;
	int age;
	
	public Tree() { }
	public Tree(String sort, int age) {
		this.sort = sort;
		this.age = age;
	}
	
	public void info() {
		System.out.printf("INFO : 종류 - %s, 나이 - %d\n", this.sort, this.age);
	}
}

class Maple extends Tree implements Available {
	public Maple(String sort, int age) {
		super(sort, age);
	}
	
	
	@Override
	public void selfIntroduction() {
		System.out.println("나는 단풍나무이다.");
	}
}


class Pine extends Tree implements Available {
	public Pine(String sort, int age) {
		super(sort, age);
	}
	
	@Override
	public void selfIntroduction() {
		System.out.println("나는 소나무이다.");
	}
}

public class Ex03 {
	// [자료형에 안전하지 않은 코드]
	/*
	 * - 제네릭 파라미터는 object method 만 호출 가능
	 *  : 따라서 강제 형변환 필요 --> 자료형에 안전하지 않은 코드
	 *   강제 형변환에 따른, 실행할 대 Exception 발생 가능성 존재
	 *   즉, 제네릭의 장점이 사라짐
	 *  - 그래서 자바는 제네릭 매개변수 자료형에 제한을 두는 문법 제공
	 *  : 자료형에 안전한 구조
	 *  : 제네릭 매개변수 type 제한에 extends 사용
	 *  : class와 interface를 구분하지 않고, 키워드 extends만 사용
	 */
	public static <T> void callSelfIntroduction(T t) {
		((Available)t).selfIntroduction();
	}
	
	public static <T> void callInfo(T t) {
		((Tree)t). info();
	}
	public static void main(String[] args) {
		Maple maple = new Maple("고로쇠나무", 25);
		Pine pine = new Pine("금강소나무", 33);
		
		callSelfIntroduction(maple);
		callInfo(maple);
		
		callSelfIntroduction(pine);
		callInfo(pine);
		
		String name = "Hi";
		callSelfIntroduction(name);
		
	}

}
