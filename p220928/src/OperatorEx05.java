
public class OperatorEx05 {
	public static void main(String[] args) {

		// [삼항 연산자] 조건 연산자
		int num = 5;
		
		// [유형 1]
		String result = (num > 4) ? "크다" : "작거나 같다";
		System.out.println("result >> " + result);
		
		// [유형 2] <- Error! 변수가 존재하지 않음
		// (num > 4) ? System.out.println("크다") : System.out.println("작거나 같다");
		
	}

}
