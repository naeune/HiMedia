package book;

public class AnimalInfo {
	
	private String name;
	private int age;

	public AnimalInfo(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showAnimalInfo() {
		System.out.println("name >> " + name);
		System.out.println("age >> " + age);
		System.out.println();
	}
	
	
}
