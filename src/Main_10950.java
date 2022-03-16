import java.util.Scanner;
public class Main_10950
{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int  number= scanner.nextInt(); // 케이스 개수
		int arr[] = new int[number];
		
		for(int i=0; i<number;i++) {
			int  A= scanner.nextInt(); // 정수 A
			int  B= scanner.nextInt(); // 정수 B
			arr[i] = A + B;
			
			
		}
		for(int i=0; i<number;i++) {
		System.out.printf("%d\n",arr[i]);
		}
	}

}
