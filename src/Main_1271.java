import java.util.Scanner;
import java.math.BigInteger; // integer ������ ���߱� ���� ����
public class Main_1271 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BigInteger n = scanner.nextBigInteger();  // ���� integer ���� ū ����
	    BigInteger m = scanner.nextBigInteger();
		
		BigInteger first = n.divide(m);   // ������
		BigInteger second = n.remainder(m);  // ������
		
		System.out.println(first);
		System.out.println(second);
		scanner.close();

	}

}
