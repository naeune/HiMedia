import java.util.Scanner;	// 클래스 경로
public class ScannerEx01 {

	public static void main(String[] args) {

		// 사용자로부터 값 입력 받기
		
		// 1. 객체 생성 : Scanner 객체 생성
		Scanner input = new Scanner(System.in);
		
		// 2. 정수 1개 입력 받기
		System.out.print("정수 1개 입력하세요 : ");
		int num = input.nextInt();
		System.out.println("입력값 >> " + num);
		
		// 2-1. 정수 2개 입력 받기
		System.out.print("정수 2개 입력하세요 : ");
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		System.out.println("입력된 정수 >> " + num2 + "," + num3);
		
		input.close();
	}

}
