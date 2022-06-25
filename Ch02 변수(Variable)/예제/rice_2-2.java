
// 두 변수의 값 교환하기 

public static void main(String[] args) {
		// TODO Auto-generated method stub
	int x = 4, y=2;
	int tmp;
	
	tmp = x; // 1. x의 값 tmp에 저장
	x = y;  //2. y의 값 x에 저장
	y = tmp; //3. tmp 값 y에 저장
	
	System.out.println("x="+x);
	System.out.println("y="+y);
	}


/*
x=2
y=4
*/
