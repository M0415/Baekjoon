import java.math.BigInteger; //Integer���� ����ϰ� �Ǹ� 1000�ڸ��� �޾Ƶ��� �� ���� ����Ѵ�
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
