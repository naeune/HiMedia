//package polymorphism;
//
//class Product {
//	int price;
//	int bonusPoint;
//	
//	Product(int price){
//		this.price = price;
//		bonusPoint = (int)(price / 10.0);
//		
//	}
//}
//// 클래스의 재사용
//class Tv extends Product {
//	Tv() {
//		super(100);
//	}
//	
//	@Override
//	public String toString() {
//		return "Tv";
//	}
//}
//
//class Computer extends Product {
//	Computer() {
//		super(200);
//	}
//	
//	@Override
//	public String toString() {
//		return "Computer";
//	}
//	
//}
//
//class Buyer {
//	int money = 1000;
//	int bonusPoint = 0;
//	int count = 0;
//	int totalPrice = 0;
//	Product[] electronic = new Product[10];
//	
//	// 다형성 구현
//	void buy(Product p) {
//		if(money < p.price) {
//			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
//			return;
//		}
//		
//		money -= p.price;
//		bonusPoint += p.bonusPoint;
//		System.out.println(p + "을/를 구입하셨습니다.");
//		
//		for(int i = count; i <= count; i++) {
//			electronic[i] = p;
//			totalPrice += p.price;
//		}
//		
//						
//		count++;
//	}
//	
//	 public void Summary() {
//		System.out.println("구입하신 물품의 총금액은 " + totalPrice + "만원입니다.");
//		System.out.print("구입하신 제품은 ");
//		for(Product e: electronic) {
//			if(e != null) {
//				System.out.print(e + ", ");
//			}
//	}
//		System.out.println("입니다.");
//}
//}
//
//public class Ex04Refactoring {
//	public static void main(String[] args) {
//
//		Buyer b = new Buyer();
//		
//		// 일회용 객체 -> 주소 저장이 안되어있음!
//		b.buy(new Tv());
//		b.buy(new Computer());
//		b.buy(new Computer());
//		b.buy(new Computer());
//		b.buy(new Computer());
//		b.buy(new Tv());
//		b.Summary();
//		
//		
//	}
//}
