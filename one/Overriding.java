package com.one;
class Weapon{
	protected int fire( ) {
		return 1;
	}
}
class Cannon extends Weapon{
	protected int fire( ) {
		return 10;
	}
}

public class Overriding {
	public static void main(String[] args) {
		//객체 생성의 차이에 의해 반환값이 달라짐
		Weapon wp=new Weapon();
		System.out.println("기본능력:"+wp.fire());
		wp=new Cannon();
		System.out.println("대포능력:"+wp.fire());
	}
}
