package exception;

import java.util.Scanner;

class NameLengthException extends Exception {
	private static final long serialVersionUID = 1L;
	String wrongName;

	public NameLengthException(String name) {
		this.wrongName = name;
	}

	public void wrongShowName() {
		System.out.println(this.wrongName);
	}
}

public class ExceptionQuiz {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.print("이름 입력 : ");
			String name = input.next();
			try {
			if(name.length() < 2) {
				throw new NameLengthException(name);
			}
			System.out.println("입력받은 이름 : " + name);
			input.close();
			return;  
			} catch (NameLengthException e) {
				System.out.print("잘못된 이름 : ");
				e.wrongShowName();
			}
		}
		
	}

}
