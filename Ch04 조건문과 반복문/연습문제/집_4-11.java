package ch04_prac;

public class Prac11 {
	public void prac11() {
		int num1 = 1;
		int num2 = 1;
		int num3 = 0;
		
		System.out.print(num1 + ", " + num2);
		
		for (int i = 0; i < 8; i++) {
			num3 = num1 + num2;
			num2 = num1;
			num1 = num3;
			System.out.print(", " + num1);
		}
		System.out.println();
	}
}
