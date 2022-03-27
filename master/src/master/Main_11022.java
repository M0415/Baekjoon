import java.util.Scanner;
public class Main_11022 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		int x = scanner.nextInt();
		int[] arr = new int[x];
		
		for(int i=0; i<x ;i++) {
			int A = scanner.nextInt();
			int B = scanner.nextInt();
			arr[i] = A+B;
			
				System.out.printf("Case #%d: %d + %d = %d\n",i+1, A, B, arr[i]);
			
			}
		}
		

	}


