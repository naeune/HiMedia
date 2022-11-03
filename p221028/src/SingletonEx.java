/*
 * [싱글톤]
 *	클래스에 생성되는 객체가 오로지 하나
 *	- private constructor
 *  - 클래스 내에서 객체 생성 : 멤버 객체
 *  - 멤버 메서드를 통해 생성된 객체의 주소 리턴
 */

class Pattern {
	// 객체는 무조건 heap 영역에 생성
	// member 변수는 static 영역에 생성
	// 유일한 객체(인스턴스)를 공유하기 위해 static 사용
	// 2. 멤버 변수를 통해 객체 생성
	private static Pattern member = new Pattern();
	
	// 4. 멤버 변수 추가
	private int count;
	
	// 1. 생성자 -> 객체 생성 불가
	private Pattern() {
	}
	
	// 3. 멤버 메소드
	// 3-1. static(class, 정적) 메서드
	public static Pattern getPattern() {
		System.out.println("member >> " + member);
		return member;
	}
		
	// 4. 멤버 메서드 추가
	// 4-1. 멤버 변수 count 값 설정
	public void setCount(int count) {
		this.count = count;
	}
	// 4-2. 멤버 변수 값 리턴
	public int getCount() {
		return this.count;
	}
}
public class SingletonEx {

	public static void main(String[] args) {
		
		// 1-1. Error! -> 객체 생성 불가
		// Pattern p = new Parent();
		
		Pattern p = Pattern.getPattern();
		System.out.println(p);
		
		p.setCount(100);
		System.out.println("참조변수p1 : 멤버 변수 count >> " + p.getCount());
		
		Pattern p2 = Pattern.getPattern();
		System.out.println("참조변수p2 : 멤버 변수 count >> " + p.getCount());
		
		System.out.println(p == p2);
	}

}
