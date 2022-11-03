package quiz;

public class Calculator {
	// 멤버 변수 - 외부접근을 방지하기 위해 기본적으로 private 설정 -> 메서드로 접근
	private int x, y = 0;
	
	// 생성자
	public Calculator(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// 멤버 메서드
	public void add() {
		System.out.println("덧셈 결과 >> " + (x + y));
	}
	
	public void sub() {
		System.out.println("뺄셈 결과 >> " + (x - y));
	}
	
	public void mul() {
		System.out.println("곱셈 결과 >> " + (x * y));
	}
	
	public void div() {
		if(y != 0) 
			System.out.println("나눗셈 결과 >> " + (x / y));
		else {
			System.out.println("분모가 0으로 계산 불능입니다.");
			return;
		}
	}
}
