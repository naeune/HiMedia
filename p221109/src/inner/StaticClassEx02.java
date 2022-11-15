package inner;

class OuterFive {
	
	// instance method
	public void instanceMethod() {
		InnerInstance in = new InnerInstance();
		InnerStatic ins = new InnerStatic();
		System.out.println(in);
		System.out.println(ins);
	}
	
	// static method
	public static void staticMethod() {
		// InnerInstance in = new InnerInstance(); // Error!	
		InnerStatic ins = new InnerStatic();
		System.out.println(ins);
		
	}
	
	// instance inner class
	class InnerInstance {}
	
	// static inner class
	// : Outer class의 static method에서 사용 가능
	static class InnerStatic {}
}

public class StaticClassEx02 {

	public static void main(String[] args) {

	}

}
