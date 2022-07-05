package ch04_prac;

public class Prac2 {
	public int prac2(int n) {
		int sum = 0;
		
		for (int i = 1; i <= n; i++) {
			if (!(i % 2 == 0 || i % 3 == 0)) {
				sum += i;
			}
		}
		
		return sum;
	}
}
