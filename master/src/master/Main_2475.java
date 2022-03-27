import java.util.Scanner;
public class Main_2475 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int one = scanner.nextInt();
		int two = scanner.nextInt();
		int three = scanner.nextInt();
		int four = scanner.nextInt();
		int five = scanner.nextInt();
		
		one = one*one;
		two = two*two;
		three = three*three;
		four = four*four;
		five = five*five;
		
		int sum = one+two+three+four+five;
		sum = sum%10;
		System.out.print(sum);
		
		scanner.close();

	}

}
