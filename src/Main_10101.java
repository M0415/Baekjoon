import java.util.Scanner;
public class Main_10101 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		int sum = A+B+C;
		
		if(A==60 && A==B && B==C) {
			System.out.print("Equilateral");
		} else if(sum == 180 && (A==B || B==C || A==C)) {
			System.out.print("Isosceles");
		} else if (sum == 180 && (A != B && B != C && A != C)) {
			System.out.print("Scalene");
		} else {
			System.out.print("Error");
		}
		scanner.close();//37

	}

}
