package BaekJoon;

import java.util.Scanner;

public class Bunsu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count = 1;
		int answer;
		int up = 0;
		int down = 0;
		while (n - count > 0) {
			n = n - count;
			count++;
			if (count % 2 == 0) {
				up = n;
				down = count + 1 - n;
			} else {
				down = n;
				up = count + 1 - n;
			}
		}
		System.out.println(up + "/" + down);
	}
}
