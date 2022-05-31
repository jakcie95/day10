package day10;

public class Random {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			int ran = (int)(Math.random()*3)+10;
			System.out.println(ran);
			
		}
	// 로또 프로그램 만들기
	// 랜덤한 숫자 1~45까지의 숫자중 중복되지 않는 6개의 숫자
		System.out.println("이번주 로또 번호");
		for(int r =0; r < 6; r++) {
			int lotto = (int)(Math.random()*45);
			System.out.println(lotto);
		}

	}

}
