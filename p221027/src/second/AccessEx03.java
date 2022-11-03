// 현재 파일의 위치
package second;

// 쓰고자 하는 외부 파일의 위치
import first.AccessEx01;

public class AccessEx03 {
	// 같은 파일, 패키지에 있어야 인식 가능 -> import 사용
	
	// 멤버 변수
	AccessEx01 ac = new AccessEx01();
	
	// 멤버 메서드
	void show() {
		// System.out.println(ac.one); 		// Error! - private(클래스 내)
		// System.out.println(ac.two); 		// Error! - default(같은 패키지)
		// System.out.println(ac.three);	// Error! - protected(상속 관계 <- 외부 접근 허용 X)
		System.out.println(ac.four);		// public
	}

}
