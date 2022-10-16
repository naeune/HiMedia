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
 * 
 */
public class ArrayEx01 {

	public static void main(String[] args) {

		// [우리 반 학생들의 수학 점수 저장]
		/*
		int math01 = 80; // 1번 학생의 수학점수는 80점(값은 정수)
		int math02 = 95; 
		int math03 = 90; 
		int math04 = 70; 
		int math05 = 100;
		*/ 
		// 수학점수를 하나의 이름으로 관리하고자 할 때 사용 -> 배열
		
		// 1. 배열 생성
		
		//int math[];
		int[] math; // 아직 배열 생성은 안됨, math는 참조변수
		// [] : 배열을 나타내는 타입, 안에 숫자나 문자 작성 X
		// 자료형[] 참조변수;
		// int형 배열의 주소가 참조변수 math에 저장
		
		math = new int[5]; // 자료형 일치
		// 배열 생성
		// new 자료형[길이]
		// int형의 길이가 5인 배열을 생성
		
		
		// 2. 배열 요소 값 설정
		math[0] = 90;
		math[1] = 95;
		math[2] = 85;
		math[3] = 70;
		math[4] = 100;
		
		
		// 3. 배열 요소 값 확인 -> 반복문 for문 사용
		// heap 메모리 안에서 자동 초기화(0)
		
		/*
		System.out.println("math[0] >> " + math[0]);
		System.out.println("math[1] >> " + math[1]);
		System.out.println("math[2] >> " + math[2]);
		System.out.println("math[3] >> " + math[3]);
		System.out.println("math[4] >> " + math[4]);
		*/
		
		System.out.println("배열의 길이 >> " + math.length);
		
		// 일반 for문
		for (int i = 0; i < 5; i++) {
			System.out.println("math[" + i + "] = " + math[i]);
			// System.out.printf("math[%d] = %d\n", i, math[i]);
		}
		
		// 4. 향상된 for문 : 배열에서만 사용!
		// 배열에서 쉽게 표현된 for문
		// for(자료형 변수명 : 참조변수)
		// 명령어;
		System.out.println("\n<< 향상된 for문 >>");
		for(int element : math) // element는 지역변수 -> for문이 실행되었을 때 생성, 끝나면 소멸
			System.out.println(element);
		
		
	}

}
