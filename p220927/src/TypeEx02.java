
public class TypeEx02 {

	public static void main(String[] args) {
		
		// 논리 자료형
		boolean bool = true;	// true : 예약어, 1의 값을 가짐
		System.out.println(bool);
		
		/*
		 * 자동 형 변환(묵시적 형 변환)
		 * : 작 -> 큰, 정수 -> 실수
		 */
		
		int n1 = 10;
		int n2 = 3;
		double n3 = 3.0;
		System.out.println("n1 / n2 = " + (n1 / n2));
		System.out.println("n1 / n2 = " + (n1 / n2));
		System.out.println("n1 / n3 = " + (n1 / n3));
		
	}

}
