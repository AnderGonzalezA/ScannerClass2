import java.util.Scanner;
public class Summing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		int x = 0;
		while (n<100) {
			System.out.print("Enter a number please");
			Scanner m = new Scanner(System.in);
			x = m.nextInt();
			n = n + x;
		}
		System.out.print("The sum of your numbers is already higher than 100");
	}

}
