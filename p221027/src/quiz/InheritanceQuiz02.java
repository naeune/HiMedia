package quiz;

class Animal {
	int leg;
	String name;
	
	public Animal() {
		
	}
	
	public Animal(int leg, String name) {
		this.leg = leg;
		this.name = name;
	}
}

class Cats extends Animal{
	// 생성자
	public Cats() {

	}
	
	public Cats(int leg, String name) {
		super(leg, name);
	}
	
	// toString() 오버라이딩
	@Override
	public String toString() {
		return super.name + "는 고양이입니다.";
	}
}

class Dogs extends Animal {
	// 생성자
	public Dogs() {

	}
	
	public Dogs(int leg, String name) {
		super(leg, name);
	}
	
	// toString() 오버라이딩
	@Override
	public String toString() {
		return super.name + "는 강아지입니다.";
	}
	
}

public class InheritanceQuiz02 {

	public static void main(String[] args) {

		Cats mimi = new Cats(5, "미미");
		Dogs hoya = new Dogs(3, "호야");
		
		System.out.println(mimi);
		System.out.println(hoya);
		
	}

}
