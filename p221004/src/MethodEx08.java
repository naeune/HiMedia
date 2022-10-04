
public class MethodEx08 {

	public static void main(String[] args) {

		System.out.println("리팩토링 연습");
		
		increment();
	}

	public static void increment() {
		int value = 10; // 변수 선언 포함해서 메서드 추출 -> 매개변수 안받음
		value++;
		System.out.println(value);
	}

}
