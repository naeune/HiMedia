package polymorphism;

public class StringEx01 {
	public static void main(String[] args) {

		String[] str = {"one", "two", "three", "four"};
		String concat = "";	// 빈 문자열
		
		// [일반 for문]
		/*
		for(int i = 0; i < str.length; i++) {
			concat += str[i] + ", ";
			// System.out.println(str[i] + ", ");
		}
		*/
		
		// [향상된 for문]
		for(String s: str) {
			concat += s + ", ";
		}
		
		System.out.println("concat >> " + concat);
	}

}
