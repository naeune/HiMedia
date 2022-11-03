class Cars {
	// 멤버 변수 : instance(object) 변수(field), static(class) 변수
	// instance 변수
	int door;
	String color;
	
	// 생성자
	public Cars() {
		this(4, "black");
		// this.door = 4;
		// this.color = "black";
	}
	
	public Cars(int door) {
		this(door, "black");
		// this.door = door;
		// this.color = "black";
	}
	
	public Cars(String color) {
		this(4, color);
		// this.door = 4;
		// this.color = color;
	}
	
	public Cars(int door, String color) {
		this.door = door;
		this.color = color;
	}
	
	// 멤버 메서드 : instance(객체) method, static(class) method
	// instance(객체) method
	public void carInfo() {
		System.out.println("문 개수 : " + this.door);
		System.out.println("색 : " + this.color + "\n");
	}
}
public class ConstructorQuizEx {
	public static void main(String[] args) {

		Cars c1 = new Cars();
		c1.carInfo();
		
		Cars c2 = new Cars(2);
		c2.carInfo();
		
		Cars c3 = new Cars("white");
		c3.carInfo();
		
		Cars c4 = new Cars(6, "grey");
		c4.carInfo();

	}

}