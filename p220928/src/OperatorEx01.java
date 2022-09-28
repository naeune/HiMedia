
public class OperatorEx01 {

	public static void main(String[] args) {

		// 변수 선언과 동시에 초기화
		// 변수가 먼저 생성된 후 값 대입
		//int num1 = 5
		//int num2 = 3;
		
		int num1 = 5, num2 = 3;
		// int ex, float fo; <- Error!!
		
		/*
		 * [산술 연산자]
		 * +(덧셈), -(뺄셈), 곱셈(*), 몫(/), 나머지(%)  
		 * 나머지 연산자(%)
		 * --> 짝수, 홀수, n의 배수 찾을 때 사용
		 */
		
		System.out.println("덧셈 >> " + num1 + num2);
		// int가 String으로 자동 형 변환
		System.out.println("덧셈 >> " + (num1 + num2));
		System.out.println(num1 + num2 + " >> 덧셈");
		System.out.println("뺄셈 >> " + (num1 - num2));
		// 괄호가 없으면 오류 발생(연산자 '-'는 문자열과 정수 타입에 대한 정의X)
		System.out.println("곱셈 >> " + (num1 * num2));
		// 연산자 우선순위에 의해 *,/가 먼저 처리되기 때문에 괄호 없이도 출력
		System.out.println("몫 >> " + (num1 / num2));
		System.out.println("나머지 >> " + (num1 % num2));
		
		
		
		
		
		
	}

}
