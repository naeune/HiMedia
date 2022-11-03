// 1. package : 현재 파일이 속한 경로
package first;

// 2. import

// 3. class

/*
 * [접근 제어자] 접근 권한, 접근 제어 지시자
 * - 클래스, 멤버 변수, 메서드, 생성자에 사용
 * 
 * - 접근 제어자     : private	 <	default	  <	 protected	 <	public
 * - 접근 허용 범위	  : 클래스 내		같은 패키지	 상속 관계			누구나
 * 
 */
public class AccessEx01 {
	// 멤버 변수 : instance variable
	private int one = 1;
	int two = 2;
	protected int three = 3;
	public int four = 4;
	
	// 멤버 메서드 : instance method
	void show() {
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		System.out.println(four);
	}
	

}
