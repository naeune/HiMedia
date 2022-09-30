import java.util.Scanner;
public class IfQuizEx05 {
	public static void main(String[] args) {
		// [문제] 점수를 입력받고 학점을 출력하는 코드를 작성하시오.
		
		// 1. 점수 입력
		Scanner input = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int score = input.nextInt();
		char grade = ' '; // A, B, C
		char option = '0'; // 사이에 걸쳐진 값을 주기 위해
		
		// 2. 학점
		// 중첩 if문이 반복된 형태 -> 각각 분리해주는 게 좋음!
		if (score >= 90) {
			grade = 'A';
			
			if (score >= 97)
				option = '+';
			else if (score < 84) {
				option = '-';
			}
		} else if (score >= 80) {
			grade = 'B';
			
			if (score >= 87)
				option = '+';
			else if (score < 84)
				option = '-';
		} else if (score >= 70) {
			grade = 'C';
			
			if (score >= 77)
				option = '+';
			else if (score < 74)
				option = '-';
		} else {
			grade = 'F';
			option = ' ';
		}
		// 3. 출력
		System.out.println("당신의 학점은 " + grade + option + "입니다.");
		
		input.close(); // 주로 해당 메서드 끝나기 전에 작성
	}

}
