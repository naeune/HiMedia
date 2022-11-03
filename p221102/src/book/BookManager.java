package book;

import java.util.Scanner;

public class BookManager {

	final private int MAX_CNT = 100;
	private int index = 0;
	private AnimalInfo[] infoStorage = new AnimalInfo[MAX_CNT];

	public void inputData() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("<< 정보를 입력하세요 >>");
		System.out.print("1. 이름 : ");
		String userName = scanner.next();
		System.out.print("2. 나이 : ");
		int userAge = scanner.nextInt();
		System.out.println("데이터 입력이 완료되었습니다. \n");
		infoStorage[index++] = new AnimalInfo(userName, userAge);
		
		scanner.close();
	}
	

	public void showBook() {
		System.out.println("<< 저장 목록 >>");
		for (AnimalInfo a : infoStorage)
			if(a != null) 
				a.showAnimalInfo();
	}
	
}
