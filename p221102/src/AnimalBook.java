import book.BookManager;

public class AnimalBook {
	
	private static BookManager manager = new BookManager();
	
	public static void main(String[] args) {
		
		menu:
		while (true) {
			System.out.print("정보 입력할까요? (Y/N) ... ");
			manager.userValue = manager.input.next();

			switch (manager.userValue) {
			case "y": case "Y": case "Yes": case "yes": case "YES":
				manager.inputData();
				break;
			case "n": case "N": case "No": case "NO": case "no":
				System.out.println("정보 입력을 종료합니다.\n");
				break menu;
			default:
				System.out.println("Y/N 둘 중 하나를 입력하세요...");
			}
		}
		
		System.out.println("<< 저장 목록 >>");
		manager.showBook();
		manager.input.close();

	}

}
