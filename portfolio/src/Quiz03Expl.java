class ArrayStack {
	
	/*멤버 변수*/
	//객체 변수(인스턴스 변수)
	int[] arr;
	int top = -1;
	
	/*멤버 메서드*/
	//배열 생성
	void setArr(int length) {
		arr = new int[length];
	}
	
	/*멤버 메서드*/
	//배열에 값을 넣는 메서드
	void push(int element) {
		
		if(top < arr.length-1) {
			arr[++top] = element;
			System.out.println("Inserted Item: " + arr[top]);
		}
		else {
			System.out.println("스택이 꽉 찼습니다. 용량 초과.");
		}
	}
	
	/*멤버 메서드*/
	//배열의 값을 반환하는 메서드
	int pop() {
		
		if(top >= 0) {
			return arr[top--];
		}
		else {
			System.out.println("스택이 비었습니다. 꺼내올 데이터가 없습니다.");
			return top;
		}
	}
	
	/*멤버 메서드*/
	//인덱스 꼭대기 값을 나타내는 메서드
	int peek() {
		return arr[top];
	}

}

public class Quiz03Expl {

	public static void main(String[] args) {

		ArrayStack stack = new ArrayStack();
		
		stack.setArr(5);
		
		stack.push(20);
		stack.push(15);
		stack.push(10);
		stack.push(55);
		stack.push(8);
		stack.push(5);
		
		
		System.out.println("\ntop에 있는 아이템 출력: " + stack.peek());
		
		System.out.println("pop 실행: " + stack.pop());
		System.out.println("pop 실행: " + stack.pop());
		System.out.println("pop 실행: " + stack.pop());
		System.out.println("pop 실행: " + stack.pop());
		System.out.println("pop 실행: " + stack.pop());
		System.out.println("pop 실행: " + stack.pop());

	}

}
