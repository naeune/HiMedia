package polymorphism;

public class Ex02 {
	public static void main(String[] args) {

		Parent p = new Parent();
		Son s = new Son();
		Daughter d = new Daughter();
		
		// 댜형성, upcasting
		Parent p2 = new Son();
		
		/*
		 * [형 변환 가능 여부]
		 * 문법 : 참조변수 or 객체 instanceof(연산자) 자료형
		 * 결과 : true / false
		 * 
		 */
		// 참조변수의 주소를 타고 간 객체의 자료형 비교, 일치 or 상속 (관련이 있는지?)
		System.out.println("<< Parent type과 비교 >>");
		System.out.println(p instanceof Parent);
		System.out.println(s instanceof Parent);
		System.out.println(d instanceof Parent);
		System.out.println(p2 instanceof Parent);
		
		System.out.println("<< Son type과 비교 >>");
		System.out.println(p instanceof Son);
		System.out.println(s instanceof Son);
		System.out.println(p2 instanceof Son);
		// System.out.println(d instanceof Son); // Error!
		
		// 다형성으로 구현된 객체 배열
		Parent[] mother = {new Son(), new Daughter()};
		// 접근 연산자의 우선순위가 형변환 연산자보다 높기 때문에 괄호 사용!
		((Son)mother[0]).study();
		((Daughter)mother[1]).play();
		
		// 향상된 for문
		for(Parent parent: mother) {
			if(parent instanceof Son)
				((Son)parent).study();
			else if(parent instanceof Daughter)
				((Daughter)parent).play();
			
			
		}
		
	}

}
