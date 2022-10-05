
public class InstanceEx04 {

	// 메서드 정의
	public static void newYear(Student student) { // 리턴형에 class가 올 수 있음
		// 같은 폴더에 있어서 Student 클래스 인식
		System.out.println("이름 >>> " + student.name);
		System.out.println("나이 >>> " + student.age++);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("main method 실행 시작 >>> ");
		
		Student hong = new Student();
		hong.age = 25;
		hong.name = "홍길동";
		
		newYear(hong);	// 괄호 안에는 참조변수,객체 생성식 작성
						// 객체 생성될 때 주소값 저장
		
		System.out.println("홍길동의 나이 >> " + hong.age);
		
		Student park = new Student();
		park.age = 30;
		park.name = "박보검";
		
		// newYear(new Student());
		// 객체 생성 -> 주소
		// 사용 가능한 코드지만 이후에 사용 불가능 -> 주소값을 받아줄 변수가 없어서
		
		newYear(park);
		System.out.println("박보검의 나이 >> " + park.age); 
	}

}
