
public class ForQuiz01 {
	public static void main(String[] args) {

		for (int i = 1; i < 11; i++) {
			
			if (i % 2 == 1) 
				continue;
			
			System.out.println("2 * " + i + " = " + (2 * i));
		}
		
	}

}
