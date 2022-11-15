import item.ItemBusinessRule;
import item.ItemView;

public class Main {
	public static void main(String[] args) {
		int choice;
		ItemBusinessRule service = new ItemBusinessRule();
		
		menu:
		while(true) {
		ItemView.showMenu();
		choice = ItemView.INPUT.nextInt();
		ItemView.INPUT.nextLine();
		
		switch(choice) {
		case 1:
			service.save();
			break;
		case 2:
			service.find();
			break;
		case 3:
			service.update();
			break;
		case 4:
			service.delete();
			break;
		case 5:
			service.findAll();
			break;
		case 6:
			service.clearStore();
			break;
		case 7:
			System.out.println("프로그램을 종료합니다.");
			ItemView.INPUT.close();
			break menu;
		}
			
		}
			
	}

}
