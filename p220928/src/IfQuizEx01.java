import java.util.Scanner;

public class IfQuizEx01 {

	public static void main(String[] args) {

		// 1. 정수 2개 입력
		Scanner input = new Scanner(System.in);
		System.out.print("정수 2개 입력 : ");
		int userValueOne = input.nextInt();
		int userValueTwo = input.nextInt();
		int max = 0, min = 0;
		
		input.close();
		
		/*
		// 2. 큰 값, 작은 값 찾기 -> 3. 출력
		// 작업 단계를 분리하는 게 바람직함
		//[첫번째 방법]
		if (userValueOne > userValueTwo)
			System.out.println("큰 값 >> " + userValueOne + ", 작은 값 >> " + userValueTwo);
		else 
			System.out.println("큰 값 >> " + userValueTwo + ", 작은 값 >> " + userValueOne);
		*/
		
		// 2. 큰 값, 작은 값 찾기
		// [두번째 방법]
		if (userValueOne > userValueTwo) {
			max = userValueOne;
			min = userValueTwo;
		} else {
			max = userValueTwo;
			min = userValueOne;
		}
		
		// 3. 출력
		System.out.println("큰 값 >> " + max + ", 작은 값 >> " + min);
	}

}
