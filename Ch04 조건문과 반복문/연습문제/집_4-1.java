package ch04_prac;

public class Prac1 {
	public boolean prac1(int x, char ch, int year, boolean powerOn, String str) {
		
		// 1.
		if (x > 10 && x < 20) 
			return true;
		
		// 2.
		if (ch != ' ' || ch != '\t') 
			return true;
		
		// 3.
		if (ch == 'x' || ch == 'X')
			return true;

		// 4.
		if (ch >= '0' && ch <= '9')
			return true;
	
		// 5.
		if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
			return true;
		
		// 6.
		if ((year % 4 == 0) || (year % 4 == 0 && year % 100 != 0))
			return true;
		
		// 7.
		if (!powerOn)
			return true;
		
		// 8.
		if (str.equals("yes"))
			return true;
		
		
		return false;
	}
}
