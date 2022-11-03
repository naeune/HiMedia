/*
 * [열거형] enum
 * : JDK 1.5부터 추가
 * : 열거형 상수 -> 값 변경 금지
 * : 멤버 변수는 모두 대문자로 사용
 * : 관련 있는 상수들을 하나의 이름으로 관리
 * : 첫번째 멤버가 0부터 시작하여 1씩 자동으로 증가
 */
package enumexample;

// class로 enum(열거형) 구현
class Season {
	
	// 객체 생성
	static final Season SPRING = new Season("SPRING");
	static final Season SUMMER = new Season("SUMMER");
	static final Season FALL = new Season("FALL");
	static final Season WINTER = new Season("WINTER");
	
	
	private String name;
	
	// 생성자 : private --> 외부 객체 생성 불가능
	private Season(String name) {
		this.name = name;
	}
	
	// member method
	@Override
	public String toString() {
		return this.name;
	}
}


public class Ex01 {
	public static void main(String[] args) {
		System.out.println(Season.SPRING);
	}

}
