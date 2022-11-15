/*
 * 1. 제네릭 타입은 해당 {}에서만 유효
 * 1-1. 제네릭 타입 선언 형태
 * 		: 인터페이스, 클래스, 메서드
 * 
 * 1-2. 제네릭 타입은 두 개 이상 가능
 * 
 */
package generic;

// 1-1. 제네릭 인터페이스
interface InterfaceName<T> {}

// 1-1. 제네릭 클래스
class ClassName<T> {}

// 1-2. 제네릭 타입은 두 개 이상 가능
class ClassOne<K, V> {}



public class Ex09 {
	
	// 1-1. 제네릭 메서드
	public static <T> void show(T t) {
		System.out.println(t);
	}
	// 나를 포함한 모든 자식
	public static <T> void one(ClassName<? extends T> name) {}
	// 나를 포함한 모든 부모
	public static <T> void two(ClassName<? super T> name) {}
	
	public static void main(String[] args) {
		// show(int) // Error! - 기본형(primitive type)
		// show(new Integer(10));	// 참조형(reference type)
		// Integer는 wrapper class
		
	}
}
