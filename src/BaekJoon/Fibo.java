package BaekJoon;

import java.util.Scanner;

public class Fibo {

	static int cache0[];
	static int cache1[];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int[]arr=new int[num];
		cache0=new int[41];
		cache1=new int[41];
		for(int i=0;i<cache0.length;i++){
			cache0[i]=cache1[i]=-1;
		}
		
		for(int i=0; i<num; i++){
			arr[i] = scan.nextInt();
		}
		for(int i=0; i<num; i++){
			System.out.print(fibo0(arr[i]) + " ");
			System.out.println(fibo1(arr[i]));
		}
		
		

	}
	public static int fibo0(int n){
		if(cache0[n]!=-1)
			return cache0[n];
		if(n==0)
			return 1;
		else if(n==1)
			return 0;
		else
			return cache0[n]=fibo0(n-1)+fibo0(n-2);
	}
	public static int fibo1(int m){
		if(cache1[m]!=-1)
			return cache1[m];
		if(m==0)
			return 0;
		else if(m==1)
			return 1;
		else
			return cache1[m]=fibo1(m-1)+fibo1(m-2);
	}
}
