
public class WhileEx02 {
	public static void main(String[] args) {

		// [문제] 반복문 while을 사용하여 1~10까지 출력
		// [출력형태]
		// 1 2 3 4 5 6 7 8 9 10
		
		int num = 1;		// 초기값
		
		while (num < 11) {	// 조건식
			System.out.print(num + " ");
			num++;			// 증감식
		}
		
		// System.out.println("num >> " + num);
	}

}
