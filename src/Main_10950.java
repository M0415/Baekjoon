import java.util.Scanner;
public class Main_10950
{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int  number= scanner.nextInt(); // ���̽� ����
		int arr[] = new int[number];
		
		for(int i=0; i<number;i++) {
			int  A= scanner.nextInt(); // ���� A
			int  B= scanner.nextInt(); // ���� B
			arr[i] = A + B;
			
			
		}
		for(int i=0; i<number;i++) {
		System.out.printf("%d\n",arr[i]);
		}
	}

}
