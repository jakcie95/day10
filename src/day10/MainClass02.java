package day10;

import java.util.Scanner;

public class MainClass02 {
public static void main(String[] args) {
	TestClass02 t01 = new TestClass02();
	int n = 1000;
	
	t01.test(1000, "�ȳ��ϼ���");//()���� ���� �޼ҵ��� �ƱԸ�Ʈ�� ���� ����
	
	Scanner sc = new Scanner(System.in);
	int num1, num2;
	System.out.println("�� �Է�");
	num1 = sc.nextInt();
	System.out.println("�� �Է�");
	num2 = sc.nextInt();
	
	t01.sumFunc(num1, num2);
}
}
