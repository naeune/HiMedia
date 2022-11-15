package phone;

public class PhoneBookManager {
	
	private final int MAX_CNT = 100;
	private PhoneBookInfo[] infoStorage = new PhoneBookInfo[MAX_CNT];
	private int index = 0;
	
	private int search(String name) {
		int count = 0;
		for(;count < infoStorage.length; count++) {
			if(infoStorage[count].name.equals(name))
				break;
		}
		return count;
	}
		
	
	public void inputData() {
		System.out.print("이름: ");
		String name = MenuViewer.INPUT.next();
		System.out.print("전화번호: ");
		String phoneNumber = MenuViewer.INPUT.next();
		infoStorage[index++] = new PhoneBookInfo(name, phoneNumber);
		System.out.println("데이터 입력이 완료되었습니다.\n");
	}
	
	public void searchData() {
		System.out.print("이름: ");
		String name = MenuViewer.INPUT.next();
		try {
		search(name);
		} catch(NullPointerException e) {
			System.out.println("해당하는 데이터가 존재하지 않습니다.\n");
			return;
		}
		infoStorage[search(name)].showPhoneInfo();
	}
	
	public void deleteData() {
		System.out.print("이름: ");
		String name = MenuViewer.INPUT.next();
		search(name);
		infoStorage[search(name)] = null;
		System.out.println("데이터 삭제가 완료되었습니다.\n");
	}

	

}
