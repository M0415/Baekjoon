import java.util.Scanner;

public class Main_1330 {

	public static void main(String[] args) {
		
		int A, B;
		Scanner scanner = new Scanner(System.in);
		A= scanner.nextInt();
		B= scanner.nextInt();
		
		if(A>B) {
			System.out.println(">");
		} else if(A<B) {
			System.out.println("<");
		} else {
			System.out.println("==");
		}
		
		
	}

}
