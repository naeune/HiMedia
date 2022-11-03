import java.util.Scanner;

import book.BookManager;

public class AnimalBook extends book.BookManager {

	public static void main(String[] args) {

		BookManager manager = new AnimalBook();

		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.print("정보 입력할까요? (Y/N) ... ");
			String userValue = input.next();

			switch (userValue) {
			case "y": case "Y": case "Yes": case "yes": case "YES":
				manager.inputData();
				break;
			case "n": case "N": case "No": case "NO":
				System.out.println("정보 입력을 종료합니다. \n");
				manager.showBook();
				return;
			}
			
			input.close();
		}
		

	}

}
