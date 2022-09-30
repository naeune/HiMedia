/*
 * [반복문] do~while문
 * 
 * do {
 * 
 * 
 * } while(조건식);
 * 
 * - 조건에 상관없이 반복문 처음 한 번은 꼭 실행하고자 할 때
 */
public class DoWhileEx01 {
	public static void main(String[] args) {

		int idx = 10;
		
		// [while문]
		// 실행안됨 <- 조건 false
		while (idx < 10) {
			System.out.println("idx >> " + idx);
			idx++;
		}
		
		// [do~while문]
		do { // 일단 1번 실행!
			System.out.println("idx >> " + idx);
			idx++;
		}while (idx < 13); // 일단 실행 후 조건검사
		// 두 번째 실행부터는 조건에 따라 실행 유무 변경
		
	}

}
