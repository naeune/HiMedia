
class ArrayStack{
	
	int[] arr;
	int top = -1;
	
	int peek() {
		return arr[top];
	}
	
	int[] setArr(int num) {
		int[] arr = new int[num];
		//for (int element : arr)
		//	System.out.println(element);
		return arr;
	}
	
	void push(int num) {
		
	}	
	
	/*
	void pop() {
		
	}
	*/
}


public class Quiz03 {

	public static void main(String[] args) {

		ArrayStack stack = new ArrayStack();
		
		stack.setArr(5);
		
		stack.push(20);
		stack.push(15);
		
	}

}
