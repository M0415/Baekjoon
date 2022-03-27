import java.util.Scanner;
public class Main_2525 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		
		B = B+C;
		while(B>=60) {
			if(B>=60) {
				B = B-60;
				A++;
			}
			if(A>=24) {
				A = A-24;
			}
		}
		System.out.printf("%d %d",A,B);
		scanner.close();

	}

}
