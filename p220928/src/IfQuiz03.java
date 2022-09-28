import java.util.Scanner;
public class IfQuiz03 {
	public static void main(String[] args) {

		System.out.print("정수 2개 입력 : ");
		
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		if (num1 > num2) {
			System.out.println("큰 값 : " + num1 + ", 작은 값 : " + num2);
		} else if (num2 > num1) {
			System.out.println("큰 값 : " + num2 + ", 작은 값 : " + num1);
		}
		
		input.close();
	}

}
