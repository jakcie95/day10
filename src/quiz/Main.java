package quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		Test01 :�̸��� �Է¹޾� ����ϴ� ���α׷��� ���弼��
		�Է±��, ��±��, ����
		*/
		Test01 t01 = new Test01();
		String n = t01.input();
		t01.print(n);
		/*
		 Test02 : �̸� 3���� �迭�� �Է¹޾� ����ϴ� ���α׷�
		 */
		Test02 t02 = new Test02();
		String[] str = t02.input();
		t02.print(str);
		/*
		 Test03 :�μ��� �Է¹޾� ���� ���
		 �Է�, ���, ����, ���� ������� ����ÿ�
		 - �迭 Ȱ��
		 return a,b,c;
		 */
		Test03 t03 = new Test03();
		int[] a = t03.input();
		int s = t03.sum(a);
		t03.print(a[0], a[1], s);
		
		//Test04 :�� ������ ArrayList�� ��ȯ
		Test04 t04 = new Test04();
		ArrayList arr = t04.input();
		int sum = t04.op(arr);
		t04.print(arr, sum);
		System.out.println(sum);
	}

}








