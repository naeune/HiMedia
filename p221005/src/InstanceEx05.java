
public class InstanceEx05 {

	// constructRobot 메서드 정의
	public static Robot constructRobot() {
		
		Robot robot = new Robot();
		
		robot.setProductYear(2000);
		robot.setProductName("옵티머스");
		return robot;
		
	}
	
	public static void main(String[] args) {

		Robot robot = constructRobot();
		// robot이 참조변수라서 메서드 리턴값은 주소여야함
		
		System.out.println("로봇의 생산년도 >> " + robot.getProductYear());
		System.out.println("로봇의 제품명 >> " + robot.getProductName());
	}

}
