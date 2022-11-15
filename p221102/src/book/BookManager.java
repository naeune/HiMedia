package book;

import java.util.Scanner;

public class BookManager{

	private final int MAX_CNT = 100;
	private AnimalInfo[] infoStorage = new AnimalInfo[MAX_CNT];
	private int index = 0;
	public Scanner input = new Scanner(System.in);
	public String userValue;
	
	public void inputData() {
		
		System.out.println("<< 정보를 입력하세요 >>");
		System.out.print("1. 이름 : ");
		String userName = input.next();
		System.out.print("2. 나이 : ");
		int userAge = input.nextInt();
		System.out.println("데이터 입력이 완료되었습니다. \n");
		infoStorage[index++] = new AnimalInfo(userName, userAge);
	}
	

	public void showBook() {
		for (AnimalInfo a : infoStorage)
			if(a != null) 
				a.showAnimalInfo();
	}
	
}
