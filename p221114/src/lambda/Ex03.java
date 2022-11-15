package lambda;

// [함수형 인터페이스]
@FunctionalInterface
interface Box {
	public String boxing();
}

class Banana {
	// constructor
	public Banana() {
		System.out.println("[Banana Constructor] 나는 '바나나'다!");
	}
	
	// instance method
	public void buy(Box box) {
		System.out.println(box.boxing());
	}
}

public class Ex03 {
	public static void main(String[] args) {
		
		// 1. 익명 클래스
		// 1-1. 객체 생성
		Banana bananaOne = new Banana();
		// 1-2. 익명 클래스
		bananaOne.buy(new Box() {
			@Override
			public String boxing() {
				return "<< 익명 클래스 내 오버라이딩 >> 바나나를 포장합니다.";
			}
		});
		
		// 2. 람다식
		// 2-1. 객체 생성
		Banana bananaTwo = new Banana();
		// 2-2. 람다식
		Box box = () -> "람다식 1) 포장합니다.";
		bananaTwo.buy(box);
		
		// 3. 람다식 : 인수
		Banana bananaThree = new Banana();
		bananaThree.buy(() -> "람다식 2) 포장할까요?");

	}

}
