/*
 * [메서드 오버로딩]
 * 같은 이름의 메서드를 여러 개 정의
 * 단, 매개변수의 정보가 달라야 함 (자료형, 개수)
 * 리턴형과는 관계 없음
 */
public class MethodEx05 {

	// [메서드 정의]
	// 기능 : 정수 2개를 받은 후, 덧셈한 결과를 출력
	public static void sum(int n1, int n2) {
		int result = n1 + n2;
		System.out.println("덧셈 결과 >> " + result);
	}
	
	public static void sum(double n1, double n2) {
		double result = n1 + n2;
		System.out.println("덧셈 결과 >> " + result);
	}
	
	/*
	public static void sum(int num1, int num2) { -> 오버로딩 X, 그냥 같은 함수임(컴파일러 오류 발생)
		
	}
	*/
	
	/*
	public static int sum(int n1, int n2) { -> 오버로딩 X, 반환형은 메서드 오버로딩의 구분 기준이 아님
		return n1 + n2;
	}
	*/
	
	public static void sum(int n1) { // 오버로딩 O
		
	}
	
	public static void sum(int n1, double n2) { // 오버로딩 O, 각각의 매개변수 자료형과 비교
		
	}
	
	public static void sum(double n1, int n2){	// 오버로딩 O
		
	}
	
	// main method
	public static void main(String[] args) {
		sum(3, 5); // 매개변수 자료형에 맞는 함수를 알아서 찾아서 실행
		sum(2.1, 4.5);
		
	}

}
