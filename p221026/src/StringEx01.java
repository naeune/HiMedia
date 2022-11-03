
public class StringEx01 {
	public static void main(String[] args) {

		// String 변수에는 문자열 상수의 주소값이 저장
		
		String s = "안녕"; // 문자열 상수
		String s2 = "안녕";
		String s3 = new String("안녕");
		String s4 = new String("안녕");
		
		if(s == s2)
			System.out.println("같다");
		else
			System.out.println("다르다");
		
		if(s == s3)
			System.out.println("같다");
		else
			System.out.println("다르다");
		
		if(s3.equals(s4))
			System.out.println("같다");
		else
			System.out.println("다르다");
		
		System.out.println("s3.equals(s4) >> " + s3.equals(s4));
	
		System.out.println(s.equals(s4));
	}

}
