import java.util.Scanner;
public class Main_5532 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int L = scanner.nextInt();
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		int D = scanner.nextInt();
		
		int math = 0;
		int language = 0;
		
		while(B>0) {
			B -= D;
			math++;
		}
		
		while(A>0) {
			A -= C;
			language++;
		}
		if(math >=language) {
			L -= math;
			System.out.print(L);
		}else if(language >= math) {
			L -= language;
			System.out.print(L);
		}
		scanner.close();
	}
}


