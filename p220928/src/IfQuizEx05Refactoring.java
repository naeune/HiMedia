import java.util.Scanner;
public class IfQuizEx05Refactoring {
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
		
		// 학점 옵션(-, 0, +) 할당
		// 이 if문을 아래에 넣으면 else의 option값이 바뀌기 때문에 위에 넣어줘야함!
		if ((score % 10) >= 7 || score == 100) // 점수가 100점이거나 일의 자리가 7 이상
											   // true 빈도가 낮을 것 같은 조건을 뒤에 작성
			option = '+';
		else if ((score % 10) <= 3)
			option = '-';
		
		// 학점(A,B,C) 할당
		if (score >= 90) 
			grade = 'A';
		else if (score >= 80)
			grade = 'B';
		else if (score >= 70)
			grade = 'C';
		else {
			grade = 'F';
			option = ' ';
		}
	
		// 3. 출력
		System.out.println("당신의 학점은 " + grade + option + "입니다.");
		
		input.close(); // 주로 해당 메서드 끝나기 전에 작성
	}

}
