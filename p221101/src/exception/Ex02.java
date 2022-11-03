/*
 * [예외 처리]
 * - try~catch~(finally) : 직접 처리
 * - throws : 예외 전가 --> '호출한 메서드'로 전가
 * 
 *  try {
 *  	예외 발생 가능한 코드
 *  } catch(클래스명 참조변수) {
 *  	예외가 발생했을 때, 처리할 코드
 *  } finally {
 *  	예외 발생 여부와 상관없이, 마지막에 실행되는 영역
 *  }
 *  
 *  : 예외 발생 코드의 객체의 타입 = 클래스명 타입 일치
 *  : catch 구문은 여러개 작성 가능
 */
package exception;

import java.util.Scanner;

public class Ex02 {
	// 전가 : 메서드 선언부와 바디사이에 작성
	public static void inputData() throws ArithmeticException, Exception {
		System.out.println("=== inputData method ===> start");
		Scanner input = new Scanner(System.in);

		System.out.print("정수 2개 입력 : ");
		int n1 = input.nextInt();
		int n2 = input.nextInt();

		int result1 = n1 / n2;
		int result2 = n1 % n2;
		System.out.println("몫 >> " + result1);
		System.out.println("나머지 >> " + result2);

		System.out.println("=== inputData method ===> end");

		input.close();

	}

	public static void main(String[] args) {
		System.out.println("[main method] >>> start");
		try {
			// 호출한 메서드에 전가
			inputData();
		} catch(Exception e) {
			System.out.println("e.getMessage >> " + e.getMessage());
			System.out.println("예외 처리합니다.");
			e.printStackTrace();
		}
		
		System.out.println("[main method] >>> end");
		System.out.println("<<정상 종료>>");

	}

}
