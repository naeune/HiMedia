package item;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ItemBusinessRule {

	private static final Map<Long, Item> store = new HashMap<Long, Item>();
	private static Long sequence = 0L;
	
	// 1. 상품 저장
	public void save() {
		System.out.print("상품명, 가격, 수량을 순서대로 입력하세요...");
		
		String itemName = ItemView.INPUT.next();
		int price = ItemView.INPUT.nextInt();
		int quantity = ItemView.INPUT.nextInt();
		
		Item item = new Item(itemName, price, quantity);
		item.setId(++sequence);
		
		// 실제 DB에 저장된 데이터는 item에 있음!
		store.put(item.getId(), item);
		System.out.println("상품 정보가 저장되었습니다.");
	}
	
	// 아이디로 조회하는 메서드
	private Item findById(Long itemId) {
		// 값에 해당하는 객체의 주소 리턴
		return store.get(itemId);
	}
	
	// 2. 상품 조회 : 상품 아이디로 조회
	public void find() {
		System.out.print("조회를 원하는 상품의 아이디를 입력하세요... ");
		Long itemId = ItemView.INPUT.nextLong();
		
		Item findItem = findById(itemId);
		if(findItem == null) {
			System.out.println("아이디가 " + itemId + "인 상품이 없습니다.");
		} else {
			findItem.showInfo();
			System.out.println("상품 조회가 완료되었습니다.");
		}
	}
	
	// 3. 상품 수정
	public void update() {
		System.out.print("수정하기 원하는 상품의 아이디를 입력하세요... ");
		Long itemId = ItemView.INPUT.nextLong();
		
		Item findItem = findById(itemId);
		
		if(findItem == null) {
			System.out.println("아이디가 " + itemId + "인 상품이 없습니다.");
			return;
		}
		
		System.out.print("가격, 수량을 입력하세요... ");
		int price = ItemView.INPUT.nextInt();
		int quantity = ItemView.INPUT.nextInt();
		
		findItem.setPrice(price);
		findItem.setQuantity(quantity);
		System.out.println("상품 수정이 완료되었습니다.");
	}
	
	// 4. 상품 삭제
	public void delete() {
		System.out.println("삭제를 원하는 아이디를 입력하세요... ");
		Long ItemId = ItemView.INPUT.nextLong();
		
		Item findItem = findById(ItemId);
		
		if(findItem == null) {
			System.out.println("해당 상품이 없어서 삭제는 진행하지 않습니다.");
			return;
		}
		
		// remove(key, value) -> boolean 리턴(T/F)
		if(store.remove(ItemId, findItem)) {
			System.out.println("아이디가 " + ItemId + "인 상품이 삭제되었습니다.");
			System.out.println("상품 삭제가 완료되었습니다.");
		}
	}
	
	// 5. 상품 전제 조회
	public void findAll() {
		if(store.size() == 0) {
			System.out.println("저장된 상품 정보가 없습니다.");
			return;
		}
		ArrayList<Item> item = new ArrayList<Item>(store.values());
		Iterator<Item> iter = item.iterator();
		while(iter.hasNext())
			iter.next().showInfo();
	}
	
	// 6. 상품 전체 삭제
	public void clearStore() {
		store.clear();
		System.out.println("모든 상품의 정보가 삭제되었습니다.");
	}
}
