package lambda;

class Animal {
	void showInfo() {
		System.out.println("나는 동물이야~");
	}
}

public class Ex02 {
	public static void main(String[] args) {

		Animal one = new Animal();
		one.showInfo();
		
		new Animal().showInfo();
	}

}
