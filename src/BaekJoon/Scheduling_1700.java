package BaekJoon;

import java.util.Scanner;

public class Scheduling_1700 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		byte n = scan.nextByte();
		byte k = scan.nextByte();
		Byte[] arr = new Byte[k];
		for(int i=0; i<k; i++){
			arr[i] = scan.nextByte();
		}
		Byte[] ans = new Byte[n];
		for(int j=0; j<n; j++){
			ans[j] = arr[j];
		}
		System.out.println(sched(n,k,arr,ans));
	}
	public static int sched(Byte n, Byte k, Byte[] arr, Byte[] ans){
		return 0;
	}

}
