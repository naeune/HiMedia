package quizone;
import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {

		System.out.println("*** 숫자를 맞추어 보세요(1~10) ***");

		int random = (int) (Math.random() * 10) + 1;
		int count = 0;

		Scanner input = new Scanner(System.in);

		while (true) {
			
			count++;
			
			System.out.print("숫자 입력 : ");
			int user = input.nextInt();
			String hint = "";
			
			if (random == user) {
				System.out.println(count + "번 만에 정답입니다.");
				break;
			}else if (random < user) {
				hint = "작습니다.";
			}else if (random > user) {
				hint = "큽니다.";
			}
			
			System.out.println("컴퓨터의 숫자가 더 " + hint);
		}
	
		input.close();
	}

}
