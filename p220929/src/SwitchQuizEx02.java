import java.util.Scanner;

/*
 * 사칙연산의 식과 계산된 값을 출력하시오
 * 정수 2개와 사칙연산의 기호를 입력 받아서, 식과 계산된 값을 출력
 * 단, 정수를 먼저 입력 받을 것
 */
public class SwitchQuizEx02 {
	public static void main(String[] args) {

		// 1. 입력 : 정수 2개 -> 사칙 연산 기호 1개
		Scanner input = new Scanner(System.in);
		System.out.print("정수 2개를 입력해주세요 : ");
		int userValueOne = input.nextInt();
		int userValueTwo = input.nextInt();
		
		System.out.print("사칙연산[+, -, *, /] 중 하나를 입력해주세요 : ");
		String operator = input.next();

		int result = 0;
		boolean printIs = true; // 메서드이름에 Is가 들어가는 건 여부를 물어보는 것(true/false)
		
		// 2. 식
		switch (operator) {
		case "+":
			result = userValueOne + userValueTwo;
			break;
		case "-":
			result = userValueOne - userValueTwo;
			break;
		case "*":
			result = userValueOne * userValueTwo;
			break;
		case "/":
			result = userValueOne / userValueTwo;
			break;
		default:
			printIs = false;
			System.out.println("잘못된 연산자를 입력하셨습니다!");
		}
		
		// 3. 출력
		if (printIs) // boolean 값은 어차피 true/false -> if문은 조건식이 true일 때 실행하니까 따로 == true 지정하지 않음
		System.out.println(userValueOne + operator + userValueTwo + "=" + result);
		
		input.close();
	}

}
