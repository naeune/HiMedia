package exception;

public class Ex03 {

	public static void main(String[] args) {

		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
			
			try {
				// sleep 메서드 자체가 예외 전가(예외 발생) -> 직접 처리 or 전가
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
			
		}
	}

}
