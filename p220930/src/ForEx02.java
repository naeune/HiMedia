/*
 * [문제] for문을 사용하여, 2단을 출력하시오.
 */
public class ForEx02 {
	public static void main(String[] args) {

		// <WhileQuiz02>
		
		// int idx = 1;
	
		for (int idx = 1; idx < 10; idx++) { // for문 내에서 선언 + 초기화 가능 -> for문 실행이 끝나면 자동 소멸
			System.out.println("2 * " + idx + " = " + (2 * idx));
		}
	}

}
