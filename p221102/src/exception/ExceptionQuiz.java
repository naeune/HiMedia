package exception;

import java.util.Scanner;

class NameLengthException extends Exception {
	private static final long serialVersionUID = 1L;
	String wrongName;

	public NameLengthException(String name) {
		super("이름의 길이가 1 이하입니다.");
		this.wrongName = name;
	}

	public void wrongShowName() {
		System.out.println("잘못된 이름 입력 : " + this.wrongName);
	}
}

public class ExceptionQuiz {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String name = "";

		/*
		while (true) {
			System.out.print("이름 입력 : ");
			name = input.next();
			try {
				if (name.length() < 2) {
					throw new NameLengthException(name);
				}
				System.out.println("입력받은 이름 : " + name);
				break;
			} catch (NameLengthException e) {
				e.wrongShowName();
				System.out.println(e.getMessage());
			}
		}
		*/
		
		while(true) {
			System.out.print("이름 입력 : ");
			name = input.next();
			
			if(name.length() >= 2) {
				System.out.println("입력된 이름 : " + name);
				break;
			}
			
			try {
				throw new NameLengthException(name);
			} catch(NameLengthException e) {
				e.wrongShowName();
				System.out.println(e.getMessage());
			}
		}

		input.close();

	}

}
