package BaekJoon;

import java.util.Scanner;

public class RandomNG_1160 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		float m = scan.nextFloat();
		float a = scan.nextFloat();
		float c = scan.nextFloat();
		float x = scan.nextFloat();
		float n = scan.nextFloat();
		float g = scan.nextFloat();
		
		double an = Math.pow(a, n);
		float answer = (((float)(an)*x + c*((float)(an)-1)/(a-1))%m)%g;
		
		
//		String[] str = scan.nextLine().split(" ");
//		for(int i=0;i<str.length;i++) {
//			
//		}
//		int m = Integer.parseInt(str[0]);
//		System.out.println(rng(ln0,ln1,ln2,ln3,ln4,ln5));
		
//		while(n>0){
//			x = (short)((a*x+c)%m);
//			n--;
//		}
//		System.out.println(x%g);

	}
	
//	public static int rng(long m, long a, long c, long x, long n, int g){
//		x = (a*x+c)%m;
//		n--;
//		if(n==0)return (int)(x%g);
//		
//		return rng(m,a,c,x,n,g);
//	}
//	public static Long unsigned(String value){
//		Long ln = Long.parseUnsignedLong(value);
//        //do something with l
//		return ln;
//	}
}
