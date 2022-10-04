import java.util.Scanner;

public class NestedLoopQuizEx04 {
	public static void main(String[] args) {

		// 1. 0 또는 1 입력받기
		Scanner input = new Scanner(System.in);
		System.out.print("짝수단은 0, 홀수단은 1 입력 >> ");
		int dan = input.nextInt();
		
		// 2. 짝수단, 홀수단 구분
		/*
		int startDan = 0;
		if (dan == 0)
			startDan = 2;
		else
			startDan = 3;
		*/
		
		// 삼항연산자로 바꿀 수 있음
		int startDan = (dan == 0) ? 2 : 3;
			
		// 3. 구구단 출력
		for (int i = startDan; i < 10; i += 2) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
			
			System.out.println();
		}
		
		input.close();
	}

}
