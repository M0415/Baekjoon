import java.util.Scanner;
public class Main_2443 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    int N = scanner.nextInt();
	    
	    for(int i = N; i>0; i--) {
	    	for(int z = N; z>i; z--) {
	    		System.out.print(" ");
	    	}
	    	for(int j = 0; j <2*i-1; j++) {
	    		System.out.print("*");
	    	}
	    	System.out.print("\n");
	    }

	}

}
