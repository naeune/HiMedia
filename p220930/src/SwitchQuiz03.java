import java.util.Scanner;
public class SwitchQuiz03 {
	public static void main(String[] args) {

		// [문제] 컴퓨터와 가위바위보
		
		Scanner input = new Scanner(System.in);
		System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력 >>> ");
		int rsp = input.nextInt();
		System.out.println("당신은 " + rsp + "입니다.");
		
		int rspCom = (int)(Math.random() * 3) + 1;
		System.out.println("컴은 " + rspCom + "입니다.");
		
		String result = "";
		boolean same = true;
		
		switch (rsp) {
		case 1:
			if (rspCom == rsp) {
				System.out.println("비겼습니다!");
				same = false;
			}
			else if (rspCom == 2)
				result = "졌습니다.";
			else
				result = "이겼습니다.";
				break;
			
		case 2:
			if (rspCom == rsp) {
				System.out.println("비겼습니다!");
				same = false;
			}
			else if (rspCom == 3)
				result = "졌습니다.";
			else
				result = "이겼습니다.";
				break;
			
		case 3:
			if (rspCom == rsp) {
				System.out.println("비겼습니다!");
			}
			else if (rspCom == 1)
				result = "졌습니다.";
			else
				result = "이겼습니다.";
				break;
			
		default:
			System.out.println("잘못된 숫자를 입력하셨습니다!");
			same = false;
		}
		if (same)
			System.out.println("당신이 " + result);
		
		input.close();
	}

}
