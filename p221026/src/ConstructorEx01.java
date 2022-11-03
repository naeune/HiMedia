/*
 * [생성자] constructor
 *   << 생성자 사용 이유 >>
 * - 객체 생성하면서, 멤버변수 초기화
 * - 객체 생성하면서, 원하는 기능을 실행하기 위해(특정 멤버 메서드 호출 -> 자동 호출 효과)
 * 
 * - 객체 생성 시, 무조건 하나의 생성자 호출(실행)
 * - 생성자는 '메서드'이다. -> '메서드 오버로딩' 가능 -> 생성자 여러 개 정의 가능
 * 	 cf) 메서드 오버로딩
 * 		 * 메서드명이 같고, 매개변수의 정보가 다름
 * 		 				(자료형, 개수)
 * 		 * 단, 반환형과는 관련 없음
 * - 생성자는 반환값이 없다. -> 반환형을 명시하지 않음 (void, String ... )
 * 
 * - 생성자명은 클래스명과 같아야 함
 * 
 *   << default constructor >>
 * - 생성자를 명시하지 않으면, 기본 생성자가 실행됨
 * - 매개변수가 없고, 하는 일도 없다 --> 형식상 실행
 * - 생성자가 하나라도 명시되어 있다면, 기본 생성자는 실행되지 않음 
 * - 우리 눈에 보이지 않음, 명시하면 기본 생성자가 아님
 * 
 */


class Cat {
	// 멤버 변수 : 인스턴스 변수(객체 변수)
	String name;
	
	// 생성자
	public Cat() {					// 매개변수가 없는 생성자
		System.out.println("생성자 실행됨");
	}
	public Cat(String name) {		// 매개변수가 1개인 생성자
		this.name = name;
	}

	// 멤버 메서드 : 인스턴스 메서드(객체 메서드)
	// setter, getter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}


public class ConstructorEx01 {
	public static void main(String[] args) {
		
		// 인스턴스(객체) 생성
		Cat cat = new Cat("호랑이");
		// cat.setName("나비");
		System.out.println("우리집 고양이 이름 : " + cat.getName());
	}

}
