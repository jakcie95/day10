package quiz;

import java.util.Scanner;

public class Test02 {
public String[] input() {
	Scanner sc = new Scanner(System.in);
	String[] nameArr = new String[3]; //���� 3 �迭 ����
	for(int i = 0; i<nameArr.length; i++) {
		System.out.println(i+".�̸� �Է�");
		nameArr[i] = sc.next();
	}	
	return nameArr;
}
	
public void print(String[] nameArr) {
	System.out.println("====�̸� ��� ====");
	for(int i=0; i<nameArr.length; i++) {
		System.out.println(i+"."+nameArr[i]);
}
}
}