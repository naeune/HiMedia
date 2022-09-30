import java.util.Scanner;

public class WhileQuizEx05 {

	public static void main(String[] args) {

		// 반복문 내에서 객체 생성, 변수 선언 하지 않음 -> 비효율적
		
		Scanner input = new Scanner(System.in);
		int userNumber = 0;
		int sum = 0;
		
		// 1. 반복문 : 입력 -> 누적합
		while (true) {
			// 1-1. 입력
			System.out.print("정수를 입력하세요 : ");
			userNumber = input.nextInt();
			
			// 1-2. 탈출 조건
			if (userNumber == -1) {
				break;
			}
			
			// 1-3. 누적합
			sum += userNumber;
			
		}
		
		// 2. 누적합 출력
		System.out.println("누적합 >> " + sum);
		
		input.close();
		
	}

}
