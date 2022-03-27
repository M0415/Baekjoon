import java.math.BigInteger; //Integer만을 사용하게 되면 1000자리를 받아들일 수 없어 사용한다
import java.util.Scanner;
public class Main_2338 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BigInteger A = scanner.nextBigInteger();
		BigInteger B = scanner.nextBigInteger();
		
		System.out.printf(A.add(B)+"\n"+A.subtract(B)+"\n"+A.multiply(B));
		scanner.close();
	}

}
