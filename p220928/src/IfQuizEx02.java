import java.util.Scanner;
public class IfQuizEx02 {
	public static void main(String[] args) {

		// if문 사이에 화이트 라인 만들지 않기!
		// 1. 성별 입력
		Scanner input = new Scanner(System.in);
		System.out.print("성별 1 또는 2를 입력하세요 : ");
		int gender = input.nextInt();
		
		// 2. 성별 출력
		if (gender == 1)
			System.out.println("남자입니다.");
		else if (gender == 2)
			System.out.println("여자입니다");
		else
			System.out.println("잘못된 값을 입력하셨습니다!");
		
		input.close(); // 리소스(스캐너 스트림) 반납
		
	}

}
