import java.util.Scanner;
public class Main_2480 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		int sum = 0;
		
		if(A==B && B==C) {
			sum = 10000+(A*1000);
		} else if(A==B && B!=C) {
			sum = 1000+(A*100);
		} else if(A!=B && B==C) {
			sum = 1000+(B*100);
		} else if(A==C && C!=B) {
			sum = 1000+(C*100);
		} else if(A!=B && B!=C && A!=C) {
			if(A>B) {
				sum = A*100;
				if(A<C) {
					sum = C*100;
				}
			}else if(B>A) {
				sum = B*100;
				if(B<C) {
					sum = C*100;
				}
			}else if(C>A) {
				sum = C*100;
				if(C<B) {
					sum = B*100;
				}
			}
		}
		System.out.println(sum);
		scanner.close();

	}

}
