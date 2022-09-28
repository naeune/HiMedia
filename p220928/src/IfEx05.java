
public class IfEx05 {

	public static void main(String[] args) {

		// 랜덤 값 생성
		int randomValue = (int)(Math.random() * 5) + 1;
		// n을 곱했을 때 나오는 값의 정수 부분은 n-1까지
		// 1~45 출력 -> * 45 + 1
		System.out.println("랜덤 값 >> " + randomValue);
		
		// 강제 형 변환
		// (자료형) 변수
		
		/*
		if (randomValue == 1)
			System.out.println("1번이 나왔습니다.");
		else if (randomValue == 2)
			System.out.println("2번이 나왔습니다.");
		else if (randomValue == 3)
			System.out.println("3번이 나왔습니다.");
		else if (randomValue == 4)
			System.out.println("4번이 나왔습니다.");
		else
			System.out.println("5번이 나왔습니다.");
		*/
		
		System.out.println(randomValue + "번이 나왔습니다.");
	}

}
