package BaekJoon;

import java.util.ArrayList;

public class Baekseol_2309 {

	public static void main(String[] args) {
		int[] height = {20,7,23,19,10,15,25,8,13};
		boolean[] visited = {false,false,false,false,false,false,false,false,false};
			System.out.println(nanjang(height,visited,0,0,0));
	}
	public static ArrayList nanjang(int[] nop, boolean[] path, int sum, int loc, int count){
		ArrayList list = new ArrayList();
		if(count==7){
			if(sum==100){
			}
			else{
//				if(loc==)
			}
		}
		
		for(int i=0; i<9; i++){
			if(path[i]==false){
				sum = sum + nop[i];
				path[i]=true;
				count++; 
				loc = i;
				loc++;
				return nanjang(nop, path, loc, sum, count);
			}
		}
		return list;
	}
}
