
public class SwitchEx01 {
	public static void main(String[] args) {

		int n = 1; // 정수 형태의 값
		
		switch (n) {
		case 1: // 상수 값만 가능
			System.out.println("JAVA");
			break;
		case 2:
			System.out.println("HTML");
			break;
		case 3:
			System.out.println("CSS");
			break;
		default:
			System.out.println("공부는 즐겁다~!!");
		}
	}

}
