import java.util.Scanner;
public class SwitchQuiz01 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("현재 월을 입력하세요 >>> ");
		int month = input.nextInt();
		String season = "";
		
		switch (month / 3) {
		case 0:
			season = "겨울";
			System.out.println("현재의 계절은 " + season + "입니다.");
			break;
		case 1:
			season = "봄";
			System.out.println("현재의 계절은 " + season + "입니다.");
			break;
		case 2:
			season = "여름";
			System.out.println("현재의 계절은 " + season + "입니다.");
			break;
		case 3:
			season = "가을";
			System.out.println("현재의 계절은 " + season + "입니다.");
			break;
		default:
			season = "겨울";
			System.out.println("현재의 계절은 " + season + "입니다.");
		
		input.close();
		
		}
		
	}

}
