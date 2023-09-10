import java.util.Scanner;
public class Main_2741 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int arr[] = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = i+1;
			System.out.println(arr[i]);
		}

	}

}
