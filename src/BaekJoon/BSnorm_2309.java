package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class BSnorm_2309 {

	public static void main(String[] args) {
		int[] height = new int[9];
		Scanner scan = new Scanner(System.in);
		for(int k=0; k<9; k++){
			height[k] = scan.nextInt();
		}
		
		
		int[] answer = new int[7];
		int num = 0;
		
		int[] arr = (nanjang(hap(height),height,0,1));
		Arrays.sort(arr);
		
		for(int i : arr) {
			if(i != 0){
				System.out.println(i);
			}
		}
		// for each��
		
	}
	
	public static int hap(int[] nop){
		int sum = 0;
		for(int i=0; i<9; i++){
			sum += nop[i];
		}
		return sum;
	}
	public static int[] nanjang(int sum, int[] nop, int i, int j){
		if(i==8) return null;
		if(j==9){
			i++;
			j = i + 1;
			return nanjang(sum,nop,i,j);
		}
		sum = sum - nop[i];
		sum = sum - nop[j];
		if(sum==100){
			nop[i] = 0;
			nop[j] = 0;
			return nop;
		}
		else{
			sum = sum + nop[i] + nop[j];
		}
		j++;
		return nanjang(sum,nop,i,j);
	}
}
