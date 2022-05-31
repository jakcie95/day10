package quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		Test01 :이름을 입력받아 출력하는 프로그램을 만드세요
		입력기능, 출력기능, 메인
		*/
		Test01 t01 = new Test01();
		String n = t01.input();
		t01.print(n);
		/*
		 Test02 : 이름 3개를 배열로 입력받아 출력하는 프로그램
		 */
		Test02 t02 = new Test02();
		String[] str = t02.input();
		t02.print(str);
		/*
		 Test03 :두수를 입력받아 합을 출력
		 입력, 출력, 연산, 메인 기능으로 만드시오
		 - 배열 활용
		 return a,b,c;
		 */
		Test03 t03 = new Test03();
		int[] a = t03.input();
		int s = t03.sum(a);
		t03.print(a[0], a[1], s);
		
		//Test04 :위 문제를 ArrayList로 변환
		Test04 t04 = new Test04();
		ArrayList arr = t04.input();
		int sum = t04.op(arr);
		t04.print(arr, sum);
		System.out.println(sum);
	}

}








