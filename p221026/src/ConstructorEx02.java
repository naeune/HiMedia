class Student {
	// 멤버 변수 : 인스턴스 변수(객체 변수), this
	int age;
	String name;
	
	// 생성자
	public Student() {						// 매개변수가 없는 생성자
		this(20, "미입력");
		// System.out.println(">> 매개변수가 없는 생성자 실행 : 시작");
		// this.age = 20;
		// this.name = "미입력";
		// this.showInfo();
		// System.out.println(">> 매개변수가 없는 생성자 실행 : 끝");
	}
	
	public Student(String name) {			// 매개변수가 1개인 생성자
		this(20, name);
		// this.age = 20;
		// this.name = name;
		// this.showInfo();
	}
	
	public Student(int age, String name) {	// 매개변수가 2개인 생성자
		this.age = age;
		this.name = name;
		this.showInfo(); // 메서드 내에서 다른 메서드 호출 가능, 생성자 내에서 다른 생성자 호출 가능
	}
	
	// 멤버 메서드
	public void showInfo() {
		System.out.println("이름은 " + this.name + "이고, 나이는 " + this.age + "입니다.");
	}
}


public class ConstructorEx02 {
	public static void main(String[] args) {
		Student noName = new Student();
		noName.showInfo(); 	// 출력 -> 이름은 미입력이고, 나이는 20입니다.
		
		Student hong = new Student(29, "홍길동");
		hong.showInfo();	// 출력 -> 이름은 홍길동이고, 나이는 29입니다.
		
		Student park = new Student("박보검");
		park.showInfo();	// 출력 -> 이름은 박보검이고, 나이는 20입니다.
	}

}
