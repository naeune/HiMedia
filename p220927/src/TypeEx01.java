
public class TypeEx01 {

	public static void main(String[] args) {
		
		// 정수 자료형
		byte by = 5;
		System.out.println("by >> " + by);
		
		// by = 357; 1byte가 표현 할 수 있는 범위 (-128 ~ 127) -> 오류 발생
		
		by = 7;
		System.out.println("by >> " + by);
		
		char ch = 65;
		System.out.println("ch >> " + ch);
		
		short sh = 97;
		System.out.println("sh >> " + sh);
		
		long lo = 1000000000;	// 0이 9개
		System.out.println("lo >> " + lo);
		
		long lo2 = 10000000000L;
		// long lo_two = (long)10000000000; -> Error!
		System.out.println("lo2 >> " + lo2);
		
		// 실수형
		float fo = 2.34F;
		// float fo_two = (float)2.34; -> 상수에 강제 형 변환 사용X
		System.out.println("fo >> " + fo);
		
		double db = 2.34;
		System.out.println("db >> " + db);
	}

}
