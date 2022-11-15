import phone.MenuViewer;
import phone.PhoneBookManager;

public class PhoneBook {

	public static void main(String[] args) {

		MenuViewer viewer = new MenuViewer();
		PhoneBookManager manager = new PhoneBookManager();
		
		menu:
		while(true) {
			viewer.showMenu();
			int userValue = MenuViewer.INPUT.nextInt();
			
			switch(userValue) {
			case 1:
				System.out.println("데이터 입력을 시작합니다..");
				manager.inputData();
				break;
			case 2:
				System.out.println("데이터 검색을 시작합니다..");
				manager.searchData();
				break;
			case 3:
				System.out.println("데이터 삭제를 시작합니다..");
				manager.deleteData();
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				MenuViewer.INPUT.close();
				break menu;
			}
		}
		
	}

}
