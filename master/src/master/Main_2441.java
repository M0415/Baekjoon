import java.util.Scanner;
public class Main_2441 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		for(int i=0; i<N; i++) {
			for(int x=0; x<i; x++) {
				System.out.print(" ");
			}
			for(int y=N; y>i; y--) {
				System.out.print("*");
			}
			System.out.print("\n");
			
		}
		scanner.close();

	}

}
