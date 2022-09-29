//import 단축키 : cmd + shift + o
import java.util.Scanner;
public class OperatorQuizEx01 {

	public static void main(String[] args) {

		// 1. 정수 2개 입력 받기
		Scanner input = new Scanner(System.in);
		System.out.print("정수 2개를 입력하세요 : ");
		int userValueOne = input.nextInt();
		int userValueTwo = input.nextInt();
		int max = 0;
		// max 변수를 깨끗하게 비워주기 위해 0으로 초기화
		
		// 2. 큰 값 찾기
		/*
		 * [첫번째 방법] 삼항 연산자
		 * int max = (userValueOne > userValueTwo) ? userValueOne : userValueTwo;
		 * 		
		 */

		// 조건 2개의 if문 형식으로 작성 가능
		// [두번째 방법] if문
		if (userValueOne > userValueTwo) {
			max = userValueOne;
		} else {	// else if (userValueOne < userValueTwo)
			max = userValueTwo;
		}

		// 3. 큰 값 출력
		System.out.println("큰 값 >> " + max);
		
		input.close();
	}

}
