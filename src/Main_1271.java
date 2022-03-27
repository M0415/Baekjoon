import java.util.Scanner;
import java.math.BigInteger; // integer 범위를 맞추기 위한 선언
public class Main_1271 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BigInteger n = scanner.nextBigInteger();  // 기존 integer 보다 큰 범위
	    BigInteger m = scanner.nextBigInteger();
		
		BigInteger first = n.divide(m);   // 나누기
		BigInteger second = n.remainder(m);  // 나머지
		
		System.out.println(first);
		System.out.println(second);
		scanner.close();

	}

}
