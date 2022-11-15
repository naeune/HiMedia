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
	
	@Override
	public int hashCode() {
		// System.out.println(name.hashCode());
		return name.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof PhoneBookInfo) {
			PhoneBookInfo info = (PhoneBookInfo)obj;
			System.out.println("이미 저장된 이름입니다.");
			return name.equals(info.name);
		}
		return false;
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
