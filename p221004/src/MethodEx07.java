import java.util.Scanner;

public class MethodEx07 {
	
	public static void main(String[] args) {

		int num = 5;
		
		/*
		num++;
		System.out.println(num);		// 반복
		*/
		
		increment(num);
		
		Scanner input = new Scanner(System.in);
		System.out.print("정수 1개 입력 : ");
		int userValue = input.nextInt();
		
		/*
		userValue++;
		System.out.println(userValue); 	// 반복
		*/
		
		increment(userValue);
		
		int var = 10;
		
		/*
		var++;							// 반복
		System.out.println(var);
		*/
		
		increment(var);
		
		
		input.close();
		
	} // End main method
	
	// [메서드 정의]
	public static void increment(int num) {
		num++;
		System.out.println(num);
	}

} // End Class
