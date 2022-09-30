import java.util.Scanner;
public class WhileQuizEx04 {
	public static void main(String[] args) {

		// 1. 정수 입력 받기
		Scanner input = new Scanner(System.in);
		System.out.print("1~10 사이의 정수 1개 입력 : ");
		int userValue = input.nextInt();
		int random = 0;
		int count = 0;
		
		// 2. 반복문 내에서 랜덤 값 생성 및 비교
		while (true) {
			count++;	// 카운트 목적으로 사용하는 코드는 주로 반복문 제일 처음에 작성
			
			random = (int)(Math.random() * 10) + 1;
			
			System.out.print(random + " ");
			
			if (userValue == random) {
				break;
			}
			
		}
		
		// 3. 출력
		System.out.println("\n" + count + "회 실행해서 찾았다!"); // \n(줄바꿈) 먼저 실행 -> println 실행
		// \n 은 문자열로 인식하기 때문에 작은따옴표 사용 가능 -> but, 뒤에 정수가 나오면 형 변환이 일어나서 인식 안됨  
		input.close(); // 자원 반납(해제)
		
	}

}
