package BaekJoon;

import java.util.Scanner;

public class Findmaxmin {
	public static void main(String[] args){
		Scanner scannum  = new Scanner(System.in);
		int num = scannum.nextInt();
		int[] arr = new int[num];
		for(int i=1; i<num+1; i++){
			System.out.print("Give integer " + i + " : ");
			Scanner scan  = new Scanner(System.in);
			arr[i-1] = scan.nextInt();
		}
		System.out.println("max : " + max(arr,num));
		System.out.println("min : " + min(arr,num));
		
	}

	public static int max(int arr[],int n){
		int temp;
		temp = arr[0];
		for(int j=1; j<n; j++){
			if(temp<arr[j]){
				temp=arr[j];
			}
		}
		
		return temp;
	}
	public static int min(int arr[],int n){
		int temp2;
		temp2 = arr[0];
		for(int j=1; j<n; j++){
			if(temp2>arr[j]){
				temp2=arr[j];
			}
		}
		
		return temp2;
	}
	
//	public int getArray() {
//	    return arr;
//	  }
//	  public void setArray(int arr) {
//	    this.arr = arr;
//	  }


	
}
