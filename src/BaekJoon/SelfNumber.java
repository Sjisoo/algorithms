package BaekJoon;

public class SelfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(numsp(1));
	}
	public static int numsp(int a){
		int sum=a;
	      while(a!=0){
	         sum+=a%10;
	         a/=10;
	      }
	      return sum;
	}

}
