package functionalinterface;

import java.util.function.Supplier;

public class SupplierEx {

	public static void main(String[] args) {
		
		// get() : 매개변수 없고, 리턴값 있음
		// lambda : () -> T
		Supplier<String> supplier = () -> "신기한 함수형 인터페이스";
		System.out.println(supplier.get());
	}

}
