import java.util.Scanner;
public class Main_2439 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		
		for(int i=0; i<N; i++) {
			for(int k=1; k<N-i; k++) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}

}
