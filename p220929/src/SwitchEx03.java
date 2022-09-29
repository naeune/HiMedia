
public class SwitchEx03 {
	public static void main(String[] args) {
		
		// switch문 문자열 변수 출력 
		// 과일의 위치에 따라 창고 위치 출력
		String fruit = "사과"; // -> 문자열 상수(String 타입)
		// 클래스 다음에 오는 변수(fruit)에 문자열 상수의 주소(int타입)가 저장됨
		
		switch (fruit) { // fruit = 주소(int형)라서 오류가 발생하지 않음
		case "사과": // "사과"도 주소
			System.out.println("사과는 오른쪽 창고에 있습니다.");
			break;
		case "배": // "배"도 주소
			System.out.println("배는 왼쪽 창고에 있습니다.");
			break;
		default:
			System.out.println("나머지 과일은 위쪽 창고에 있습니다.");
		}
		
	}

}
