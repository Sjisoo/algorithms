package BaekJoon;

import java.util.Scanner;

public class Beehouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count = 1;
		if (n == 1)
			System.out.println(1);
		else {
			n = n - 1;
			while (n > 6 * count) {
				n = n - 6 * count;
				count++;
			}
		}
		System.out.println(count + 1);
	}
}
