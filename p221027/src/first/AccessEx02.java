package first;

// 외부 클래스에 있는 멤버 사용 -> 상속 or 포함
public class AccessEx02 {

	AccessEx01 ac = new AccessEx01();
		
		void show() {
			// System.out.println(ac.one); // Error! - private
			System.out.println(ac.two); // default
			System.out.println(ac.three); // protected
			System.out.println(ac.four); // public
		}
	}
