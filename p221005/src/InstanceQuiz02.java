class Customer {
	int id;
	String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	void showInfo() {
		System.out.printf("ID : %d, NAME : %s\n", id, name);
	}
}
public class InstanceQuiz02 {
	public static void main(String[] args) {

		Customer hong = new Customer();
		
		hong.setId(1);
		hong.setName("홍길동");
		hong.showInfo();
		
		Customer park = new Customer();
		
		park.setId(2);
		park.setName("박보검");
		park.showInfo();
		
	}

}
