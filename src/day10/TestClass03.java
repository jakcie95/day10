package day10;

public class TestClass03 {
	public int sumFunc(int num1, int num2) {
		int sum = num1 +num2;
		return sum;
	}
	
	public String test() {//return 을 쓸때 반환타입과 return값의 타입을 일치 시킨다
		System.out.println("test 호출");
		return "12345"; //호출한 지역으로 return
	}
}




