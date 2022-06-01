package quiz;

import java.util.Scanner;

public class Test03 {
public int[] input() {
	Scanner sc = new Scanner(System.in);
	int[] arr = new int[2];
	System.out.println("수 입력 : ");
	arr[0] = sc.nextInt();
	System.out.println("수 입력 : ");
	arr[1]= sc.nextInt();
	return arr;
}
public int sum(int[] a) {
	return a[0] +a[1]; //정수형태
	
}
public void print(int a, int b, int c) {
	System.out.println(a+ "+" +b+ "=" +c);
}

}
