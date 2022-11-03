package enumexample;

enum SeasonTwo {
	// [field] : 멤버 변수
	// : static final --> 상수화
	// : 따라서 외부에서 값 변경 불가능 -> 타입 변경에 안전!
	// : enum 멤버 변수는 switch문에서 사용 가능
	
	SPRING, SUMMER, FALL, WINTER;
	
	// 생성자
	// 기본적으로 private
	// private SeasonTwo() {}
}

public class Ex02 {

	public static void main(String[] args) {
		
		// 1. 객체 생성 불가능 : enum 생성자의 접근 권한 private
		// SeasonTwo seasonTwo = new SeasonTwo();
		
		// 2. 출력
		System.out.println(SeasonTwo.SPRING);
		System.out.println(SeasonTwo.SUMMER);
		
		// 3.
		SeasonTwo spring = SeasonTwo.SPRING;
		System.out.println("spring >> " + spring);
		
		SeasonTwo spring2 = SeasonTwo.SPRING;
		
		if(spring == spring2)
			System.out.println("spring과 spring2는 같다.");
		else
			System.out.println("spring과 spring2는 다르다.");
		
		// 4. 열거형의 클래스명 확인
		System.out.println(SeasonTwo.SPRING.getDeclaringClass());
		
		// 5. 열거형의 상수명 확인
		System.out.println(SeasonTwo.SPRING.name());

		// 6-1. 열거형 상수를 배열 형태로 리턴
		System.out.println(SeasonTwo.values());
		
		// 6-2. 향상된 for문
		for(SeasonTwo s: SeasonTwo.values())
			System.out.println(s);
			
		// 7. 열거형 상수(정수) 값 출력
		for(SeasonTwo s: SeasonTwo.values())
			System.out.println(s.ordinal());
			
		// 8. switch문
		SeasonTwo currentSeason = SeasonTwo.FALL;
		
		// switch문 안에 enum 타입을 넣으면 -> 따로 타입형 명시 안해도 상수처럼 사용 가능
		switch(currentSeason) {
		case SPRING:
			System.out.println("봄에는 취업을 하지요~");
			break;
		case SUMMER:
			System.out.println("여름에는 휴가를 가요~");
			break;
		case FALL:
			System.out.println("업무 향상을 위해 공부합니다!");
			break;
		case WINTER:
			System.out.println("연봉 협상합니다.");
			break;
		}
	}
		

}
