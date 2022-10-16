class ArrayStack {
	
	// 멤버변수 = 객체변수(인스턴스 변수)
	int[] arr;
	int top = -1;	// 포인터
	
	// 멤버 메서드
	// 배열 생성
	void setArr(int length) {
		arr = new int[length];
	}
	
	// 배열에 값을 넣는 메서드
	void push(int element) {
		
		if(top < arr.length-1) {
			arr[++top] = element;
			System.out.println("Inserted Item : " + arr[top]);
		}else {
			System.out.println("스택이 꽉 찼습니다. 용량 초과!!!");
		}
	}
}
public class QuizEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
