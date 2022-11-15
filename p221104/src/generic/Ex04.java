package generic;

class Thing {
	String id;
	String name;
	
	public Thing() {}
	
	public Thing(String id, String name) {
		this.id = id;
		this.name = name;
	}
}

class Tv extends Thing {
	@Override
	public String toString() {
		return "나는 새로운 TV이다!.";
	}
}

class Pen extends Thing {
	@Override
	public String toString() {
		return "나는 평생 사용 가능한 Pen이다!";
	}
}

class Box<T> {
	T item;
	
	public void store(T item) {
		this.item = item;
	}
	
	public T out() {
		return item;
	}
}


public class Ex04 {
	// 제네릭 메서드
	// 와일드카드 ? : 모든 것 의미
	public static void openBox(Box<? extends Thing> box) {
		// 다형성
		Thing thing = box.out();
		System.out.println(thing.toString());
	}
	
	public static void main(String[] args) {
		Box<Tv> one = new Box<Tv>();
		one.store(new Tv());
		openBox(one);
		
		Box<Pen> two = new Box<Pen>();
		two.store(new Pen());
		openBox(two);
		
	}

}
