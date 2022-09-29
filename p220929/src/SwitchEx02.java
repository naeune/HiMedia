
public class SwitchEx02 {
	public static void main(String[] args) {

		int n = 24;
		
		/*
		 * [if문]
		if (n > 0 && n < 10) 			// 0 ~ 9
			System.out.println("0이상 10미만의 수");
		else if (n >= 10 && n < 20)		// 10 ~ 19
			System.out.println("10이상 20미만의 수");
		else if (n >= 20 && n < 30)		// 20 ~ 29
			System.out.println("20이상 30미만의 수");
		else							// 그 외 나머지 모두
			System.out.println("30이상의 수");
		*/	
		
		// [switch문]
		switch (n / 10) {
		case 0:
			System.out.println("0이상 10미만의 수");
			break;
		case 1:
			System.out.println("10이상 20미만의 수");
			break;
		case 2:
			System.out.println("20이상 30미만의 수");
			break;
		default:
			System.out.println("30이상의 수");
		}
	}

}
