package quiz;

class Fruit {
	// 멤버 변수 - 인스턴스 변수
	int count;
	
	// 생성자
	public Fruit() {
		
	}
		
	public Fruit(int count) {
		this.count = count;
	}
	
	// 멤버 메서드 - 인스턴스 메서드
	public void showCount() {
		System.out.println("현재 남은 개수는 " + this.count + "입니다.");
	}
	
	public void showInfo() {
		System.out.println("과일 정보를 출력하는 메서드입니다.");
	}
}

class Banana extends Fruit {
	// [문제 2] 생성자를 이용하여 부모 class Fruit의 멤버 변수 count에 값 설정
	
	public Banana() {
		
	}
	
	
	public Banana(int count) {
		super.count = count;
	}

	// [문제 1] showInfo() 메서드를 오버라이딩(overriding)
	@Override
	public void showInfo() {
		System.out.println("----------------------------------");
		System.out.println("현재 과일은 바나나입니다.");
		System.out.println("바나나는 " + super.count + "개 있습니다.\n");
	}
}
public class InheritanceQuiz01 {

	public static void main(String[] args) {

		// [문제 1]
		Banana bananaOne = new Banana();
		bananaOne.showInfo();
		
		// [문제 2]
		Banana bananaTwo = new Banana(10);
		bananaTwo.showInfo();
	}

}
