package polymorphism;

class Fruit {
	@Override
	public String toString() {
		return "과일";
	}
	
}

class Person {
	@Override
	public String toString() {
		return "저는 사람입니다.";
	}
}

public class Ex03 {
	
	// 다형성
	public static void printInfo(Object obj) {
		System.out.println(obj);
	}
	
	public static void main(String[] args) {

		Fruit f = new Fruit();
		Person p = new Person();
		
		printInfo(f);
		printInfo(p);
	}

}
