import java.util.Scanner;
public class OperatorQuiz01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("서로 다른 정수 2개 입력 : ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		int result = (num1 > num2) ? num1 : num2;
		System.out.println("큰 값 : " + result);
		
		input.close();
	}

}
