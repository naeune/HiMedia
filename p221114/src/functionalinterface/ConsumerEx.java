package functionalinterface;

import java.util.Arrays;
import java.util.function.Consumer;

public class ConsumerEx {
	public static void main(String[] args) {

		// Consumer<T> ==============================
		// accept(T t) : 매개변수 1개, 리턴값 없음
		// lambda : (parameter) -> expression
		// ==========================================
		
		// ex) 메서드 내에 메서드 정의 안됨
	
		Consumer<String> consumer = (str) -> System.out.println(str.split(" ")[1]); // return 아니고 expression
		// String s = "오늘도 즐거운 하루";
		// consumer.accept(s);
		consumer.accept("오늘도 즐거운 하루");

		
		// cf) 문자열.split()
		System.out.println("문자열 나누기 작업 중".split(" ")); // 1차원 배열의 주소 값 출력
		System.out.println("문자열 나누기 작업 중".split(" ")[0]);
		
		String[] s = "문자열 나누기 작업 중".split(" ");
		System.out.println(Arrays.toString(s));
		System.out.println("s[0] : " + s[0]);
		
		// 문자열을 공백 기준으로 2개로 나누세요.
		String[] s2 = "문자열 나누기 작업 중".split(" ", 2);
		System.out.println(Arrays.toString(s2));

		// 문자열을 공백 기준으로 10개로 나누세요.
		// 나눌 수 있는 만큼만 나눔
		String[] s3 = "문자열 나누기 작업 중".split(" ", 10);
		System.out.println(Arrays.toString(s3));
	}
	void show(String str) {
		System.out.println(str);
	}
}
