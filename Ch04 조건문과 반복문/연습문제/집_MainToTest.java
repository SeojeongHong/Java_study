package ch04_prac;

public class Main {

	public static void main(String[] args) {
		Prac2 test2 = new Prac2();
		Prac3 test3 = new Prac3();
		Prac4 test4 = new Prac4();
		Prac5 test5 = new Prac5();
		Prac9 test9 = new Prac9();
		Prac11 test11 = new Prac11();
		Prac15 test15 = new Prac15();
		
		System.out.println("Question2------------------------------------");
		System.out.println(test2.prac2(20));
		System.out.println("Question3------------------------------------");
		System.out.println(test3.prac3(10));
		System.out.println("Question4------------------------------------");
		test4.prac4();
		System.out.println("Question5------------------------------------");
		test5.prac5();
		System.out.println("Question9------------------------------------");
		test9.prac9_mod();
		test9.prac9();
		System.out.println("Question11------------------------------------");
		test11.prac11();
		System.out.println("Question15------------------------------------");
		test15.prac15();
	}

}
