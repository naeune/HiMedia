package second;

import first.AccessEx01;

public class AccessEx04 extends AccessEx01 {

	// void show() {
		// 상속 관계에서 자식도 private 접근 불가
		// System.out.println(one);	// Error! - private
		// System.out.println(two);	// Error! - default
		// System.out.println(three);	// protected -> 상속일 경우 자식한테만 접근 허용
		// System.out.println(four);	// public
}
