package asterisks;
import java.util.Scanner;

public class Asterisks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many asterisks do you want?");
		int x = sc.nextInt();
		for (int i = 0; i <= x ; i++) {
			for (int a = 0 ; a < i ; a++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
