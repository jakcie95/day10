package day10;

public class TestClass04 {
	//�޼ҵ��� �̸��� ������� �Ű������� ���� �ٸ��� ����
	public void sumFunc(int a, int b) {
		System.out.println("int, int");
		System.out.println(a+b);
	}
	public void sumFunc(int a) {
		System.out.println("a�� : "+a);
	}
	public void sumFunc(int a, double b) {
		System.out.println("int, double");
		System.out.println(a+b);
	}
}
