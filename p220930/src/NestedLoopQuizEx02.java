
public class NestedLoopQuizEx02 {
	public static void main(String[] args) {

		
		int i = 2;			// 초기값
//		int j = 1;
			
		
		while (i < 10) {	// 조건식 -> 변수 선언 불가
			int j = 1; 		// while 영역 안에서만 사용 가능
			while (j < 10) {
				System.out.println(i + " * " + j + " = " + (i*j));
				j++;
			}
			
			i++;			// 증감식
			System.out.println();
		}
		
	}

}
