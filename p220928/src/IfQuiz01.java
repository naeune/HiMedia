
public class IfQuiz01 {
	public static void main(String[] args) {
		
		// [if문 사용]
		// 사용자에게 (서로 다른) 정수 2개를 입력 받은 후,
		// 큰 값, 작은 값을 출력하시오
		
		int num1 = 11, num2 = 5;
		
		if (num1 > num2) {
			System.out.print("큰 값 : " + num1 + ", 작은 값 : " + num2);
		} else if (num2 > num1) {
			System.out.print("큰 값 : " + num2 + ", 작은 값 : " + num1);
		}
	}

}
