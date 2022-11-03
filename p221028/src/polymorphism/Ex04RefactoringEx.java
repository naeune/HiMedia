package polymorphism;

class Product {
	int price;
	int bonusPoint;
	
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price / 10.0);
		
	}
}
// 클래스의 재사용
class Tv extends Product {
	Tv() {
		super(100);
	}
	
	@Override
	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}
	
	@Override
	public String toString() {
		return "Computer";
	}
	
}

class Buyer {
	// 멤버 변수
	private int money = 1000;
	int bonusPoint = 0;
	private int index = 0;
	private Product[] item = new Product[10];
	
	// 다형성 구현
	public void buy(Product p) {
		if(this.money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		this.money -= p.price;
		this.bonusPoint += p.bonusPoint;
		this.item[index++] = p;
		System.out.println(p + "을/를 구입하셨습니다.");
		
		}
		
	 public void Summary() {
		int total = 0;
		String itemList = "";	// 빈 문자열
		
		// [일반 for문]
		/*
		for(int i = 0; i < item.length; i++) {
			if(item[i] == null)
				break;
			itemList += item[i] + ", ";
			total += item[i].price;
		}
		*/
		
		// [향상된 for문]
		for(Product p: item) {
			if(p == null)
				break;
			// itemList += p + ", ";
			itemList = itemList.concat(p.toString() + ", ");
			total += p.price;
		}
		
		System.out.println("구매하신 제품은 " + itemList + "입니다.");
		System.out.println("구매하신 물품의 총 금액은 " + total + "만원입니다.");
	 }
}

public class Ex04RefactoringEx {
	public static void main(String[] args) {

		Buyer b = new Buyer();
		
		// 일회용 객체 -> 주소 저장이 안되어있음!
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Tv());
		b.Summary();
		
		
	}
}
