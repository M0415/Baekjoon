import java.util.Scanner;
public class Main_4504 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		while(true) {
			int input = scanner.nextInt();
			if(input == 0 || input == 10000) {
				break;
			}
			if(input%N == 0) {
				System.out.printf("%d is a multiple of %d.\n",input,N);
			} else {
				System.out.printf("%d is NOT a multiple of %d.\n",input,N);
			}
		}
		scanner.close();

	}

}
