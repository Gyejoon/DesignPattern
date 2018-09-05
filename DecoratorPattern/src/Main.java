import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 기존 처럼 객체 생성.
		Beverage beverage = new Base();
		boolean done = false;
		
		while(!done) {
			// 초기에는 Base 객체의 구현 부분이 실행됨. 즉, 0이 출력
			System.out.println("음료 현재 가격 : " + beverage.getTotalPrice());
			System.out.println("선택 : 1: 샷 추가 / 2: 우유 추가");
			
			// 선택 이후 부터는 데코레이터 구현부가 메모리에 할당된다.
			switch(sc.nextInt()) {
				case 0: 
					done = true;
					break;
				case 1: 
					// 에스프레스 샷 추가
					beverage = new Espresso(beverage);
					break;
				case 2:
					// 우유 추가
					beverage = new Milk(beverage);
					break;
			}
		}
		
		System.out.println("음료 가격 : " + beverage.getTotalPrice());
		sc.close();
	}
	
}
