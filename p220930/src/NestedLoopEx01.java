
public class NestedLoopEx01 {
	public static void main(String[] args) {

		// 중첩 for문
		outer: // 이름(라벨) 부여
		for (int i = 0; i < 3; i++) {
			System.out.println("*** 바깥쪽 for문 " + (i + 1) + "차 회전 ***");
			
			for (int j = 0; j < 3; j++) {
				System.out.println("안쪽 for문 " + (j + 1) + "차 회전");
				
				if (i % 2 == 0)
					break outer; // outer 반복문 탈출
			}
		}
		
	}

}
