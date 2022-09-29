import java.util.Scanner;

public class SwitchQuiz02 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("정수 2개를 입력해주세요 : ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int value = 0;
		
		System.out.print("사칙연산 중 하나를 입력해주세요 >> ");
		String op = input.next();
		
		switch (op) {
		case "+":
			value = num1 + num2;
			break;
		case "-":
	 		value = num1 - num2;
			break;
		case "*":
			value = num1 * num2;
			break;
		case "/":
			value = num1 / num2;
			break;
		default:
			System.out.println("잘못된 사칙연산 기호를 입력하셨군요!");
			input.close();
			return;
		}
		
		System.out.println(num1 + " " + op + " " + num2 + " = " + value);		
		input.close();
	}

}
