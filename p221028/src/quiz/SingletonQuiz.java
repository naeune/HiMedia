/*
 * [문제] Print class를 정의
 * - 객체는 오로지 하나만 생성되도록 하시오.
 * - 하나의 객체가 안정적으로 생성되도록 getPrinter()에 구현
 * - print method는 객체의 주소를 출력
 * 
 */

package quiz;

class User {
	private String name;
	
	public User(String name) {
		this.name = name;
	}
	
	public void print() {
		Printer printer = Printer.getPrinter();
		printer.print(this.name + " print using " + printer.toString() + ".");
	}
	
}

// Printer 클래스 정의
class Printer {
	// 객체가 먼저 생성되어 있어야하기 때문에 static 사용
	private static Printer printer = new Printer();
	
	private Printer() {}
	
	// 생성된 멤버 객체 주소 리턴
	public static Printer getPrinter() {
		if (printer == null) {
			printer = new Printer();
		}
		return printer;
	}
	
	public void print(String s) {
		System.out.println(s);
	}
	
	
}


public class SingletonQuiz {
	public static void main(String[] args) {

		User[] user = new User[5];
		
		for(int i = 0; i < user.length; i++) {
			user[i] = new User((i + 1) + "-user");
			user[i].print();
		}
	}

}
