package inner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
// import java.util.Arrays;

public class AnonymousClassEx04 {
	public static void main(String[] args) {

		// ArrayList 생성
		ArrayList<String> hangul = new ArrayList<String>();
		hangul.add("하늘"); 
		hangul.add("돌"); 
		hangul.add("나비");
		hangul.add("바람"); 
		System.out.println("정렬 전 >> " + hangul);
		
		// cf) 1차원 배열
		/*
		String[] str = {"하늘", "바람", "돌", "나비"};
		System.out.println(str);
		System.out.println("배열을 문자열로 출력 : " + Arrays.toString(str));
		*/
		
		// ==============================================================
		// [오름차순 정렬 1] Collections.sort()
		// ==============================================================		
		Collections.sort(hangul);
		System.out.println("정렬 후 >> " + hangul);
		// index 값도 같이 정렬
		
		// cf) 내림차순 정렬
		// 오름차순 정렬 후 역순 -> 내림차순
		Collections.sort(hangul, Collections.reverseOrder());
		System.out.println("내림차순 정렬 후 >> " + hangul);
		
		// ==============================================================
		// [오름차순 정렬 2] List.sort() : Java 8 이후
		// ==============================================================
		hangul.sort(Comparator.naturalOrder());
		System.out.println("[List.sort()] 정렬 후 >> " + hangul);
		
		// cf) 내림차순 정렬
		hangul.sort(Comparator.reverseOrder());
		System.out.println("[List.sort()] 내림차순 정렬 후 >> " + hangul);
		
		// ==============================================================
		// [오름차순 정렬 3] 사용자 정의 : Comparable 인터페이스
		// ==============================================================
		// Comparator<String> 인터페이스를 구현 클래스 없이 객체(인스턴스)화
		// --> 익명 클래스
		// 첫번째 파라미터 > 두번째 파라미터 : 양수 --> 기준(왼쪽) 크다, 순서 교체
		// 첫번째 파라미터 < 두번째 파라미터 : 음수 --> 기준(왼쪽) 작다, 순서 유지
		// 첫번째 파라미터 = 두번째 파라미터 : 0   --> 서로 같다,		 순서 유지
	
		Comparator<String> comparator = new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.compareTo(s2);	// 오름차순
				// return s2.compareTo(s1);	// 내림차순
			}
		};
		// 오름차순 정렬
		hangul.sort(comparator);
		System.out.println("[익명 클래스] 정렬 후 : " + hangul);
		
		// cf) compareTo() method
		System.out.println("A와 B 비교 >> " + "A".compareTo("B")); // 아스키코드값으로 비교
		System.out.println("B와 A 비교 >> " + "B".compareTo("A"));
		System.out.println("A와 a 비교 >> " + "A".compareTo("a"));
		System.out.println("Hello와 Hell 비교 >> " + "Hello".compareTo("Hell")); // 길이로 비교
		System.out.println("Hello와 Hi 비교 >> " + "Hello".compareTo("Hi")); // e와 i의 아스키코드값으로 비교
	}

}
