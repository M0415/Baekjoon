import java.util.Scanner;
public class Main_2440 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		for(int i=0; i<N; i++) {
			for(int j=N; j>i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}

 }
}