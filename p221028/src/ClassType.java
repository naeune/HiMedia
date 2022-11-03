/*
 * 클래스는 자료형이다.
 * 
 */
public class ClassType {
	
	// 멤버 변수
	int num;
	
	// 생성자
	public ClassType(int num) {
		this.num = num;
	}

	// 멤버 메서드
	public void showNum() {
		System.out.println("멤버변수 num >> " + this.num);
	}
	
	public static void main(String[] args) {

		ClassType type = new ClassType(5);
		type.showNum();
	}

}
