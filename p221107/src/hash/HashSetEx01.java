/*
 * [중복값 허용하지 않음]
 * HashSet은 요소를 추가하기 전에 저장된 요소 값과 비교
 * 
 * 1. hashCode()
 * 2. equals()
 * 
 * 그래서, 중복 없이 요소를 추가하려면 
 * hashCode()와 equals() 메서드를 상황에 맞게 오버라이딩 해야함
 * 
 */

package hash;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx01 {
	public static void main(String[] args) {

		HashSet<String> hashSet = new HashSet<String>();
		
		// 저장된 요소 존재 여부
		System.out.println("비어 있나요? >> " + hashSet.isEmpty());
		
		// 요소 추가
		hashSet.add("하나");
		hashSet.add("둘");
		hashSet.add("셋");
		hashSet.add("하나");
		
		// 특정 위치에 저장된 요소 출력 : 순서가 없기 때문에 인덱스 사용 X
		// System.out.println("인덱스 0 >> " + hashSet.get(0));	// Error!
		
		// 요소 개수
		System.out.println("저장된 요소 개수 >> " + hashSet.size());
		
		// 객체 포함(존재) 여부
		System.out.println("둘 있나요? >> " + hashSet.contains("둘"));
		System.out.println("넷 있나요? >> " + hashSet.contains("넷"));
		
		// [저장된 요소 전부 출력 1]
		System.out.println("\n<< 전체 요소 출력 1 >>");
		for(Object str: hashSet.toArray())
			System.out.println(str);
		
		// [저장된 요소 전부 출력 2]
		System.out.println("\n<< 전체 요소 출력 2 >>");
		for(String str: hashSet)
			System.out.println(str);
		
		// [저장된 요소 전부 출력 3]
		System.out.println("\n<< 전체 요소 출력 3 >>");
		Iterator<String> iter = hashSet.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());
		
		// 요소 추가 : 둘
		System.out.println("둘 요소 추가 >> " + hashSet.add("둘"));
		System.out.println("요소 추가 후 길이 >> " + hashSet.size());
		
		// 요소 '둘'의 해쉬값
		System.out.println("둘 hashCode() >> " + "둘".hashCode());
		
		System.out.println("\n<< 요소의 해쉬값 >>");
		iter = hashSet.iterator();
		String s;
		while(iter.hasNext()) {
			s = iter.next();
			System.out.println(s + " : " + s.hashCode());
		}
		
		
	}

}
