import java.util.Scanner;
public class Main_2739 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		for(int i=1; i<10;i++) {
			int sum = (N*i);
			System.out.printf("%d * %d = "+sum+"\n",N,i);
		}

	}

}
