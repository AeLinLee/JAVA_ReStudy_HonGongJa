package chap02;

public class Sec01_01_VariableInitializationExample {

	public static void main(String[] args) {
		
		//변수 선언
		
		//int value;  초기화를 안하고 변수 선언만 된 변수를 사용할 경우 컴파일 에러가 발생.
		int value = 30;  //변수 선언 및 초기값 저장 즉, 초기화 작업을 해야 해당 변수가 생성되는 것이다. 
	
		
		//변수 value값을 읽고 10을 더하는 산술 연산을 수행
		//연산의 결과값을 변수 result의 초기값으로 저장
		int result = value + 10;
		
		//변수 result값을 읽고 콘솔에 출력
		System.out.println(result);

	}

}
