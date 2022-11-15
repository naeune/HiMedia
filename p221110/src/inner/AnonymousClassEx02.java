package inner;

interface Space {
	void youKnow(); // 추상 메서드
}

class SubSpace implements Space {
	@Override
	public void youKnow() {
		System.out.println("우주에 대해 아는 것이 있나요?");
		
	}
}

public class AnonymousClassEx02 {
	public static void main(String[] args) {

		// subSpace 객체 생성 - 다형성
		Space spaceOne = new SubSpace();
		spaceOne.youKnow();
		
		// Anonymous class로 메서드 오버라이딩
		Space spaceTwo = new Space() {
			@Override
			public void youKnow() {
				System.out.println("나는 익명 클래스 내 있는 메서드야~");
			}
		};
		spaceTwo.youKnow();
	}

}
