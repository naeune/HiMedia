package phone;

import java.util.HashSet;
import java.util.Iterator;

public class PhoneBookManager {
	
	// HashSet을 이용하여 PhoneBookInfo 객체 관리
	// 이름과 연락처가 중복 저장되지 않도록 하시오.
	// 저장할 때, 중복된 이름이 있다면 "이미 저장되어 있습니다." 문구 출력
	
	private HashSet<PhoneBookInfo> infoStorage = new HashSet<PhoneBookInfo>();
	
	
	// [입력]
	public void inputData() {
		System.out.println("\n데이터 입력을 시작합니다...");
		
		System.out.print("이름: ");
		String name = MenuViewer.INPUT.next();
		
		System.out.print("전화번호: ");
		String number = MenuViewer.INPUT.next();
		
		// add() 내에 저장 여부 확인 가능(true/false)
		PhoneBookInfo newInfo = new PhoneBookInfo(name, number);
		if(infoStorage.add(newInfo))
			System.out.println("데이터 저장이 완료되었습니다.");
		else
			System.out.println("데이터가 저장되지 않았습니다.");
		
	}	
	// [검색]
	public void searchData() {
		System.out.println("\n데이터 검색을 시작합니다...");
		
		System.out.print("이름: ");
		String name = MenuViewer.INPUT.next();
		
		PhoneBookInfo searchName = search(name);
		
		if(searchName == null)
			System.out.println("해당 데이터가 존재하지 않습니다.");
		else {
			searchName.showPhoneInfo();
			System.out.println("데이터 검색이 완료되었습니다.");
		}
	}
	
	// [삭제]

	public void deleteData() {
		System.out.println("\n데이터 삭제를 시작합니다.");
		
		System.out.print("이름 : ");
		String name = MenuViewer.INPUT.next();
		
		PhoneBookInfo searchName = search(name);
		
		if(searchName == null)
			System.out.println("해당 데이터는 존재하지 않습니다.");
		else {
			infoStorage.remove(searchName);
			System.out.println("데이터 삭제가 완료되었습니다.");
		}
	}
	
	
	public void printData() {
		System.out.printf("\n<< 전체 데이터 개수 : %d >>\n", infoStorage.size());
		
		Iterator<PhoneBookInfo> iter = infoStorage.iterator();
		while(iter.hasNext())
			iter.next().showPhoneInfo();
	}

	
	
	private PhoneBookInfo search(String name) {
		Iterator<PhoneBookInfo> iter = infoStorage.iterator();
		while(iter.hasNext()) {
			PhoneBookInfo target = iter.next();
			if(name.equals(target.getName()))
				return target;
			}
			return null;
		}
			
	}
	