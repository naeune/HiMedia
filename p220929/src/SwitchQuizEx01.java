import java.util.Scanner;
public class SwitchQuizEx01 {
	public static void main(String[] args) {
		
		// [문제] 월에 따라 계절 입력하기
		// 1. 월 입력
		System.out.print("현재 월을 입력하세요 : ");
		Scanner input = new Scanner(System.in);
		int month = input.nextInt();
		String season = ""; // String 클래스에서는 빈 문자열 사용 가능
		
		// 2. 계절 구분
		switch (month) {
		case 3: case 4: case 5:
			season = "봄";
			break;
		case 6: case 7: case 8:
			season = "여름";
			break;
		case 9: case 10: case 11:
			season = "가을";
			break;
		case 12: case 1: case 2:
			season = "겨울";
		}
		
		// 3. 출력
		System.out.println("현재 계절은 " + season + "입니다.");
		
		input.close();
	}

}
