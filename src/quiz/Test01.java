package quiz;

import java.util.Scanner;

public class Test01 {
	public String input(){
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("�̸� �Է� : ");
		name =sc.next();
		return name;

	}
	public void print(String name) {
		System.out.println("����� �̸��� " + name);
	}

}
