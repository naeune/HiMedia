class Fruit {
	/*
	 * [final 변수] --> 상수(constant)
	 * 	변수 상수화
	 * 	초기화한 값으로 고정
	 * 	변수의 값 변경이 금지
	 * 	final 변수는 이름이 모두 대문자
	 * 
	 * 	cf) 리터럴(literal)
	 *	상수, 값 그 자체, 이름이 없는 값
	 * 	int num = 5;
	 */
	
	// final 멤버변수
	final int COUNT;
	String sort;
	
	public Fruit(int count) {
		this.COUNT = count;
	}
	
	public int getCount() {
		return COUNT;
	}
	/*
	public void setCount(int count) {
		this.count = count;
	}
	*/
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public void showInfo() {
		System.out.println(this.sort + "는 현재 " + this.COUNT + "개 있습니다.");
	}
	
}
public class VariableFinalEx01 {

	public static void main(String[] args) {

		Fruit apple = new Fruit(5000);
		apple.setSort("사과");
		// apple.setCount(50);
		apple.showInfo();
		
		Fruit banana = new Fruit(10000);
		banana.setSort("바나나");
		banana.showInfo();
	}

}
