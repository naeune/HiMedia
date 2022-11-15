package quizone;
import java.util.Scanner;

public class Quiz01 {
	
	public static int factorial(int num) {
		if(num == 1)
			return 1;
		else 
			return num * factorial(num - 1);
	}

	public static void main(String[] args) {

 		Scanner input = new Scanner(System.in);
 		int userValue;

		while(true) {
			System.out.print("1~10 사이의 정수 입력 : ");
			userValue = input.nextInt();
			
			if(userValue >= 1 && userValue <= 10) {
				break;
			}
		}
		
		System.out.println(userValue + "! = " + factorial(userValue));

		input.close();
	}

}
