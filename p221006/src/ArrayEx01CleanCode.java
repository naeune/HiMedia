/*
 * [배열]
 * : 하나의 이름으로 여러 값(요소, 원소)을 관리
 * : 여러 값을 구분하기 위해 인덱스 사용
 * 	-> 인덱스(index)는 0부터 시작
 * 
 * : 자바는 무조건 배열을 객체로 생성 --> heap 영역에 생성됨(주소 생성)
 * : 그래서 주소로 접근해야함! (간접 접근)
 * 
 * : [문법]
 * : 자료형[] 배열명(참조변수) = new 자료형[길이];
 * 
 * : 배열을 생성하면, 배열의 길이가 length 변수에 저장
 * : --> 문법 : 배열명.length
 * : --> length는 변경 불가능 (ex 배열명.length = 5;)
 * 
 */
public class ArrayEx01CleanCode {

	public static void main(String[] args) {

		// 1. 배열 생성과 동시에 초기화
		// int[] math = new int[] {90, 95, 85, 70, 100};
		
		// 생성과 동시에 초기화 할 때만, new int[] 생략 가능!
		int[] math = {90, 95, 85, 70, 100};

		
		// 2. 배열 요소 값 확인 -> 반복문 for문 사용		
		// 2-1. 일반 for문
		for (int i = 0; i < 5; i++) {
			System.out.println("math[" + i + "] = " + math[i]);
			// System.out.printf("math[%d] = %d\n", i, math[i]);
		}
		
		// 2-2. 향상된 for문 : 배열에서 쉽게 표현된 for문
		System.out.println("\n<< 향상된 for문 >>");
		for(int element : math) // element는 지역변수 -> for문이 실행되었을 때 생성, 끝나면 소멸
			System.out.println(element);
		
		
	}

}
