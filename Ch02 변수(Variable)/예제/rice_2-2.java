
// 두 변수의 값 교환하기 

public static void main(String[] args) {
		// TODO Auto-generated method stub
	int x = 4, y=2;
	int tmp;
	
	tmp = x; // 1. x의 값 tmp에 저장
	x = y;
	y = tmp;
	
	System.out.println("x="+x);
	System.out.println("y="+y);
	}


/*
x=2
y=4
*/
