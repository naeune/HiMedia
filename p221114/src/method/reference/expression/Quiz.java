package method.reference.expression;

import java.util.function.Function;

@FunctionalInterface
interface Greeting {
	// abstract method
	int say(String str);
}

public class Quiz {
	public static void main(String[] args) {

		// [문제 1] 익명 클래스
		Greeting greet = new Greeting() {
			@Override
			public int say(String str) {
				return str.length();
			}
		}; 
		System.out.println("[1. 익명 클래스] 문자열 길이 >> " + greet.say("안녕!"));
		
		// [문제 2] 람다식 : 참조 변수 저장
		// interface Greeting
		Greeting greetTwo = str -> str.length();
		String s = "안녕하세요";
		System.out.println("[2. 람다식] 문자열 길이 >> " + greetTwo.say(s));
		
		// [문제 3] 제네릭 함수형 인터페이스 - 람다식 : 참조 변수 저장
		Function<String, Integer> greetThree = str -> str.length(); 
		System.out.print("[3. 제네릭 함수형 인터페이스 : 람다] 문자열 길이 >> ");
		System.out.println(greetThree.apply("만나서 반가워요!"));
		
		// [문제 4] 제네릭 함수형 인터페이스 : 메서드 참조
		// String은 static 메서드가 아니어도 객체 생성 없이 클래스명으로 바로 참조 가능
		Function<String, Integer> greetFour = String::length;
		System.out.print("[4. 제네릭 함수형 인터페이스 : 메서드 참조] 문자열 길이 >> ");
		System.out.println(greetFour.apply("잘 부탁 드립니다~"));
		
	}

}
