class Baseball {
	// 멤버 변수 : 인스턴스(객체) 변수 -> 객체 생성 후 사용 가능
	// int count = 10;
	
	// 멤버 변수 : static(클래스) 변수 -> 객체 생성과는 무관하게 바로 사용 가능
	static int count;
	
	// 멤버 메서드 : 인스턴스(객체) 메서드
	void increment() {
		Baseball.count++;
	}
	
	void decrement() {
		Baseball.count--;
	}
	
	void baseballInfo() {
		System.out.println("현재 개수 : " + Baseball.count);
	}
}
public class VariableStaticEx01 {
	public static void main(String[] args) {
	
		// static 변수는 클래스명으로 관리됨
		System.out.println("static 멤버 변수 >> " + Baseball.count);
		
	
		Baseball b1 = new Baseball();
		b1.increment();
		b1.baseballInfo();
		
		Baseball b2 = new Baseball();
		b2.increment();
		b2.baseballInfo();
		
		System.out.println("static 멤버 변수 >> " + Baseball.count);
	}

}
