package generic;

// 제네릭 파라미터 : 클래스명 오른쪽에 작성
class Test<T> {
	private T element;
	
	public void setElement(T element) {
		this.element = element;
	}
	
	public T getElement() {
		return this.element;
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Test<Integer> test = new Test<Integer>();
		test.setElement(10);
		System.out.println("설정된 값 >> " +  test.getElement());
		
		
		Test<String> strTest = new Test<String>();
		strTest.setElement("hi");
		System.out.println("설정된 값 >> " + strTest.getElement());
	}

}
