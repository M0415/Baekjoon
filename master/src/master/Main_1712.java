import java.util.Scanner;
public class Main_1712 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cost1 = scanner.nextInt();			
		int cost2 = scanner.nextInt();
		int cost3 = scanner.nextInt();
		
		if(cost2 >= cost3) {
			System.out.print("-1");
		} else if(cost2<cost3) {
			System.out.print(cost1/(cost3-cost2)+1);
		}
		
		scanner.close();	
	}

}
