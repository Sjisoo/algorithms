package BaekJoon;

import java.util.Scanner;

public class Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		int N = scan1.nextInt();
		int K = scan2.nextInt();
		System.out.println(combination(N,K));
	}
	public static double combination(double n, double k){
		if(k==0) return 1;
		return n/k*combination(n-1,k-1);
	}

}
