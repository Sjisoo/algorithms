package BaekJoon;

public class RandomNumberGenerator_1160 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(jeomhwa(11,8,7,1,5,3));
	}
	public static int count=0;
	public static int jeomhwa(int m, int a, int c, int X, int n, int g) {
		int answer = 0;
//		System.out.println(count);
		if(count==n) {
			answer = X%g;
			return answer;
		}
		X = (a*X + c)%m;
		count++;
		return jeomhwa(m,a,c,X,n,g);
	}

}
