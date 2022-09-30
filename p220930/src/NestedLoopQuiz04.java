import java.util.Scanner;
public class NestedLoopQuiz04 {
	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		System.out.print("짝수 단은 0, 홀수 단은 1을 입력 : ");
		int printDan = input.nextInt();
	
		int i = 0, j = 0;
		
		for (i = 2; i < 10; i++) {
			for (j = 1; j < 10; j++) {
				
				if (printDan == 0 &&  i % 2 == 0)
					System.out.println(i + " * " + j + " = " + (i * j));
				else if (printDan == 1 && i % 2 == 1)
					System.out.println(i + " * " + j + " = " + (i * j));
			}
			
			System.out.println();
		}
		
		input.close();
	}

}
