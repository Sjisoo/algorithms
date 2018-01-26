package BaekJoon;

import java.util.ArrayList;
import java.util.Scanner;

public class DescPath_1520 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		int j = scan.nextInt();
		int[][] arr = new int[i][j];
		for(int a=0; a<i; a++){
			for(int b=0; b<j; b++){
				arr[a][b] = scan.nextInt();
			}
		}
		ArrayList list = new ArrayList();
		System.out.println(path(arr,0,0,list));
	}
	
	public static int path(int[][] ar, int i, int j, ArrayList count){
		if(i==ar.length-1 && j==ar[0].length-1){
			count.add("1");
		}
		if(j<ar[0].length-1 && ar[i][j]>ar[i][j+1]){
			path(ar,i,j+1,count);
			System.out.println("1");
		}
		if(i<ar.length-1 && ar[i][j]>ar[i+1][j]){
			path(ar,i+1,j,count);
			System.out.println("2");
		}
		if(j>0 && ar[i][j]>ar[i][j-1]){
			path(ar,i,j-1,count);
			System.out.println("3");
		}
		return count.size();
	}

}
