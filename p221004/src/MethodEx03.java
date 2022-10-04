
public class MethodEx03 {

	// [메서드 정의]
	// 메서드 정의 형태 : 매개변수 있고, 리턴 값 있음
	// 기능 : 정수를 2개 입력 받은 후, 덧셈한 결과를 리턴
	public static int add(int n1, int n2) { // 각각의 매개변수에 자료형 작성 -> 생략 불가능!
		int result = n1 + n2;
		return result; // return을 만나는 순간 메서드 종료
		// return 밑에는 코드 작성X
	}
	
	// main method
	public static void main(String[] args) {
		int addResult = add(5, 3);
		 System.out.println("add(5, 3) 실행 결과 >> " + addResult);
		 System.out.println("add(2, 4) 실행 결과 >> " + add(2,4));
	}

}
