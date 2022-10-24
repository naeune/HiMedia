class ArrayStack {
	
	// 멤버변수 = 객체변수(인스턴스 변수)
	int[] arr;
	int top = -1;	// 포인터
	
	int peek() {
		return arr[top];
	}
	
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
	
	int pop() {
		if(top >= 0) {
			return arr[top--];
		}
		else {
			System.out.println("스택이 비었습니다!");
		return top;
		}
	}
}
public class Quiz03 {

	public static void main(String[] args) {
		ArrayStack stack = new ArrayStack();
		
		stack.setArr(5);
		
		stack.push(20);
		stack.push(15);
		stack.push(10);
		stack.push(55);
		stack.push(8);
		stack.push(5);
		
		System.out.println("\ntop에 있는 아이템 출력 : " + stack.peek());
		
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		
	}

}
