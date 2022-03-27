import java.util.Scanner;
public class Main_2845 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int sum = A*B;
		int[] arr = new int[5];
		int[] f = new int[5];
		for(int i=0; i<5; i++) {
			int C = scanner.nextInt();
			arr[i] = C;
		}
		for(int i=0; i<5; i++) {
			f[i] = arr[i] - sum;
		}
		
		System.out.printf("%d %d %d %d %d",f[0],f[1],f[2],f[3],f[4]);

	}

}
