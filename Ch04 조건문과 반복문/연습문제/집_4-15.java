package ch04_prac;

public class Prac15 {
	public void prac15() {
		int number = 12321;
		int tmp = number;
		
		int result = 0; // palindrome 담을 변수
		
		while (tmp != 0) {
			String tmp_s = "" + tmp;
			result += (tmp % 10) * Math.pow(10, tmp_s.length() - 1);
			tmp /= 10;
		}
		
		if (result == number) {
			System.out.println(number + "is a palindrome");
		} else {
			System.out.println(number + " is not a palindrome");
		}
	}
}
