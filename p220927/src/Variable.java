
public class Variable {

	public static void main(String[] args) {
		/*
		 * [변수]
		 * - 특정 값을 저장하기 위한 공간
		 * - 메모리 공간에 이름을 부여한 것 -> 이름을 통한 접근
		 * - 변하는 값
		 * 
		 * - 변수명 규칙
		 * 	: 숫자로 시작 불가능 -> 반드시 문자로 시작
		 * 	: 변수명의 길이 제한 없음
		 * 	: 대소문자 구분
		 * 	: 사용 가능한 기호 _ 와 $ 만 가능
		 * 	: 예약어는 변수명으로 사용 불가
		 * 
		 *	snake case : num_one
		 *	camel case : numOne
		 *	변수명은 소문자로 시작(클래스가 아님!)
		 * 
		 * [상수]
		 * - 변하지 않는 값
		 * - 기본 자료형 사용
		 * 
		 * - 정수형 상수 : int
		 * - 실수형 상수 : double
		 * 
		 * [접미사]
		 * - L : 정수형상수L	(int -> long)
		 * - F : 정수형상수F	(double -> float)
		 */
		
		// 변수 선언
		// 형태 : 자료형 변수명;
		int num;
		
		// 초기화
		num = 5;
		
		// 변수 선언과 동시에 초기화
		int var = 6;
		
		System.out.println("num >> " + num);
		System.out.println("var >> " + var);
		
		// 변수명명 규칙
		// int 5num; -> Error! (숫자로 시작)
		// int num#; -> Error! (_와 $ 기호만 사용 가능)
		// numone != numOne	(대소문자 구분)
		// int float; -> Error! (예약어는 변수명으로 사용 불가)
		
	}
	
	

}
