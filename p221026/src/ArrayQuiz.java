class Fruits {
	String sort;
	int count;
	
	public Fruits(String sort, int count) {
		this.sort = sort;
		this.count = count;
	}
	
	public void fruitInfo() {
		System.out.println(this.sort + "가 " + this.count + "개 있습니다.");
	}
}
public class ArrayQuiz {
	public static void main(String[] args) {
		
		// 길이가 3인 객체 배열 생성
		Fruits[] fruit = new Fruits[3];
		fruit[0] = new Fruits("사과", 5);
		fruit[1] = new Fruits("바나나", 2);
		fruit[2] = new Fruits("망고", 3);
		
		// 1) 배열 요소(객체)의 정보 출력
		fruit[0].fruitInfo();
		fruit[1].fruitInfo();
		fruit[2].fruitInfo();
		
		for(int i=0; i<fruit.length; i++) {
				fruit[i].fruitInfo();
			}
		
		// 2) 향상된 for문
		for(Fruits f: fruit)
			f.fruitInfo();
		
		
	}

}
