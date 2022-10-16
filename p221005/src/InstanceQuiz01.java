class Animal {
	
	String name;
	
	void showName() {
		System.out.printf("제 이름은 %s입니다\n", this.name);
	} // this : 멤버변수임을 직관적으로 보여주기 위해 사용
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
