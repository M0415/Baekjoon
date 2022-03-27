import java.util.Scanner;

public class Main_14681 {

	public static void main(String[] args) {
		
		int x, y;
		Scanner scanner = new Scanner(System.in);
		x = scanner.nextInt();
		y = scanner.nextInt();
		
		if(((x>=1)&&(x<=1000)) && ((y>=1)&&(y<=1000))) {
			System.out.println("1");
		} else if(((x>=1)&&(x<=1000)) && ((y>=-1000)&&(y<=-1))) {
			System.out.println("4");
		} else if(((x>=-1000)&&(x<=-1)) && ((y>=-1000)&&(y<=-1))) {
			System.out.println("3");
		} else if(((x>=-1000)&&(x<=-1)) && ((y>=1)&&(y<=1000))) {
			System.out.println("2");
		}
		scanner.close();
	}

}
