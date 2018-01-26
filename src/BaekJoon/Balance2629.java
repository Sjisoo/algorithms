package BaekJoon;

import java.util.Scanner;

public class Balance2629 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int chu = scan.nextInt();
		int[] chu_wgt = new int[chu];
		for(int i=0; i<chu; i++) {
			chu_wgt[i] = scan.nextInt();
		}
		int gs = scan.nextInt();
		int[] gs_wgt = new int[gs];
		for(int i=0; i<gs; i++) {
			gs_wgt[i] = scan.nextInt();
		}
		System.out.println(balance(chu, chu_wgt, gs, gs_wgt));
		
	}
	public static int balance(int c, int[] c_w, int g, int[] g_w){
		
		return 0;
	}
}
