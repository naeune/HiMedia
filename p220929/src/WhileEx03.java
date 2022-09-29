/*
 * 1. 무한 루프문(반복문)
 * - 문법 : while(true)
 * - 좋다, 나쁘다의 개념으로 접근하는 것이 아님
 * - 반드시, 반복문 내에 break를 명시
 * 
 * 2. break
 * - 반복문 내에서 조건문과 함께 사용됨
 * - 의미 : 반복문 탈출
 * 
 */
public class WhileEx03 {
	public static void main(String[] args) {

		int idx = 1;		// 초기값
		// 하나씩 증가하는 값을 index라고 자주 부름
		
		// 무한 루프문(반복문) 구현
		while(true) {		//조건식 : true --> 무한 루프
			System.out.println("idx >> " + idx);
		
			if (idx == 3) { // 탈출 조건
				break;		// break 만나는 순간 반복문 탈출
			}
			
			idx++;			// 증감식
		}
		
		System.out.println("<<반복문 실행 종료>>");
	}

}
