package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

class Dice{
    short[] arr = new short[3];
    short one;
    int two;
    int three;
    long answer;
    public long run(int width, short[] dice_num){
        // 0,5
        // 1,4
        // 2,3
        // 번째 각각 find min value
        short min1 = find_min(dice_num[0], dice_num[5]);
        short min2 = find_min(dice_num[1], dice_num[4]);
        short min3 = find_min(dice_num[2], dice_num[3]);

        // min 3가지 배열에 넣고 순서대로 정렬!
        // 작은 값 필요 개수만큼 찾아내기 (1,2,3)
        sorting(min1, min2, min3);

        // 수식
        // 조건문 있어야 함 (1,2의 경우)
        if(width == 1){
            Arrays.sort(dice_num);
            for(int i=0; i<5; i++){
                answer += dice_num[i];
            }
            return answer;
        }
        equation(width);
        return answer;
    }

    public short find_min(short a, short b){
        if(a<=b){
            return a;
        }
        return b;
    }

    public synchronized void sorting(short min1, short min2, short min3){
        arr[0] = min1;
        arr[1] = min2;
        arr[2] = min3;
        Arrays.sort(arr);
        one = arr[0];
        two = arr[0] + arr[1];
        three = arr[0] + arr[1] + arr[2];
    }

    public synchronized void equation(int width){
        answer = (long)((three * 4) + (two * (8 * Math.pow(width-2,2) + 4)) + (one * ((5 * Math.pow(width-2,2)) + (width-2) * 4)));
    }
}

public class Dice_1041 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int width = scan.nextInt();
        short[] num_array = new short[6];
        for(int i=0; i<6; i++){
            num_array[i] = scan.nextShort();
        }

        Dice dice = new Dice();
        System.out.println(dice.run(width,new short[]{1, 2, 3, 4, 5, 6}));
    }
}
