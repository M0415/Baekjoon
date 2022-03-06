import java.util.Scanner;
public class Main_2752 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		int empty;
		
		if(A>B) {
			empty = A;
			A = B;
			B = empty;
		}
		if(A>C) {
			empty = A;
			A = C;
			C = empty;
		}
		if(B>C) {
			empty = B;
			B = C;
			C = empty;
			if(A>C) {
				empty = A;
				A = C;
				C = empty;
			}
		}
		
		
		
		System.out.printf("%d %d %d",A,B,C);

	}

}
