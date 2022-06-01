package quiz;

import java.util.Scanner;

public class Test02 {
public String[] input() {
	Scanner sc = new Scanner(System.in);
	String[] nameArr = new String[3]; //길이 3 배열 생성
	for(int i = 0; i<nameArr.length; i++) {
		System.out.println(i+".이름 입력");
		nameArr[i] = sc.next();
	}	
	return nameArr;
}
	
public void print(String[] nameArr) {
	System.out.println("====이름 출력 ====");
	for(int i=0; i<nameArr.length; i++) {
		System.out.println(i+"."+nameArr[i]);
}
}
}
