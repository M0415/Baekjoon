import java.util.Scanner;

public class Main_2753 {

	public static void main(String[] args) {
		
		int input;
		Scanner scanner = new Scanner(System.in);
		input = scanner.nextInt();
		
		
		if((input%4)==0 && (((input%100)!=0)||((input%400)==0))) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		
	}

}
