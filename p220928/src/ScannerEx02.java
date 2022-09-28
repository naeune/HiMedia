import java.util.Scanner;
public class ScannerEx02 {

	public static void main(String[] args) {
		
		// 1. Scanner 객체 생성
		Scanner input = new Scanner(System.in);
		
		// 키보드로 쳤던 문자열이 RAM 임시저장공간(버퍼)에 임시 저장됨
		// (엔터 기호(\r + \n)까지 포함해서 저장) -> 엔터는 문자열의 끝 의미
		// next()에서 안녕까지만 가져다 씀 -> 안녕은 버퍼에서 삭제
		// 남은 '_좋은_아침'을 nextLine()이 다 가져다 씀 -> 버퍼에서 삭제
		
		// 2-1. 문자열 입력 next()메서드 : 첫 번째 공백 전까지
		System.out.print("문자열 1개 입력 : ");
		String s1 = input.next();
		System.out.println("입력된 문자열 >> " + s1);

		// buffer를 비워줌
		// 남은 '_좋은_아침'을 가져감
		input.nextLine();
		
		// 2-2. 문자열 입력 nextLine()메서드 : 엔터 전 까지
		System.out.print("문자열 1개 입력 : ");
		String s2 = input.nextLine();
		System.out.println("입력된 문자열 >> " + s2);
		
		input.close();
		
	}

}
