package quiz;

@FunctionalInterface
interface Mood {
	String howAreYouFeeling(String feel);
}

// [문제 1] ================================================
// Person 클래스 정의
// : Person class는 Mood interface를 상속 받는다.

class Person implements Mood {
	public Person() {
		
	}
	
	@Override
	public String howAreYouFeeling(String feel) {
		return "[문제 2] 오늘 기분 : " + feel;
	}
}

public class AnonymousQuiz {
	public static void main(String[] args) {

		// [문제 2] ========================================
		// 객체 생성
		Mood instance = new Person();
		String one = instance.howAreYouFeeling("똑같아!");
		System.out.println(one);
		
		// [문제 3-1] ======================================
		// 익명 클래스로 구현
		// howAreYouFeeling() 메소드의 인수 : "괜찮아~"
		Mood mood = new Mood() {
			@Override
			public String howAreYouFeeling(String feel) {
				return "[문제 3-1] 난 익명클래스야~ 내 기분은..." + feel;
			}
		};
		
		String two = mood.howAreYouFeeling("괜찮아~");
		System.out.println(two);
		
		// 출력
		
		// [문제 3-2] ======================================
		// System.out.println() 메소드 내 익명 클래스 구현
		// howAreYouFeeling() 메소드의 인수 : "신기해"
		System.out.println(new Mood() {
			@Override
			public String howAreYouFeeling(String feel) {
				return "[문제 3-2] 난 람다식으로 표현되었어~ 내 기분은..." + feel;
			}
		}
		.howAreYouFeeling("신기해")
		);
		
	}
}
