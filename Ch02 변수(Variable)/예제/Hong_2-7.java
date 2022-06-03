// CharToCode.java

public class Main {

	public static void main(String[] args) {
		char ch='A';
		//char -> int
		int code=(int)ch;
		
		//문자 - 코드 - 유니코드
		System.out.printf("%c = %d (%#X)%n", ch, code,code);
	
		char hch = '가';
		System.out.printf("%c = %d (%#X)%n", hch, (int)hch, (int)hch);
	}

}

/*출력
A = 65 (0X41)
가 = 44032 (0XAC00)
*/
 
