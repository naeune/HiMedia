class Cat extends Object {
	
	@Override
	public String toString() {
		return "Cat class 입니다.";
	}
}
public class InheritanceEx05 {
	public static void main(String[] args) {

		Cat cat = new Cat();
		// 출력은 모두 문자열 -> 출력할 때 자동으로 .toString() 실행
		System.out.println(5);
		System.out.println(3.5);
		System.out.println(cat);
		System.out.println(cat.toString());
		System.out.println(cat.getClass());
		System.out.println(cat.getClass().getName());
	}

}
