package polymorphism;

public class StringEx02 {

	public static void main(String[] args) {

		String[] str = {"one", "two", "three", "four"};
		String con = "";	// 빈 문자열
		
		System.out.println(str[0] + str[1] + str[2] + str[3]);
		
		// 문자열 함수
		// [문법] 문자열.concat(문자열)
		System.out.println(str[0].concat(str[1]));
		
		// [향상된 for문]
		for(String s: str) {
			con = con.concat(s).concat(", ");
			// con = con.concat(s + ", ");
		}
		
		// 출력
		System.out.println("con >> " + con);
	}

}
