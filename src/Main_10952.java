import java.util.Scanner;
public class Main_10952 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int A;
		int B;
		
		
		while(true) {
			A = scanner.nextInt();
			B = scanner.nextInt();
			if(A==0&&B==0) {
				break;
			}
			int sum=A+B;
			System.out.println(sum);
		}



	}

}
