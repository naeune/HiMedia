import java.util.Scanner;
public class IfQuiz05 {

	public static void main(String[] args) {

		System.out.print("점수를 입력하세요 >> ");
		
		Scanner input = new Scanner(System.in);
		int score = input.nextInt();
		String grade = "";
		
		input.close();
		
		if (score >= 97)
			grade = "A+";
		else if (score >= 94)
			grade = "A0";
		else if (score >= 90)
			grade = "A-";
		else if (score >= 87)
			grade = "B+";
		else if (score >= 84)
			grade = "B0";
		else if (score >= 80)
			grade = "B-";
		else if (score >= 77)
			grade = "C+";
		else if (score >= 74)
			grade = "C0";
		else if (score >= 70)
			grade = "C-";
		else if (score < 70)
			grade = "F";
		
		System.out.println("당신의 학점은 " + grade + "입니다.");

		
		
	}

}
