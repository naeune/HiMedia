package lambda;

@FunctionalInterface
interface MaxReturn {
	// abstract method
	int max(int n1, int n2);
	
	// instance method
	default void method(int n1, int n2) {
		System.out.printf("매개변수 값 n1 : %d, n2 : %d\n", n1, n2);
	}
}

class SubMaxReturn implements MaxReturn {
	@Override
	public int max(int n1, int n2) {
		return (n1 > n2) ? n1 : n2;
	}
}

public class Ex04 {
	public static void main(String[] args) {

		// 1. 객체 생성
		MaxReturn maxReturn = new SubMaxReturn();	// 다형성
		int max = maxReturn.max(5, 2);
		System.out.println("큰 값 >> " + max);
		
		// [문제] 익명 클래스 : 참조 변수에 저장
		MaxReturn maxAnonymous = new MaxReturn() {
			
			@Override
			public int max(int n1, int n2) {
				return (n1 > n2) ? n1 : n2;
			}
		};
		System.out.println("[익명 클래스 1] 큰 값 >> " + maxAnonymous.max(8, 6));
		
		// [문제] 익명 클래스 : 바로 출력
		System.out.println("[익명 클래스 2] 큰 값 >> " + new MaxReturn() {
			
			@Override
			public int max(int n1, int n2) {
				return (n1 > n2) ? n1 : n2;
			}
		}
		.max(12, 5)
		);
		
		// [문제] 람다식 : 참조 변수에 저장
		MaxReturn maxLambda = (n1, n2) -> (n1 > n2) ? n1 : n2;
		System.out.println("[람다식] 큰 값 >> " + maxLambda.max(2, 9));
		
		
		
	}

}
