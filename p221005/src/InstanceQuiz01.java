class Animal {
	
	String name;
	
	void showName() {
		System.out.printf("제 이름은 %s입니다\n", name);
	}
}


public class InstanceQuiz01 {
	public static void main(String[] args) {

		Animal dog = new Animal();
		
		dog.name = "해피";
		dog.showName();
		
		Animal cat = new Animal();
		
		cat.name = "나비";
		cat.showName();
	}

}
