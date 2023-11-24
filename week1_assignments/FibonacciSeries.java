package week1.week1assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n =10;
		int[] fibSeries = new int[n]; 
		 fibSeries[0] = 0;
		 fibSeries[1] = 1;
		 
		 for (int i = 2; i < fibSeries.length; i++) {
			 fibSeries[i] = fibSeries[i-1] + fibSeries[i-2];
		 }
		 
		 for (int i = 0; i < fibSeries.length; i++) {
			System.out.print(fibSeries[i] + " ");
		}

	}

}
