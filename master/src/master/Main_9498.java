import java.util.Scanner;

public class Main_9498 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int goal = scanner.nextInt();   //점수 입력.
		
		if(goal>=90 && goal<=100) {
			System.out.println("A");
		} else if(goal>=80 && goal<=89) {
			System.out.println("B");
		} else if(goal>=70 && goal<=79) {
			System.out.println("C");
		} else if(goal>=60 && goal<=69) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
	}

}
