package quiz;
import java.util.ArrayList;
import java.util.Scanner;

public class Test04 {
public ArrayList input() {
	Scanner sc = new Scanner(System.in);
	ArrayList arr = new ArrayList();
	
	int value;
	System.out.println("수 입력");
	value = sc.nextInt();
	arr.add(value);
	
	System.out.println("수 입력");
	arr.add(sc.nextInt());
	return arr;
	
}
public int op(ArrayList arr) {
	int sum = (int)arr.get(0) + (int)arr.get(1);
	return sum;
}
public void print(ArrayList arr, int s) {
	System.out.println(
			arr.get(0) + "+"+arr.get(1) + "="+s);
}

}
