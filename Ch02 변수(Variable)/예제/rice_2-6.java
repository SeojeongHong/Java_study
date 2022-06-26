import java.util.*; // Scanner를 사용하기 위해 추가

public class ScanfEx1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("두자리 정수를 하나 입력해주세요.>");
		String input = scanner.nextLine();
		int num = Integer.parseInt(input); // 입력받은 문자열을 숫자로 변환
		
		System.out.println("입력내용 :"+input);
		System.out.printf("num=%d%n", num);
	}

}

/* 결과
두자리 정수를 하나 입력해주세요.>22
입력내용 :22
num=22
*/

/*
입력할때 공백 입력 안하게 주의!! 오류남
이유 : Integer.parseInt() 이게 입력받은 문자열-> 숫자 로 변환 하는거라서
	숫자만 입력가능! 문자 나 기호 넣으면 오류 (공백 포함)
*/
