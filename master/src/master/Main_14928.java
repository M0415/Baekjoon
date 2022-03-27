import java.util.Scanner;
public class Main_14928 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String N = scanner.nextLine();
		
		long result = 0;
		for(int i =0; i < N.length(); i++)
		{
			result = (result * 10 + (N.charAt(i) - '0')) % 20000303;
			}
		System.out.print(result);
		scanner.close();

	}

}

/*import java.util.Scanner; 시간초과로 인해 실패
import java.math.BigInteger;
public class Main_14928 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BigInteger N = scanner.nextBigInteger();
				
		N = N.remainder(BigInteger.valueOf(20000303));
		System.out.print(N);
		scanner.close();

	}

}*/