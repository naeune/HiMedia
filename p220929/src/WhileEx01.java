/*
 * [반복문]
 * 
 * 초기값 설정;
 * 
 * while (조건식) { // 조건이 true일 동안 반복, 처음으로 false가 되는 순간 탈출
 * 	명령문;
 *	증감식;
 * }
 * 
 */

public class WhileEx01 {
	public static void main(String[] args) {
		
		/*
		int num = 1;
		
		
		System.out.println(num);
		num++; // 선증가, 후증가 둘 다 상관없다면 후증가를 주로 사용함
		
		System.out.println(num);
		num++;
		
		System.out.println(num);
		num++;
		*/
		
		int num = 1;	  // 초기값
		
		while (num < 4) { // 조건식	while문 실행 시 제일 먼저 조건검사 진행 
			System.out.println(num);
			num++;		  // 증감식
		}
		
		System.out.println("반복문 실행 후 num : " + num);
		System.out.println("<<프로그램 종료>>");
	}

}
