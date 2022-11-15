/*
 * json 파일 형식 {key : value}
 * 호환성이 높고 용량이 적은 편
 */
package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class MapEx01 {

	public static void main(String[] args) {

		// 제네릭 타입 = 참조형만 가능
		HashMap<String, Integer> hashMap = new HashMap<>();
				
		// 요소 저장 : put()
		// key는 중복 허용 X, value는 중복 허용
		hashMap.put("하나", 1);
		hashMap.put("둘", 2);
		hashMap.put("셋", 3);
		hashMap.put("일", 1);
		
		// 요소 개수
		System.out.println("\n요소 개수 >> " + hashMap.size());
		
		// [출력] 저장된 키들의 집합 - 키만 추출
		System.out.println("\n<< 저장된 모든 요소의 키 추출 >>");
		// hash 함수 - 순서 유지 X 
		System.out.println(hashMap.keySet());
		
		// [출력] 키를 통한 값 출력 - 특정 키의 값
		System.out.println("\n키가 '하나'인 요소의 값 >> " + hashMap.get("하나"));
		System.out.println("\n키가 '셋'인 요소의 값 >> " + hashMap.get("셋"));
		System.out.println("\n키가 '넷'인 요소의 값 >> " + hashMap.get("넷"));
		
		// [출력 1] 키를 통한 값 출력 - 모든 요소의 값 출력
		// 향상된 for문, enhanced for loop, for each문
		for(String key: hashMap.keySet())
			System.out.printf("\nkey : %s, value : %d\n", key, hashMap.get(key));
		
		// list의 요소(만들어지는 객체) : node / Map의 요소 : Entry
		// Entry 추가 : key가 둘이고 값이 222인 Entry -> 값 재설정(덮어쓰기)
		hashMap.put("둘", 222);
		
		// [출력 2] entrySet()
		System.out.println("\n<< Entry 추가 후 전체 Entry 출력 >>");
		for(Entry<String, Integer> entry: hashMap.entrySet()) {
			System.out.println("key - " + entry.getKey());
			System.out.println("value - " + entry.getValue());
			System.out.println();
		}
		
		// [수정] 키로 접근하여 값 수정
		hashMap.replace("하나", 100);
		System.out.println("\n<< 수정 후 전체 Entry 출력 >>");
		
		// [출력] iterator()
		/*
		Iterator<String> iter = hashMap.keySet().iterator();
		String s = iter.next(); 
		while(iter.hasNext()) {
			System.out.println(s + " : " + hashMap.get(s));
		}
		*/
		
		Iterator<Entry<String, Integer>> iter = hashMap.entrySet().iterator();
		while(iter.hasNext()) {
			// System.out.println(iter.next().toString());
			Entry<String, Integer> entry = iter.next();
			System.out.println("key - " + entry.getKey());
			System.out.println("value - " + entry.getValue());
		}
		
		// [삭제] 키로 접근하여 특정 요소 삭제
		hashMap.remove("하나");
		System.out.println("\n<< 키가 하나인 요소 값 삭제 후 >>");
		for(String key: hashMap.keySet())
			System.out.printf("key : %s, value : %d\n", key, hashMap.get(key));			
	}
	

}
