package BaekJoon;

public class RobotOrder_2131 {

	public static void main(String[] args) {
		int[] input = {1,1,2,1,0,3,0,1};
		System.out.println(lessen_order(input,-1,1));

	}
	public static int lessen_order(int[] order, int count,int answer) {
		count++;
		if(count==order.length) return answer;
		
		if(order[count]==2 || order[count]==3) {
			if(order[count+1]==1) {
				answer++;
				return lessen_order(order,count,answer);
			}
		}
		
		if(order[count]==0) {
			answer++;
			return lessen_order(order,count,answer);
		}
		
		return lessen_order(order,count,answer);
	}

}
