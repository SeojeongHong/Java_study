package ch04_prac;

public class Prac5 {
	public void prac5_random() {
		int x, y;
		
		x = (int) (Math.random() * 6) + 1;
		y = (int) (Math.random() * 6) + 1;
		
		if (x + y == 6) {
			System.out.println("(" + x + ", " + y + ")");
		}
	}
	
	public void prac5() {
		for (int x = 1; x <= 6; x++) {
			for (int y = 1; y <= 6; y++) {
				if (x + y == 6) {
					System.out.println("(" + x + ", " + y + ")");
				}
			}
		}
	}
}
