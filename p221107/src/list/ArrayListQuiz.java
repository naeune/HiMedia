package list;

import java.util.ArrayList;
import java.util.Iterator;

class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// setter, getter 추가
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}

public class ArrayListQuiz {
	public static void main(String[] args) {

		Person hong = new Person("홍길동", 25);
		Person park = new Person("박보검", 35);
		
		ArrayList<Person> array = new ArrayList<Person>();
		array.add(hong);
		array.add(park);
		array.add(new Person("이미자", 52));
		
		System.out.println("<< 저장된 이름 전체 출력 >>");
		/*
		 * for(int index = 0; index < array.size(); index++)
		 *  System.out.println(array.get(index));
		 */
		for(Person p: array)
			System.out.println(p.getName());
		
		System.out.println("\n<< 저장된 전체 요소 개수 >>");
		System.out.println(array.size());
		
		System.out.println("\n<< 인덱스 1의 이름 >>");
		System.out.println(array.get(1).getName());
		
		System.out.println("\n<< 35세 박보검 포함 여부 >>");
		System.out.println("박보검 있나요? >> " + array.contains(park));
		
		System.out.println("\n<< 52세 이미자 포함 여부 >>");
		// contains는 주소로 비교 -> 참조변수가 없으면 인식 못함
		System.out.println("이미자 확인 되나요? >> " + array.contains(new Person("이미자", 52)));
		
		System.out.println("\n<< 홍길동 이름을 화이팅으로 변경 >>");
		for(int index = 0; index < array.size(); index++)
			if(array.get(index).equals(hong))
				array.get(index).setName("화이팅");
		// array.set(0, hong);
		/*
		for(Person p: array)
			System.out.println(p.getName());
		*/
		
		// [출력] 반복자 사용
		Iterator<Person> iter = array.iterator();
		while(iter.hasNext())
			System.out.println(iter.next().getName());
			
		// [출력] toArray() - Object[] type return
		for(Object o: array.toArray())
			System.out.println(((Person)o).getName());
	}

}
