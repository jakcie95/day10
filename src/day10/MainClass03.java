package day10;

import java.util.Scanner;

public class MainClass03 {
	public static void main(String[] args) {
		TestClass03 t01 = new TestClass03();
			
		String s =t01.test();
		System.out.println("리턴 : "+s);
		
		
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		System.out.println("수 입력");
		num1 = sc.nextInt();
		System.out.println("수 입력");
		num2 = sc.nextInt();
		
		int ss = t01.sumFunc(num1, num2);
		System.out.println("두 수의 합 : " + ss);
	}
}

