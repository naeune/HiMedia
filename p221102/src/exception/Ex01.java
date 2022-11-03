package exception;

import java.util.Scanner;

class Check extends Exception {
	private static final long serialVersionUID = 1L;
	int num;
	
	public Check(int num) {
		super("Error!! 음수 값 입력!!!");
		this.num = num;
	}
	
	
}

public class Ex01 {
	public static void main(String[] args)  {
		
		// 자원 할당
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요... ");
		int userValue = input.nextInt();

		// 자원 해제
		input.close();
		
		if(userValue < 0) {
			try {
				// throw(예외 객체 생성 후 예외 발생)
				throw new Check(userValue);
			} catch (Check e) {
				// System.out.println(e);
				// System.out.println(e.getMessage());
				e.printStackTrace();
				return;
			}
		}
		
		System.out.println("입력된 값 >> " + userValue);
		
	}

}
