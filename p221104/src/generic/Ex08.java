package generic;

public class Ex08 {

	// 제네릭 메서드 : 제네릭 파라미터 type이 배열
	public static <T> void showArray(T[] t) {
		for(T type: t)
			System.out.println(type);
	}
	
	public static void main(String[] args) {
		String[] str = {"Hi", "Hello"};
		showArray(str);
		
		Object[] fruit = {new Apple(), new Banana()};
		showArray(fruit);
	}

}
