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
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}
