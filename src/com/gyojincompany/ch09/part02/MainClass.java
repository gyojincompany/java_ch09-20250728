package com.gyojincompany.ch09.part02;



public class MainClass {
	public static void operate(Calculator cal) { // 임시객체가 인수값으로 들어옴
		System.out.print("연산결과 : " + cal.add(10, 20));
	}
	
	public static void main(String[] args) {
		
		//인터페이스를 구현한 익명 객체 예제
		//Greeting greeting = new Greeting(); //인터페이스는 인스턴스 생성 불가!
		Greeting greeting = new Greeting() {
			
			@Override
			public void sayHi() {
				// TODO Auto-generated method stub
				System.out.println("안녕! 하이!");
			}
		};
		
		greeting.sayHi();
		
		System.out.println("==========================");
		
		// 추상클래스를 상속한 익명 객체
		Animal animal = new Animal() {
			
			@Override
			void sound() {
				// TODO Auto-generated method stub
				System.out.println("멍멍");
			}
			
			@Override
			void run() {
				// TODO Auto-generated method stub
				System.out.println("깡총 깡총");
				
			}
		};
		
		animal.sound();
		animal.run();
		
		System.out.println("==========================");
		
		// 메서드의 매개변수로 익명 객체 전달
		
		operate(new Calculator() {
			
			@Override
			public int add(int a, int b) {
				// TODO Auto-generated method stub
				return a+b; //a와 b의 합을 반환하도록 오버라이딩
			}
		}); //Calculator로 만든 객체만 인수로 넣을 수 있음! -> 불가(인터페이스) -> 익명객체사용
		
	}
}
