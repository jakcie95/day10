package day10;

import java.util.Scanner;

public class MainClass02 {
public static void main(String[] args) {
	TestClass02 t01 = new TestClass02();
	int n = 1000;
	
	t01.test(1000, "안녕하세요");//()안의 값은 메소드의 아규먼트에 값을 보냄
	
	Scanner sc = new Scanner(System.in);
	int num1, num2;
	System.out.println("수 입력");
	num1 = sc.nextInt();
	System.out.println("수 입력");
	num2 = sc.nextInt();
	
	t01.sumFunc(num1, num2);
}
}
