import java.util.Scanner;
/*
 * [메서드 정의]
 * - 기능 : 정수 2개를 받아서 몫 출력
 * 		   출력형태 : 나눗셈 결과 >> 2
 * 				  : 분모가 0일 경우, "분모가 0으로 계산 불능"
 * - 메서드명 : divide, 매개변수 : 2개, 리턴값 : 없음
 */
public class MethodQuiz03 {
	
	public static void divide(int n1, int n2) {
		
		if (n2 != 0) {
			int result = n1 / n2;
			System.out.println("나눗셈 결과 >> " + result);
		} else if (n2 == 0) {
			System.out.println("분모가 0으로 계산 불능");
		}
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("정수 2개 입력 : ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		divide(num1, num2);
		
		input.close();
	}

}
