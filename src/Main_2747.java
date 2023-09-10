import java.util.Scanner;
public class Main_2747 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int a = 0;
		int b = 1;
		int c = 0;
		
		if(n==1) {
   			System.out.println(1);
   		}else {
   			for(int i=1; i<n; i++) {
   			c=a+b;
   			a=b;
   			b=c;
   		}
   		System.out.println(c);
   		}

	}

}
