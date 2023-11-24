package week1.week1assignments;

public class IsPrimeNumber {

	public static void main(String[] args) {
		int n = 2;
		int i;
		int flag = 0;
		if ((n==0) || (n==1)){
			flag = 1;
		}
		
		for (i = 2; i <= n/2; i++) {
			if ((n%i) == 0) {
				flag = 1;
				break;
			}
		}
		
		if (flag==0) {
				System.out.println("The number " + n +" is a Prime number");
		}else {
			System.out.println("The number " + n + " is not a Prime number");
		}
	}

}
