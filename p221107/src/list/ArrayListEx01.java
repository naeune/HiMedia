package list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx01 {
	public static void main(String[] args) {
		
		// [컬렉션 클래스 ArrayList]
		
		// 리스트 생성
		ArrayList<String> arrayList = new ArrayList<String>();
		
		// 저장된 요소 확인
		System.out.println("비어있나요? >> " + arrayList.isEmpty());
		
		// 요소 추가
		// 배열은 새로 생성될 때 길이를 지정해야함(고정된 길이)
		// arrayList는 요소를 추가할 때마다 새로운 길이의 복사본이 생성됨 -> 데이터가 많아질 경우 비효율적
		arrayList.add("하나");
		arrayList.add("둘");
		arrayList.add("셋");
		arrayList.add("하나");

		// 저장된 요소 확인
		System.out.println("비어있나요? >> " + arrayList.isEmpty());
		
		// 특정 위치에 저장된 요소 출력
		System.out.println("인덱스 0에 저장된 요소 >> " + arrayList.get(0));
		
		// 저장된 요소 개수
		System.out.println("저장된 요소 개수? >> " + arrayList.size());
		
		// 객체 포함(존재) 여부 확인
		System.out.println("둘 있나요? >> " + arrayList.contains("둘"));
		System.out.println("넷 있나요? >> " + arrayList.contains("넷"));
		
		// [저장된 요소 전부 출력 1]
		System.out.println("\n<< 전체 요소 출력 1 >>");
		for(int index = 0; index < arrayList.size(); index++)
			System.out.println(arrayList.get(index));
		
		// [저장된 요소 전부 출력 2]
		System.out.println("\n<< 전체 요소 출력 2 >>");
		for(Object str: arrayList.toArray())
			System.out.println(str);
		
		// [저장된 요소 전부 출력 3]
		System.out.println("\n<< 전체 요소 출력 3 >>");
		for(String str: arrayList)
			System.out.println(str);
		
		// [저장된 요소 전부 출력 4]
		System.out.println("\n<< 전체 요소 출력 4 >>");
		Iterator<String> iter = arrayList.iterator();
		// hasNext() 기본적으로 index = 0;
		while(iter.hasNext())
			// next() 자체에 index++ 기능 구현
			System.out.println(iter.next());
		
		// 특정 요소 변경
		System.out.println("\n<< 셋 -> 여섯 변경 >>");
		arrayList.set(2, "여섯");
		/*
		// 위에 있던 커서(4) 위치를 그대로 인식
		// 새로 생성해 줘야 원하는 대로 출력 가능
		while(iter.hasNext())
			System.out.println(iter.next());
		*/
		// iterator : 일회용
		iter = arrayList.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());
		
		// 특정 요소 삭제
		System.out.println("\n<< 요소 둘 삭제 >>");
		arrayList.remove("둘");
		
		System.out.println("요소 둘 삭제 후 : 요소 개수 >> " + arrayList.size());
		
		// 저장된 요소 전부 출력
		for(Object str: arrayList.toArray())
			System.out.println(str);
	}
	

}
