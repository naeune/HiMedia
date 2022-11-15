package inner;

interface Box {
	public void boxing();
}

class Banana {
	public Banana() {
		System.out.println("[Banana] 바나나는 멸종위기입니다.");
	}
	
	// instance method
	public void buy(Box box) {
		box.boxing(); // 호출
	}
}

public class AnonymousClassEx03 {
	public static void main(String[] args) {

		Banana banana = new Banana();
		banana.buy(new Box() {
			@Override
			public void boxing() {
				System.out.println("바나나를 포장합니다.");
			}
		});
	}

}
