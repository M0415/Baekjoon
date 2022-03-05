import java.util.Scanner;
public class Main_2442 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		for(int i=1; i<=N; i++ ) {
			for(int j = i; j<N; j++) {
				System.out.print(" ");
			}
			for(int y = 0; y< (i*2)-1 ; y++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		scanner.close();

  }
}
