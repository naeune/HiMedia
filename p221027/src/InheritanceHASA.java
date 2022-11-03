/*
 * [상속 관계] IS-A 관계
 * -  ~는    ~다
 * - (자식) (부모)
 * 	ex1) 학생은 사람이다(o)
 *  ex2) 사람은 학생이다(x)
 *  
 * [포함 관계] HAS-A 관계
 *  - ~는    ~를 소유(포함)하고 있다.
 *   (자식)  (부모)
 *  ex1) 폰은 카메라를 포함하고 있다(o)
 *  ex2) 카메라는 폰을 포함하고 있다(x)
 *  
 *  ex1) 경찰이 총을 소유하고 있다(o)
 *  ex2) 총이 경찰을 소유하고 있다(x)
 */

class Gun {
	int bullet;
	
	public Gun(int bnum) {
		bullet = bnum;
	}
	public void shoot() {
		System.out.println("BBANG!");
		bullet--;
	}
}
class Police {
	
	int handcuffs;
	// containment
	// 객체가 다른 객체를 포함
	// 클래스 안의 참조변수(객체의 주소값 저장)가 있다 = 포함 관계
	// 참조변수가 멤버변수 = 포함 관계
	Gun pistol;
	// pistol은 참조변수지만 heap 영역에 메모리 할당
	
	public Police(int bnum, int bcuff) {
		handcuffs = bcuff;
		if(bnum != 0) 
			pistol = new Gun(bnum);
		else
			pistol = null;
	}
	
	public void putHandcuff() {
		System.out.println("SNAP!");
		handcuffs--;
	}
	
	public void shoot() {
		if(pistol == null)
			System.out.println("Hut BBANG!");
		else
			pistol.shoot();
	}
}

public class InheritanceHASA {
	public static void main(String[] args) {

		Police pman = new Police(5, 3);
		pman.shoot();
		pman.putHandcuff();
		
	}

}
