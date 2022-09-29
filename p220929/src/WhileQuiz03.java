
public class WhileQuiz03 {
	public static void main(String[] args) {

		int num = 1;
		int sum = 0;
		
		while (num < 11) {
			sum += num;
			num++;
		}
		
		System.out.println("1~10 누적합 : " + sum);
		
	}

}
