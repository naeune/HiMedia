
public class NestedLoopQuizEx03 {
	public static void main(String[] args) {

		// 배열에서도 사용하는 개념
		for (int i = 0; i < 3; i++) {	// 행과 관련
			for (int j = 0; j < 3; j++) { // 열과 관련
				if (i == j)
					System.out.print(1);
				else
					System.out.print(0);
			}
			
			System.out.println();
		}
		
	}

}
