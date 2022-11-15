package inner;

interface Yahoo {
	public void showNum();
}

class OuterTwo {
	
	public Inner getInner(int num) {
		return new Inner(num);
	}
	
	// 이름 중복 가능, 외부 클래스$내부 클래스.class 로 저장되기 때문에(의존)
	private class Inner implements Yahoo {
		// instance field
		int num;
		
		// constructor
		public Inner(int num) {
			this.num = num;
			System.out.println("Inner class의 생성자 실행 완료!!!");
		}
		
		// instance method
		public void showNum() {
			System.out.println("Inner class의 instance field : num >> " + this.num);
		}
	}
}

public class InstanceClassEx02 {
	public static void main(String[] args) {
		
		OuterTwo outer = new OuterTwo();
		// 다형성 구현
		Yahoo in = outer.getInner(5);
		// 오버라이딩
		in.showNum();
	}

}
