package phone;

public class PhoneBookInfo {
	String name;
	String phoneNumber;
	
	public PhoneBookInfo(String name, String phone) {
		this.name = name;
		this.phoneNumber = phone;
	}
	
	public void showPhoneInfo() {
		System.out.println("name : " + this.name);
		System.out.println("phone : " + this.phoneNumber);
		System.out.println();
	}
	
	
}
