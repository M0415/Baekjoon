import java.util.Scanner;
import java.math.BigInteger;
public class Main_10757 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BigInteger A = scanner.nextBigInteger();
		BigInteger B = scanner.nextBigInteger();
		
		BigInteger sum = A.add(B);
		
		System.out.print(sum);
		
		scanner.close();

	}

}
