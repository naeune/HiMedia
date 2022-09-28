
public class IfEx03 {

	public static void main(String[] args) {

		int num = 200;
		
		if (num < 0) 
			System.out.println("0 미만");
		else if (num < 100)  // 중첩 if문 -> else if
			System.out.println("0 이상 100 미만");
		// else if (조건식) -> 필요한 만큼 추가
		//	명령어;
		else  // 조건 : 100 이상
			System.out.println("100 이상");
		
		System.out.println("<<실행 완료>>");
	}

}
