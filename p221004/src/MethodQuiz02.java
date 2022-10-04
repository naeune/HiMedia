import java.util.Scanner;
/*
 * [메서드 정의]
 * - 기능 : 정수 1개를 받아서 제곱값 출력
 * 		   출력 형태 : 2의 제곱은 4입니다.
 * - 메서드명 : square, 매개변수 : 1개, 리턴값 없음
 */
public class MethodQuiz02 {

	public static void square(int n) {
		int result = n * n;
		System.out.println(n + "의 제곱은 " + result + "입니다.");
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("정수 1개 입력 : ");
		int num = input.nextInt();
		
		square(num);
		
		input.close();
	}

}
