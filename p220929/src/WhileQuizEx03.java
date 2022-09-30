
public class WhileQuizEx03 {
	public static void main(String[] args) {

		// 1 + 2 + 3 + 4 + ... + 9 + 10
		// while문의 조건문은 반복횟수에 관한 조건
		
		int index = 1; // 조건식에서 사용할 변수
		int sum = 0;   // 저장할 공간
		
		while (index < 11) {
			// sum = sum + index;
			sum += index;	// sum에 index 누적해서 대입
			// index = index + 1;
			index++;
		}
		
		System.out.println("누적합 >> " + sum);
	}

}
