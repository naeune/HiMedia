package enumexample;

enum Shoes {
	WALKING("워킹화"), RUNNING("러닝화"), TRACKING("트레킹화"), HIKING("등산화");
	
	// field
	private String name;
	
	// constructor
	private Shoes(String name) {
		this.name = name;
	}
	
	// getter
	public String getName() {
		return this.name;
	}
	
	
}

public class EnumQuiz {
	public static void main(String[] args) {

		System.out.println("<<상수 출력>>");
		System.out.println(Shoes.WALKING);
		System.out.println(Shoes.RUNNING);
		System.out.println(Shoes.TRACKING);
		System.out.println(Shoes.HIKING);
		
		System.out.println("\n<<상수값 출력>>");
		for(Shoes s: Shoes.values())
			System.out.println(s.getName());
	}

}
