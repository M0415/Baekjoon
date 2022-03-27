import java.util.Scanner;
public class Main_10818 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] arr = new int[N];
		int min=1000000; //범위를 정해주기
		int max=-1000000; 
		
		for(int i=0; i<arr.length; i++ ) {
			arr[i] = scanner.nextInt();
		}
		
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];			
			} 
			if (min>arr[i]) {
				min = arr[i];
			}
		}
		System.out.printf("%d %d",min,max);

	}

}
