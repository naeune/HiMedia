package polymorphism;

public class StringEx03 {
	static String con;
	
	public static void main(String[] args) {

		String[] str = {"one", "two", "three", "four"};
		// String con;	// 빈 문자열
		
		// 지역 변수 초기화 X -> 쓰레기값
		// System.out.println(con + str[0]);
		
		System.out.println(con + str[0]);
	
		
		
	}

}
