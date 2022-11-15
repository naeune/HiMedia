/*
 * [HashMap 이용]
 * - Key : name, Value : PhoneBookInfo 객체
 * 
 * - 이름이 같을 경우 "이미 저장된 이름입니다." 출력하고 저장하지 않음
 */
package phone;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class PhoneBookManager {
	
	// private HashMap<String, PhoneBookInfo> infoStorage = new HashMap<String, PhoneBookInfo>();  
	private Map<String, PhoneBookInfo> infoStorage = new HashMap<String, PhoneBookInfo>();
	
	// [입력]
	public void inputData() {
		System.out.println("\n데이터 입력을 시작합니다...");
		
		System.out.print("이름: ");
		String name = MenuViewer.INPUT.next();
		
		System.out.print("전화번호: ");
		String number = MenuViewer.INPUT.next();
		
		PhoneBookInfo newInfo = new PhoneBookInfo(name, number);
		
		if(infoStorage.containsKey(name)) { // 왼쪽 요소가 기준
			System.out.println("이미 저장된 이름입니다.");
			return;
		} else {
			infoStorage.put(name, newInfo);
			System.out.println("데이터 저장이 완료되었습니다.");
		}
	}
	
	// [검색]
	public void searchData() {
		System.out.println("\n데이터 검색을 시작합니다...");
		
		System.out.print("이름: ");
		String name = MenuViewer.INPUT.next();
		
		Boolean isName = search(name);
		
		if(isName) {
			infoStorage.get(name).showPhoneInfo();
			System.out.println("데이터 검색이 완료되었습니다.");
		} else
			System.out.println("해당 데이터가 존재하지 않습니다.");
	}
	
	// [삭제]
	public void deleteData() {
		System.out.println("\n데이터 삭제를 시작합니다.");
		
		System.out.print("이름 : ");
		String name = MenuViewer.INPUT.next();

		Boolean isName = search(name);
		
		if(isName) {
			infoStorage.remove(name);
			System.out.println("데이터 삭제가 완료되었습니다.");
		} else
			System.out.println("해당 데이터는 존재하지 않습니다.");
	}
	
	
	public void printData() {
		System.out.printf("\n<< 전체 데이터 개수 : %d >>\n", infoStorage.size());
		Iterator<Entry<String, PhoneBookInfo>> iter = infoStorage.entrySet().iterator();
		while(iter.hasNext()) {
			// iter.next : HashMap 객체 하나의 주소 리턴
			iter.next().getValue().showPhoneInfo();
			
		}
	}

	private Boolean search(String name) {
		
		return infoStorage.containsKey(name);
		/*
		Iterator<Entry<String, PhoneBookInfo>> iter = infoStorage.entrySet().iterator();
		while(iter.hasNext()) {
			Entry<String, PhoneBookInfo> target = iter.next();
			if(name.equals(target.getKey()))
				return target.getKey();
			}
			return null;
		*/
		
		}
		
		
			
	}
	