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
//	}
//}
//
//public class Ex04 {
//	public static void main(String[] args) {
//
//		Buyer b = new Buyer();
//		
//		// 일회용 객체 -> 주소 저장이 안되어있음!
//		b.buy(new Tv());
//		b.buy(new Computer());
//		
//		System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
//		System.out.println("현재 보너스점수는 " + b.bonusPoint + "점입니다.");
//	}
//
//}
