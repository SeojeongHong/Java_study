package ch04_prac;

public class Prac9 {
	public void prac9_mod() {
		String str = "12345";
		int sum = 0;
		int x;
		
		x = Integer.parseInt(str);
		
		do {
			sum += x % 10;
		} while ((x /= 10) != 0);
		
		System.out.println("sum=" + sum);
	}
	
	public void prac9() {
		String str = "12345";
		int sum = 0;
		
		for (int i = 0; i < str.length(); i++) {
			sum += str.charAt(i) - '0';
		}
		
		System.out.println("sum=" + sum);
	}
}
