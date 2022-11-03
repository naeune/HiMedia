package generic;

class Apple {
	@Override
	public String toString() {
		return "사과는 맛있다.";
	}
	
}

class Banana {
	@Override
	public String toString() {
		return "바나나는 멸종 위기이다.";
	}
}

class InstanceType {
	int count;
	
	/*
	 * [제너릭] 제네릭 generic
	 *  - data type을 일반화함
	 *  - 컴파일할 때, type 결정됨
	 *  
	 *  클래스, 메서드에 모두 사용 가능
	 *  반환형 왼쪽에 표시 <이름>, 매개변수 타입 안에 작성
	 */
	
	public <T> void showInstanceType(T type) {
		System.out.println("type >> " + type);
		count++;
	}
	
	public void showCount() {
		System.out.println("count >> " + this.count);
		
		
	}
}

public class Ex01 {
	public static void main(String[] args) {
		
		Apple apple = new Apple();
		Banana banana = new Banana();

		InstanceType in = new InstanceType();
		in.showInstanceType(apple);
		in.showCount();
		
		in.showInstanceType(banana);
		
	}

}
