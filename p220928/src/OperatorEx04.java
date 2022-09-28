
public class OperatorEx04 {

	public static void main(String[] args) {

		int num1 = 7;
		int num2, num3;
		
		num2 = ++num1;	// num1 = 8
		num3 = --num1;
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("num3 : " + num3);
		
		int num4 = 7;
		int num5, num6;
		
		num5 = num4++;
		num6 = num4--;
		
		System.out.println("num4 : " + num4);
		System.out.println("num5 : " + num5);
		System.out.println("num6 : " + num6);
		
	}

}
