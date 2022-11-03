package inter;

interface Vehicle {
	// 멤버
	
	public abstract void printNumber();
	
}


class Car implements Vehicle {
	int carNumber;
	
	public Car(int num) {
		this.carNumber = num;
	}
	
	@Override
	public void printNumber() {
		System.out.println("자동차 등록번호 : " + this.carNumber);
		
	}
	
	public void drive() {
		System.out.println("자동차가 고속도로를 달립니다.\n");
	}
	
	// public void sail() {}
}

class Yacht implements Vehicle {
	int yachtNumber;
	
	public Yacht(int num) {
		this.yachtNumber = num;
	}
	
	@Override
	public void printNumber() {
		System.out.println("요트 등록번호 : " + this.yachtNumber);
	}
	
	// public void drive() {}
	
	public void sail() {
		System.out.println("요트가 한강 위를 떠다닙니다.\n");
	}
}

public class InterfaceQuizEx {
	public static void main(String[] args) {
		// 다형성 구현
		Vehicle[] myVehicle = new Vehicle[2];
		myVehicle[0] = new Car(8586);
		myVehicle[1] = new Yacht(679111);
		
		// 1. 일반 for문
		for(int i = 0; i < myVehicle.length; i++) {
			myVehicle[i].printNumber();
			
			// down casting
			if(myVehicle[i] instanceof Car)
				((Car)myVehicle[i]).drive();
			else if(myVehicle[i] instanceof Yacht)
				((Yacht)myVehicle[i]).sail();
		}
		
		// 2. 향상된 for문
		for(Vehicle v: myVehicle) {
			v.printNumber();
			
			if(v instanceof Car)
				((Car)v).drive();
			else if (v instanceof Yacht)
				((Yacht)v).sail();
		}
		
		// 반복문 사용
		// : method drive(), sail() 호출
		// : method printNumber 호출
		
		// [실행 결과]
		// 자동차 등록번호 : 8586
		// 자동차가 고속도로를 달립니다.
		//
		// 요트 등록번호 : 679111
		// 요트가 한강 위를 떠다닙니다.
		//
		
	}

}
