package enumexample;

enum Number {
	ONE(1), TWO(2), THREE(3), FOUR(4);

	private int number;
	
	private Number(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return this.number;
	}
}

public class Ex03 {
	public static void main(String[] args) {
		Number currentNumber = Number.ONE;
		
		switch(currentNumber) {
		case ONE:
			System.out.println("1이다.");
			break;
		case TWO:
			System.out.println("2이다.");
			break;
		case THREE:
			System.out.println("3이다.");
			break;
		case FOUR:
			System.out.println("4이다.");
			break;
		}
		
		// [문제] 설정된 정수 값 출력
		// : 향상된 for문 사용
		// : 서수(순서) - 첫째, 둘째, ...
		System.out.println("<<서수 출력>>");
		for(Number n: Number.values() )
			System.out.println(n.ordinal());
		
		System.out.println("<<필드 값 출력>>");
		// [문제] 설정된 정수 값 출력(field)
		for(Number n: Number.values())
			System.out.println(n.getNumber());
	}

}
