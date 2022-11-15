package phone;

public class PhoneBookManager {
	private final int MAX_CNT = 100;
	private PhoneBookInfo[] infoStorage = new PhoneBookInfo[MAX_CNT];
	private int index = 0;
	
	// [입력]
	public void inputData() {
		System.out.println("\n데이터 입력을 시작합니다...");
		
		System.out.print("이름: ");
		String name = MenuViewer.INPUT.next();
		
		System.out.print("전화번호: ");
		String phoneNumber = MenuViewer.INPUT.next();
		
		infoStorage[index++] = new PhoneBookInfo(name, phoneNumber);
		
		System.out.println(index);
		System.out.println("데이터 입력이 완료되었습니다.\n");
	}
	
	// [검색]
	public void searchData() {
		System.out.println("\n데이터 검색을 시작합니다...");
		
		System.out.print("이름: ");
		String name = MenuViewer.INPUT.next();
		
		int idx = search(name);
		// System.out.println(index);
		
		if(idx == -1) {
			System.out.println("해당 데이터가 존재하지 않습니다.\n");
		} else {
			infoStorage[idx].showPhoneInfo();
			System.out.println("데이터 검색이 완료되었습니다.\n");
		}
	}
	
	// [삭제]
	public void deleteData() {
		System.out.println("\n데이터 삭제를 시작합니다.");
		
		System.out.print("이름 : ");
		String name = MenuViewer.INPUT.next();
		
		int idx = search(name);
		System.out.println(index);
		System.out.println(idx);
		System.out.println(infoStorage);
		if(idx == -1) {
			System.out.println("해당 데이터는 존재하지 않습니다.\n");
		} else {
			
			for(int i = idx; i < index; i++) {
				infoStorage[i] = infoStorage[i+1];
			}
			index--;
			// infoStorage[index] = null;
			
			
			
		}
		System.out.println("데이터 삭제가 완료되었습니다.");
	}
	
	public void printData() {
		System.out.printf("\n<< 전체 데이터 개수 : %d >>\n", this.index);
		
		for(int idx = 0; idx < index; idx++) {
			infoStorage[idx].showPhoneInfo();
		}
	}
	
	private int search(String name) {
		for(int idx = 0; idx < index; idx++) {
			PhoneBookInfo info = infoStorage[idx];
			if(info == null)
				break;
			else if(name.equals(info.name))
				return idx;
		}
		// 리턴할 값이 없을 때, 0 또는 -1 작성
		return -1;
	}

}