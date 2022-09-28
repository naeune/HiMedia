
public class OperatorEx03 {

	public static void main(String[] args) {

		// [1증가, 1감소 연산자]
		int num = 5;
		
		// num = num + 1;		// 1증가 식
		// num += 1;			// 복합 대입 연산자
		// ++num;				// 1증가 연산자
		// int result = ++num;	// 선증가 연산자
		int result = num++;		// 후증가 연산
		
		// int result = num;
		// num = num + 1;
		System.out.println("num >> " + num);
		System.out.println("result >> " + result);
		
		
		
	}

}
