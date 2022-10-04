
public class MethodEx02 {
	
	// [메서드 정의]
	// 메서드 정의 형태 : 매개 변수 있고, 리턴값 없음
	// 기능 : 정수 1개를 받은 후, 1증가된 값 출력
	
	public static void increment(int num) {
		num++;
		System.out.println("1증가된 값 >> " + num);
	}
	
	
	// main method
	public static void main(String[] args) {
		increment(5);
		increment(10);
	}

}
