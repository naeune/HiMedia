/*
 * [Stream] 스트림
 * - JDK 1.8 (Java 8)부터 지원 - lambda, functional interface, Stream
 * - 람다식과 함께 컬렉션에 저장된 데이터 처리를 간결하게 표현
 * - 내부 반복자를 사용하기에 병렬처리 쉬움 
 * 
 * << 특징 >>
 * - 복사본 : 원본의 데이터를 변경하지 않음
 * - 일회용 : 한번 사용이 끝나면 재사용 불가능
 * 		  : 닫힌 Stream을 다시 사용하면 IllegalStateException 발생
 * - 내부 반복자를 통해서 처리
 * 
 * << 3단계 >>
 * Stream 객체 생성 -> 중간 연산(가공) -> 최종 연산(결과)
 * 중간 연산(가공)의 과정은 생략 가능
 */
package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex01 {
	public static void main(String[] args) {

		List<String> list = Arrays.asList("하나", "둘", "셋");
		
		// 1. Stream 객체 생성
		// list에 스트림을 만들어주는 메서드
		Stream<String> listStream = list.stream();
		listStream.forEach(System.out::println);
	}

}
