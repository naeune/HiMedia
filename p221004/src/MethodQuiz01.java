import java.util.Scanner;

/*
 * [메서드 정의 후 호출]
 * - 기능 : 인수로 양의 정수 2개를 받아, (정수 사이의) 누적합 계산 후 출력
 * - 메서드명 : add, 매개변수 : 2개, 리턴값 : 없음
 */
public class MethodQuiz01 {
	
	public static void add(int n1, int n2) {
		
		int sum = 0;
		
		if (n1 < n2) {
			for (int i = n1; i <= n2; i++) {
				sum += i;
			}
			System.out.println(n1 + "~" + n2 + "의 누적합 >> " + sum);
			
		} else if (n1 > n2) {
			for (int i = n2; i <= n1; i++) {
				sum += i;
			}
			System.out.println(n2 + "~" + n1 + "의 누적합 >> " + sum);
		}
	}
		
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("정수 2개 입력 : ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		add(num1, num2);
		
		input.close();
	}

}
