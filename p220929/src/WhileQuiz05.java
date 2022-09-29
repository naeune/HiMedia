import java.util.Scanner;
public class WhileQuiz05 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int sum = 0;
		
		while(true) {
			
			System.out.print("정수를 입력하시오(종료 -1) >> ");
			int num = input.nextInt();
			
			if (num == (-1)) {
				break;
			}
			
			sum += num;
		}

		System.out.println("총합 >> " + sum);
		
		input.close();
		
	}

}
