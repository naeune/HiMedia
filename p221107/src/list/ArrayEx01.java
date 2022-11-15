package list;

import java.util.Arrays;

public class ArrayEx01 {

	public static void main(String[] args) {

		// 1. 길이가 3인 배열 생성
		String[] str = new String[3];
		str[0] = "one";
		str[1] = "two";
		str[2] = "three";
		// str[3] = "four";
		
		for(String s: str)
			System.out.println(s);
		
		// 2. 길이가 4인 배열 생성
		// 생성되었을 때 지정한 길이는 고정된 값, 길이 변경 시에는 복사의 과정을 거쳐야함
		// size()는 값의 개수이지 배열의 길이는 아님
		String[] copy = Arrays.copyOf(str, 4);
		copy[3] = "four";
		
		for(String s: copy)
			System.out.println(s);
	}

}
