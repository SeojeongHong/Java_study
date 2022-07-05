package ch04_prac;

public class Prac3 {
	public int prac3(int n) {
		int total = 0;
		int sum = 0;
		
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= i; j++) {
				sum += j;
			}
			total += sum;
		}
		
		return total;
	}
}
