package BaekJoon;

import java.util.Scanner;

public class EasyDP_10844 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int ar1 = 1;
		int[] ar2 = {2,2,2,2,2,2,2,2,1};
		if(num==1) System.out.println(9);
		if(num==2) System.out.println(17);
		if(num>2) System.out.println(easydp(num,ar1,ar2));
	}
	
	public static long easydp(int n, int arr1, int[] arr2){
		long answer=0;
		int temp1[] = new int[9];
		
		if(n==3){
			answer  = arr1 + arr2[1];
			for(int j=1; j<8; j++){
				answer += arr2[j-1] + arr2[j+1];
			}
			answer += arr2[7];
			answer = answer%1000000000;
			return answer;
		}
		
		temp1[0] = (arr1 + arr2[1])%1000000000;
		for(int i=1; i<8; i++){
			temp1[i] = (arr2[i-1] + arr2[i+1])%1000000000;
		}
		temp1[8] = arr2[7];
		arr1 = arr2[0];
		arr2 = temp1;
		
		return easydp(n-1,arr1,arr2);
	}

}
