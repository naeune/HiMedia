import java.util.Scanner;
public class IfQuizEx04 {
	public static void main(String[] args) {
		// [문제] 점수 입력 받은 후 학점 출력
		
		// 1. 점수 입력
		// 실행 후 콘솔창에 입력할 때 아래방향키 누르면 커서가 문장 끝으로 이동
		Scanner input = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int score = input.nextInt();
		char grade;// 초기화를 안하면 나중에 오류가 생길 가능성 발생 -> 안정성을 위해 초기화 권장
		
		/*
		 * [첫번째 방법]
		// 2. 점수에 따른 학점 출력
		if (score >= 90)
			System.out.println("당신의 학점은 A입니다.");
		else if (score >= 80)
			System.out.println("당신의 학점은 B입니다.");
		else if (score >= 70)
			System.out.println("당신의 학점은 C입니다.");
		else
			System.out.println("당신의 학점은 D입니다.");
		*/
		
		// [두번째 방법]
		// 2. 점수에 따른 학점 지정
		if (score >= 90)
			grade = 'A';
		else if (score >= 80)
			grade = 'B';
		else if (score >= 70)
			grade = 'C';
		else
			grade = 'D';
		
		// 3. 학점 출력
		System.out.println("당신의 학점은 " + grade + "입니다.");
		
		
		input.close(); // 리소스(자원) 할당 받는 코드 작성 때 같이 써주기!
	}

}