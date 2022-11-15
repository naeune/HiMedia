package hash;

import java.util.HashSet;
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
	
	
	// overriding : hashCode()
	@Override
	public int hashCode() {
		// String의 해쉬코드 값은 정해져있음, 정수(기본자료형)의 해쉬코드 값은 없음
		// 홍길동 + 25 -> 홍길동25(자동형변환)
		return (this.name + this.age).hashCode();
	}
	
	// overriding : equals()
	// obj에는 기존요소가 들어와서 새로 들어올 요소를 기준으로 비교
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p = (Person)obj;
			return name.equals(p.name) && (age == p.age);
		} else {
			return false;
	}
}
	

public class hashSetQuiz {
	public static void main(String[] args) {
		
		Person hong = new Person("홍길동", 25);
		Person park = new Person("박보검", 35);

		// ArrayList 생성
		HashSet<Person> hashSet = new HashSet<Person>();
		
		// 요소 추가
		hashSet.add(hong);
		hashSet.add(park);
		hashSet.add(new Person("이미자", 52));
		
		// 전체 요소 출력 -> 이름만
		System.out.println("<< 전체 요소 출력 >>");
		System.out.println("-- iterator() 사용 --");
		Iterator<Person> iter = hashSet.iterator();
		while(iter.hasNext())
			System.out.println(iter.next().getName());
		
		// 새 요소 추가 : 이미자
		hashSet.add(new Person("이미자", 52));
		
		
		// 새 요소 추가 후 전체 요소 출력 --> 이미자, 52 데이터가 2개
		System.out.println("\n<< 전체 요소 출력 >>");
		System.out.println("-- toArray() 사용 --");
		for(Object o: hashSet.toArray()) {
			// System.out.println(o.hashCode());
			System.out.println(((Person)o).getName());
			System.out.println();
		}
	}

	}
}