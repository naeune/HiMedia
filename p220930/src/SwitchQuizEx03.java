import java.util.Scanner;

public class SwitchQuizEx03 {
	public static void main(String[] args) {

		// switch문을 쓸 때는 규칙을 찾는 것을 추천!
		
		// 1. 정수 1개 입력
		Scanner input = new Scanner(System.in);
		System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하세요 : ");
		int user = input.nextInt();
		
		// 2. 컴퓨터의 랜덤값 부여
		int computer = (int)(Math.random() * 3) + 1;	// 자료형변환도 연산자
		System.out.println("당신은 " + user + "입니다.");
		System.out.println("컴퓨터는 " + computer + "입니다.");
		
		// 3. 비교 : 가위, 바위, 보
		switch(user - computer) { // 조건식에는 식, 값 상관없이 정수형이면 됨!
			case 0:
				System.out.println("비겼습니다.");
				break;
			case -2: case 1:
				System.out.println("당신이 이겼습니다.");
				break;
			case -1: case 2:
				System.out.println("당신이 졌습니다.");
				break;
		}
	
		input.close();
	}

}
