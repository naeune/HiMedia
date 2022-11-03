package exception;

public class Ex04 {

	// main method를 호출한 JVM(자바 가상 머신)이 예외 처리
	public static void main(String[] args) throws InterruptedException {

		for (int i = 1; i < 11; i++) {
			System.out.println(i);

			// sleep 메서드 자체가 예외 전가(예외 발생) -> 직접 처리 or 전가
			Thread.sleep(1000);

		}
	}

}
