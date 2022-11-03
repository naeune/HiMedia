package quiz;
public class ObjectQuiz {
	public static void main(String[] args) {

		System.out.println("-- 첫번째 계산 --");
		Calculator firstCaculator = new Calculator(5, 2);
		firstCaculator.add();
		firstCaculator.sub();
		firstCaculator.mul();
		firstCaculator.div();
		
		System.out.println("\n-- 두번째 계산 --");
		Calculator secondCaculator = new Calculator(7, 0);
		secondCaculator.add();
		secondCaculator.div();
	}

}
