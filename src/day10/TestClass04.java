package day10;

public class TestClass04 {
	//메소드의 이름이 같은경우 매개변수에 따라 다르게 구분
	public void sumFunc(int a, int b) {
		System.out.println("int, int");
		System.out.println(a+b);
	}
	public void sumFunc(int a) {
		System.out.println("a값 : "+a);
	}
	public void sumFunc(int a, double b) {
		System.out.println("int, double");
		System.out.println(a+b);
	}
}
