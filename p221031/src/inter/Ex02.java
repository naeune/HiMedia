package inter;

interface Var {
	// interface 멤버 변수 기본 형태 : public static final 
	// public static final
	int NUM1 = 100;
	static int NUM2 = 200;
	final int num3 = 300;
	public static final int num4 = 400;
}

public class Ex02 {
	public static void main(String[] args) {

		// interface는 객체 생성 불가
		// Var v = new Var();	// Error!
		
		// Var.num2 = 2; 		// Error!
		System.out.println(Var.NUM1);
		System.out.println(Var.NUM2);
		System.out.println(Var.num3);
		System.out.println(Var.num4);
		
	}

}
