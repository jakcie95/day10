package day10;

public class Random {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			int ran = (int)(Math.random()*3)+10;
			System.out.println(ran);
			
		}
	// �ζ� ���α׷� �����
	// ������ ���� 1~45������ ������ �ߺ����� �ʴ� 6���� ����
		System.out.println("�̹��� �ζ� ��ȣ");
		for(int r =0; r < 6; r++) {
			int lotto = (int)(Math.random()*45);
			System.out.println(lotto);
		}

	}

}
