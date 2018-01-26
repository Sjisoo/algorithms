package BaekJoon;

import java.util.Scanner;

class Decreasing{
	int[][] array = new int[9][9];
	int column = 1;
	int hap = 9;
	int pre_hap;
	double answer = 0;

	public void initial(){
		array[0] = new int[]{1,1,1,1,1,1,1,1,1};
		array[1] = new int[]{1,2,3,4,5,6,7,8,9};

	}

	// column++ 시키고, column위치에 해당하는 array행에 값 채우기
	public synchronized void fill_row(){

		array[column][column-1] = 1;

		for (int i=column; i<9; i++){
			array[column][i] = array[column][i-1] + array[column-1][i-1];
		}
	}

	// 구해주는 식
	public int count(int input){
		int b = 0;

		if(column<0){
			return 0;
		}
		while(input>pre_hap){
			pre_hap = pre_hap + array[column][b];
			b++;
		}
		if(column == 0){
			b--;
		}
		if(column == 1 && (pre_hap - array[column][b-1])+1 == input){
			answer += Math.pow(10,column) * (b);
			return 0;
		}
		if (input == pre_hap){
			for(int c=column; c>=0; c--){
				answer += Math.pow(10,c) * (b);
				b--;
			}
			return 0;
		}
		pre_hap -= array[column][b-1];
		answer += Math.pow(10,column) * (b);
		column--;
		return count(input);
	}

	// hap 구하는 식
	public synchronized void sum(){
		pre_hap = hap;
		for (int k=0; k<9; k++){
			hap += array[column][k];
		}
	}

	public int run(int input){
		if(input > 1022){
			return -1;
		}
		if (input < 10){
			return input;
		}
		if (input > hap) {
			// 더하기 함수 실행
			fill_row();
			sum();
			column++;
			if(hap > 1021){
				return -1;
			}
			if (column > 9){
				return -1;
			}
			return run(input);
		}
		else {
			// 구해주는 식
			column--;
			count(input);
		}
		return (int)answer;
	}

}

public class Decreasing_1038 {

	public static void main(String[] args) {
		int input;
		Scanner scan = new Scanner(System.in);
		input = scan.nextInt();
		Decreasing dc = new Decreasing();
		dc.initial();
		String ans = "9876543210";
		if(input == 1022){
			System.out.println(ans);

		}else{
			System.out.print(dc.run(input));
		}
	}
}
