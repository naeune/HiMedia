package polymorphism;

public class StringEx04 {
	public static void main(String[] args) {

		String one = "";		// 빈 문자열 --> 길이가 0인 문자열
		String two = null;		// 문자열 없음
		
		System.out.println(one);
		System.out.println(two);
		
		// [빈 문자열 확인 1] length() method : 문자열의 길이 0
		System.out.println("one : 빈 문자열 길이 >> " + one.length());
		System.out.println("cf) Hello 문자열 길이 >> " + "Hello".length());
		// System.out.println("two : 문자열 길이 없음 >> " + two.length());		// Error! NullPointerException
		
		// [빈 문자열 확인 2] isEmpty() method
		// : JAVA 6 이후 추가 - 문자열의 길이가 0인 경우 true 리턴
		System.out.println("one.isEmpty() >> " + one.isEmpty());
		System.out.println("공백.isEmpty() >> " + " ".isEmpty());
		System.out.println("Hello.isEmpty() >> " + "Hello".isEmpty());
		
		// [cf] isBlank()
		// : JAVA 11 이후 추가 - 빈 문자열이나 공백만으로 이루어진 경우 true 리턴
		// : white space를 어떻게 처리할까?
		System.out.println("one.isBlank() >> " + one.isBlank());
		System.out.println("공백.isBlank() >> " + " ".isBlank());
		System.out.println("공백.isBlank() >> " + "      ".isBlank());
		
		// [빈 문자열 확인 3] equals() method
		System.out.println("one.equals() >> " + one.equals(""));
		// System.out.println("two.equals() >> " + two.equals(""));			// Error! NullPointerException
		// System.out.println("two.isEmpty() >> " + two.isEmpty());			// Error! NullPointerException
	}

}
