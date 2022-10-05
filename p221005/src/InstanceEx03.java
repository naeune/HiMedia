// Robot 클래스 정의
class Robot {
	// 멤버 변수
	int productYear;
	String productName;
	
	// 멤버 메서드
	public int getProductYear() {
		return productYear;
	}
	public void setProductYear(int productYear) {
		this.productYear = productYear;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
}

public class InstanceEx03 {
	public static void main(String[] args) {
		
		Robot r1 = new Robot();
		// 힙 영역에는 이름을 붙일 수 없어서 임의로 r1객체라고 부름
		r1.setProductYear(2017);
		r1.setProductName("Emmet");
		
		System.out.println("r1의 생산년도 >> " + r1.getProductYear());
		System.out.println("r1의 제품명 >> " + r1.getProductName());
		
		Robot r2 = new Robot();
		r2.setProductYear(2022);
		r2.setProductName("HTML");
		
		System.out.println("r1의 생산년도 >> " + r2.getProductYear());
		System.out.println("r1의 제품명 >> " + r2.getProductName());
		
		// new Robot().setProductYear(2018)
		// 참조변수가 없는 객체 -> 객체의 주소값을 받아줄 변수가 없음!
		// 사용 가능한 코드 -> 값은 설정하지만 다시 쓸 수는 없는 일회용
		// 더 이상 사용할 수 없는 객체 -> 가비지컬렉터가 지워버림(메모리 해제)
		
		// Robot r3 = r2;
		// 주소복사
		// r2의 주소값을 r3에 대입 -> r3도 r2객체를 찾아감
		
	}

}
