import java.util.Scanner;
public class WhileQuiz04 {
	public static void main(String[] args) {

		// 무한루프 활용
		Scanner input = new Scanner(System.in);
		System.out.print("1~10 사이의 정수 1개 입력 >> ");
		int num = input.nextInt();
		int randomValue = 0;
		int count = 0;
		input.close();
		
		while(true) {
			count++;
			randomValue = (int)(Math.random() * 10) + 1;
			
			if (num == randomValue) {
				System.out.println(num);
				break;
			}
			
			System.out.print(randomValue + " ");
		}
		System.out.println(count + "회 실행해서 찾았다!");
		
		
	}

}
