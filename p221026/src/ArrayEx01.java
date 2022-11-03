
public class ArrayEx01 {

	public static void main(String[] args) {

		// 배열 생성과 동시에 초기화
		// new int[][] 생략 가능
		// int[][] arr = new int[][] {{2, 4, 6}, {8, 10}};
		
		int[][] arr = new int[2][];
		
		// new int[] 생략 불가능
		arr[0] = new int[] {2, 4, 6};
		arr[1] = new int[] {8, 10};
		
		
		for (int i=0; i < arr.length; i++) {
			for(int j=0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
