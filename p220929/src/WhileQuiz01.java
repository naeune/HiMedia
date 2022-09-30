
public class WhileQuiz01 {
	public static void main(String[] args) {

		// [문제] whileEx04.java 파일의 코드를 변경하시오.
		// continue를 사용하지 않고, 같은 결과가 출력되도록 하시오.
		
		int idx = 0;
		
		while (idx < 10) {
			idx++;
			
			if (idx % 2 == 0) { // continue를 안쓰면 코드 직관성이 높아짐
				System.out.println("idx >> " + idx);
			}
			
		}
		
	}

}
