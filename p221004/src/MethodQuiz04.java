import java.util.Scanner;

/*
 * [메서드 정의]
 * - 기능 : 정수 1개를 입력 받아 팩토리얼 출력
 * - 메서드명 : factorial, 매개변수 : 1개, 리턴값 있음
 */
public class MethodQuiz04 {
	
	public static int factorial(int n) {
		
		int result = 1;
		
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		
		return result;
		
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("정수 1개 입력 : ");
		int num = input.nextInt();
		
		System.out.println(num + "! = " + factorial(num));
		
		input.close();
	}

}
