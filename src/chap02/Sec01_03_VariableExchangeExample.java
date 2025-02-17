package chap02;

public class Sec01_03_VariableExchangeExample {

	public static void main(String[] args) {
		
		int x = 3;
		int y = 5;
		System.out.println("x:"+x +", "+ "y:"+y);
		
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x:"+x +", "+ "y:"+y);  //변수는 또다른 변수에 대입하여 값을 복사할 수 있다.
		
	}

}
