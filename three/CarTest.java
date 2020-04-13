package com.three;

public class CarTest{
	public static void main(String[] args) {
		//CarClass 부모클래스로 엔진장착 공통내용 추가
		//Benz, Sonata는 CarClass를 상속받아서 바디장착,생산
		BenzClass bc=new BenzClass();
		bc.carBase("Benz");
		bc.doJoripBen();
		
		SonataClass sc=new SonataClass();
		sc.carBase("Sonata");
		sc.doJoripSon();
		
		EquusClass ec=new EquusClass();
		ec.carBase("Equus");
		ec.doJoripEq();
	}
}
