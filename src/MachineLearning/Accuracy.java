package MachineLearning;

public class Accuracy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] ConfusionM = {{634,138,106,370},
					  	  {1750,671,351,1266},
					  	  {1869,500,661,1439},
					  	  {122,28,29,146}};
		int index = 1;
			
		System.out.printf("%.3f", accuracy(ConfusionM,index));
		System.out.println("%");

	}
	
	public static double accuracy(int[][] matrix, int index) {
		int sum = 0;
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[1].length; j++) {
				sum += matrix[i][j];
			}
		}
		
		
		int TP = matrix[index-1][index-1];
		int TN = 0;
		
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[1].length; j++) {
				if(j==index-1 || i==index-1) ;
				else {
					TN += matrix[i][j];
				}
			}
		}
		
		double accuracy = ((double)(TP+TN)/(double)(sum))*100;
		
		return accuracy;
	}

}
