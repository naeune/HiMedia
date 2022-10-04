/*
 * method : 메서드, 메소드
 * - 기능, 동작
 * - 정의 후 호출
 * 
 * - 정의 형태
 * 반환형 메서드명(매개변수1, 매개변수2) {
 * 	명령어;
 *	명령어;
 *	return 값;
 *}
 *
 * - 호출 형태
 * 메서드 명(값1, 값2)
 */

public class MethodEx01 {
	
	// 메서드 정의
	// 메서드 정의 형태 : 매개변수 없음, return 없음
	public static void show() {
		System.out.println("show() 메서드 실행됨");
	}
	
	public static void main(String[] args) {
		System.out.println(">>> main() 메서드 실행 : 시작");
		// 메서드 호출
		show();
		System.out.println(">>> main() 메서드 실행 : 종료");
		
		
	}

}
