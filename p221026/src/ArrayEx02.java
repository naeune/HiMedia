
public class ArrayEx02 {

	public static void main(String[] args) {

		// int[] arr = new int[3];
		// int[] arr = new int[] {2, 4, 6};
		// int[] arr = {2, 4, 6}
		
		// 객체 배열에 저장 되는 값 = 객체 주소
		// 실제 배열 형태는 참조변수
		// 2차원 배열 형태와 비슷
		
		// 객체 배열 생성
		// [첫번째]
		// String[] strArr = new String[3];
		
		// 문자열 객체 생성
		// strArr[0] = new String("Java");
		// strArr[1] = new String("HTML");
		// strArr[2] = new String("CSS");

		// [두번째]
		// String[] strArr = new String[] {new String("Java"), new String("HTML"), new String("CSS")};
	
		// [세번째]
		// String[] strArr = {new String("Java"), new String("HTML"), new String("CSS")};
		
		// [네번째]
		// String은 기본자료형으로 사용 가능, String만 가능한 방법
		String[] strArr = {"Java", "HTML", "CSS"};
		
		// 일반 for문
		// for(int i=0; i<strArr.length; i++)
		// System.out.println(strArr[i]);
		
		// 향상된 for문
		for(String str : strArr)
			System.out.println(str);
		
	}

}
