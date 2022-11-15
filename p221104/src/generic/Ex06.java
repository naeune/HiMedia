package generic;

// 제네릭 인터페이스
interface Space<T> {
	// 추상 메서드
	void youKnow(T item);
}

class Star<T> implements Space<T> {
	@Override
	public void youKnow(T item) {
		System.out.println(item + "은 항성이지~");
	}
}

class Sun {
	@Override
	public String toString() {
		return "태양";
	}
}

public class Ex06 {
	public static void main(String[] args) {
		// 타입 결정
		Star<Sun> star = new Star<Sun>();
		// Sun 객체 생성
		Sun sun = new Sun();
		star.youKnow(sun);

	}

}
