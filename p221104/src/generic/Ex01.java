/*
 * [Generic] 제네릭
 * - 데이터 타입을 일반화
 * - 타입이 사용자에 의해서 지정(결정)
 * - 컴파일할 때, 타입 검사
 * - class, method, interface
 * - 제네릭 클래스, 제네릭 메서드, 제네릭 인터페이스
 * - 참조형만 처리
 * 
 * - 제네릭 타입(Generic Type)
 *   ------------------------
 *   타입		|	설명
 *   ------------------------
 *   <T>	|	Type
 *   <E>	|	Element
 *   <K>	|	Key
 *   <V>	|	Value
 *   <N>	|	Number
 *   ------------------------
 */
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
	public <T> void showInstanceType(T t) {
		System.out.println(t);
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Apple apple = new Apple();
		Banana banana = new Banana();
		
		InstanceType in = new InstanceType();
		in.<Apple>showInstanceType(apple);
		in.<Banana>showInstanceType(banana);
		
	}

}
