package item;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class ItemBusinessRule {
	private static final Map<Long, Item> store = new HashMap<Long, Item>();
	private static Long sequence = 1L;
	
	public void save() {
		System.out.print("상품명, 가격, 수량을 순서대로 입력하세요...");
		String itemName = ItemView.INPUT.next();
		Integer price = ItemView.INPUT.nextInt();
		int quantity = ItemView.INPUT.nextInt();
		Item item = new Item(itemName, price, quantity);
		item.setId(sequence);
		store.put(sequence++, item);
		System.out.println("상품 정보가 저장되었습니다.");
	}
	
	
	private Item findById(Long itemId) {
		if(store.containsKey(itemId)) {
			return store.get(itemId);
		} else {
			return null;
		}
	}
	
	public void find() {
		System.out.print("조회를 원하는 아이디를 입력하세요...");
		Long user = ItemView.INPUT.nextLong();
		Item find = findById(user);
		if(find == null) {
			System.out.printf("아이디가 %d인 상품이 없습니다.", user);
			System.out.println();
		} else {
			store.get(user).showInfo();
			System.out.println("상품 조회가 완료되었습니다.");
		}
	}
	
	public void update() {
		System.out.print("수정하기 원하는 아이디 입력하세요...");
		Long user = ItemView.INPUT.nextLong();
		Item find = findById(user);
		if(find == null) {
			System.out.printf("아이디가 %d인 상품이 없습니다.", user);
			System.out.println();
		} else {
			System.out.print("가격, 수량을 입력하세요...");
			Integer newPrice = ItemView.INPUT.nextInt();
			int newQuantity = ItemView.INPUT.nextInt();
			Item newItem = new Item(store.get(user).getItemName(), newPrice, newQuantity);
			newItem.setId(user);
			store.put(user, newItem);
			System.out.println("상품 수정이 완료되었습니다.");
		}
		
	}
	
	public void delete() {
		System.out.print("삭제를 원하는 아이디 입력하세요...");
		Long user = ItemView.INPUT.nextLong();
		Item find = findById(user);
		if(find == null) {
			System.out.println("해당 상품이 없어서 삭제는 진행하지 않습니다.");
		} else {
			store.remove(user);
			System.out.println(user + "번 상품이 삭제되었습니다.");
			System.out.println("상품 삭제가 완료되었습니다.");
		}
	}
	
	public void findAll() {
		Iterator<Entry<Long, Item>> iter = store.entrySet().iterator();
		while(iter.hasNext()) {
			iter.next().getValue().showInfo();
		}
		if(store.isEmpty())
			System.out.println("저장된 상품 정보가 없습니다.");
	}
	
	public void clearStore() {
		for(long i = 1; i < sequence; i++) {
			store.remove(i);
		}
		System.out.println("상품의 모든 정보가 삭제되었습니다.");
	}
}
