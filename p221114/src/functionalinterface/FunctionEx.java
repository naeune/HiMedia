package functionalinterface;

import java.util.function.Function;

public class FunctionEx {
	public static void main(String[] args) {

		// Function<T,R> ==============================
		// apply(T t) : 매개변수(T) 1개, 리턴값(R) 있음
		// lambda : (parameter) -> expression
		// ============================================		

		// [람다식 1] 정수 1개를 받아서, 문자열 리턴
		Function<Integer, String> one = (num) -> "매개변수 값은 " + num + "입니다.";
		String value = one.apply(6);
		System.out.println("문자열 >> " + value);
		
		// [람다식 2] 정수 1개를 받아서, 정수 리턴
		Function<Integer, Integer> power = num -> num * num;
		System.out.println("apply method : 제곱 >> " + power.apply(6));
		
		Function<Integer, Integer> increment = num -> num + 1;
		System.out.println("apply method : 1 증가 >> " + increment.apply(6));
		
		// andThen() =============================================
		// 이어서 처리하겠다~
		// System.out.println(power.andThen(참조변수.apply(값)));
		// .apply(값) 먼저 처리 후 andThen(참조변수) 실행
		
		// 7을 제곱 후 1 증가
		System.out.println(power.andThen(increment).apply(7));
		// power.apply(7) -> 7*7 처리 후, increment.apply(7) -> 49+1 실행
		
		// 7을 1증가 후 제곱
		System.out.println(increment.andThen(power).apply(7));
		
		// compose() =============================================
		// 먼저 처리하겠다~
		// 매개변수로 넣어준 값을 먼저 처리 -> 연쇄적으로 compose 먼저 처리
		
		// 7을 1증가 후 제곱 : 7을 제곱하기 전에 1 증가
		System.out.println(power.compose(increment).apply(7));
		
		// 7을 제곱 후 1 증가 : 7을 1증가 하기 전에 제곱 
		System.out.println(increment.compose(power).apply(7));
		
		// identity() =============================================
		Function<Integer, Integer> identityOne = Function.identity();	// static
		Function<Integer, Integer> identityTwo = Function.identity();	
		Function<Integer, Integer> identityThree = Function.identity();	
		System.out.println(identityOne);
		System.out.println(identityTwo);
		System.out.println(identityThree);
		
		// 람다는 객체로 관리되기 때문에 새로운 객체 주소 생성
		Function<Integer, Integer> lambdaOne = t -> t;
		Function<Integer, Integer> lambdaTwo = t -> t;
		Function<Integer, Integer> lambdaThree = t -> t;
		System.out.println(lambdaOne);
		System.out.println(lambdaTwo);
		System.out.println(lambdaThree);
		
		
	}

}
