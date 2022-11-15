package method.reference.expression;

import java.util.function.Consumer;

public class Ex02 {

	public static void main(String[] args) {

		// System.out.println();
		// 출력 메서드 println() : 인수 String 1개, 리턴형 void
		// Consumer에 참조 가능
		
		// Consumer<String> consumer = 참조변수::메서드명;
		Consumer<String> consumer = System.out::println;
		consumer.accept("오늘도 JAVA와 즐거운 하루");
	}

}
