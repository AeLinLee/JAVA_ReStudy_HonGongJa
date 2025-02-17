package chap02;

public class Sec01_04_VariableScopeExample {

	public static void main(String[] args) {
		
		// 변수는 자신이 선언된 위치에서 자신이 속한 블록 내부까지만 사용이 가능하고 밖에서는 사용할 수 없다.
		
		int v1 = 15;
		
		if(v1>10) {
			int v2;
			v2 = v1 - 10;
			System.out.println(v2);
		}
		
	//	int v3 = v1 + v2 + 5;  //v2는 if블록 안에서 생성되어진 로컬변수이기에 해당 블록 외부에서 사용 불가능. 컴파일 에러.
		
	}

}
