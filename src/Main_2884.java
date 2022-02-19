import java.util.Scanner;
public class Main_2884 {

	public static void main(String[] args) {
		int H, M;
		
		Scanner scanner = new Scanner(System.in);
		H = scanner.nextInt();
		M = scanner.nextInt();
		
		if(M<45) {
			H--;
			M = (M-45);
			if(M<0) {
				M = (60+M);}
				if(H<0) {
					H =(24+H);
				}
			
		}else if(M>=45){
			M=(M-45);
		}
		System.out.printf("%d %d",H,M);

	}

}
