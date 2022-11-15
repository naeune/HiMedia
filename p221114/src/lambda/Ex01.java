/*
 * [람다] lambda expression 람다 표현식(람다식)
 * : JDK 1.8(Java 8)부터 함수형 프로그래밍 지원을 위해 Lambda, Stream 도입
 * : 메서드를 하나의 식으로 표현
 * : lambda는 익명 함수(anonymous function) --> 메서드명 없음 cf) 메서드 : 클래스 내 멤버
 * : 사실상 객체로 관리
 * 
 * << Syntax >>
 * () -> expression

 * ✦(parameter) -> expression
 * 
 * (parameter) -> {
 * 	code;
 * 	code;
 * 	return 값;
 * } 
 * 
 * cf) 메서드 정의 형태
 * 반환형 메서드명(타입 매개변수) {
 * 	code;
 * 	code;
 * 	return 값;
 * }
 * 
 * << 특징 >>
 * - 메서드명과 반환형 생략 가능, return 키워드 대신 식(expression) 사용
 * - 람다식 내 지역변수 final
 * 
 * << 장점 >>
 * - 코드가 간결
 * - 식에 개발자 의도가 명확히 드러나, 가독성 높아짐
 * - 메서드 정의 없이 한번에 처리 가능하므로 생산성 높아짐
 * 
 * << 단점 >>
 * - 익명함수이므로 재사용 불가능
 * - 디버깅 어려움
 * - 재귀로 부적합
 * 
 * << 활용 >>
 * 1. 참조변수에 저장
 * 2. 인수
 * 3. return 값
 */

package lambda;

// [함수형 인터페이스]
// : 반드시 하나의 추상 메서드가 정의
// : 람다식을 다루기 위한 인터페이스
// : 람다식과 인터페이스의 추상 메서드가 1:1로 연결
@FunctionalInterface
interface Mood {
	// abstract method : 추상 메서드
	String howAreYouFeeling(String feel);
	
	default void show() {
		System.out.println("interface 내 일반 메서드");
	}
	
	static void print() {	// static 메서드
		System.out.println("interface 내 static 메서드");
	}
}

class Person implements Mood {
	@Override
	public String howAreYouFeeling(String feel) {
		return "오늘 기분 : " + feel;
	}
}

public class Ex01 {
	public static void main(String[] args) {
		
		// 1. 객체 생성
		Mood instance = new Person();
		String one = instance.howAreYouFeeling("똑같아~");
		System.out.println(one);
		
		// 2-1. 익명 클래스
		Mood moodAnonymous = new Mood() {
			
			@Override
			public String howAreYouFeeling(String feel) {
				return "난 익명 클래스야~ 내 기분은... " + feel;
			}
		};
		
		System.out.println("moodAnonymous >> " + moodAnonymous.howAreYouFeeling("괜찮아~"));
		
		//  2-2. 익명 클래스
		System.out.println("바로 출력 >>");
		System.out.println(new Mood() {
			@Override
			public String howAreYouFeeling(String feel) {
				return "난 더 간단해진 익명 클래스야~ 내 기분은... " + feel;
			}
		}.howAreYouFeeling("신기해"));
		
		// << interface의 메서드를 람다식으로 표현 >>
		// 3-1. [방법 1] 참조변수에 저장 : method명, 반환형 생략, 매개변수 정보(타입, 매개변수명)만 입력
		/*
		Mood moodAnonymous = new Mood() {
				
			@Override
			public String howAreYouFeeling(String feel) {
				return "난 익명 클래스야~ 내 기분은... " + feel;
			}
		};
		*/
		
		Mood lambdaOne = (String feel) -> "[방법 1] 제 기분은... " + feel;
		String strOne = lambdaOne.howAreYouFeeling("그냥 그래");
		System.out.println(strOne);
		
		// 3-2. [방법 2] 참조변수에 저장 : method명, 반환형, 매개변수 타입 생략
		Mood lambdaTwo = (arg) -> "[방법 2] 제 기분은... " + arg;
		System.out.println(lambdaTwo.howAreYouFeeling("좋아요~"));
		
		// 3-3. [방법 3] 인수
		
		/*
		System.out.println(new Mood
			(feel) -> "제 기분은..." + feel);
		*/
	}


}
