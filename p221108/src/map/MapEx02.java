package map;

import java.util.HashMap;
import java.util.Map;

class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

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

public class MapEx02 {

	public static void main(String[] args) {

		Person hong = new Person("홍길동", 25);
		Person park = new Person("박보검" , 35);
		
		// [유형 1]
		// 다형성 구현 -> Spring에서 사용
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter.put("name", hong.getName());
		
		// [유형 2]
		Map<Integer, Person> store = new HashMap<Integer, Person>();
		store.put(1, hong);
		store.put(2, park);
	}

}
