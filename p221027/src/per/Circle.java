package per;

import area.CircleArea;

public class Circle {

	public static void main(String[] args) {

		CircleArea area = new CircleArea(1.5);
		System.out.println("원 넓이 >> " + area.getArea());
	}

}
