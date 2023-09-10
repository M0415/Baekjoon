import java.util.Scanner;
public class Main_5596 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int sum1 = 0;
		int sum2 = 0;
		
		for(int i=0; i<4; i++) {
			int min = scanner.nextInt();
			sum1 += min;
		}
		for(int i=0; i<4; i++) {
			int man = scanner.nextInt();
			sum2 += man;
		}
		if(sum1 >= sum2) {
			System.out.print(sum1);
		} else {
			System.out.print(sum2);
		}
		
		scanner.close();
	}

}
