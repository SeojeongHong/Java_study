// ScannerEx.java

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("두자리 정수를 하나 입력해주세요.>");
		String input = scanner.nextLine();
		
		//입력받은 문자열을 숫자로 변환
		int num = Integer.parseInt(input);
		
		System.out.println("입력 내용 "+input);
		System.out.printf("num = %d%n", num);

	
	}

}

/*출력
두자리 정수를 하나 입력해주세요.>17
입력 내용 17
num = 17
*/
 
