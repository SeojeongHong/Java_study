package ch04_prac;

public class Prac4 {
	public void prac4() {
		int i = 0;
		int j = 0;
		
		while (i <= 10) {
			j = 0;
			while (j <= i) {
				System.out.print("*");
				j++;
			}
			i++;
		}
	}
}
