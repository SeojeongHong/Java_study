// VarEx2.java
// 두 변수의 값 교환
public class Main {

	public static void main(String[] args) {
		int x=10, y=20;
		int tmp=0;
		
		System.out.println("x: "+x+" y:"+y);
		
		tmp=x;
		x=y;
		y=tmp;
		
		System.out.println("x: "+x+" y:"+y);
	}

}

/*출력
x: 10 y:20
x: 20 y:10
*/
 
