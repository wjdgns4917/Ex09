package com.three;

public class CarTest{
	public static void main(String[] args) {
		//CarClass �θ�Ŭ������ �������� ���볻�� �߰�
		//Benz, Sonata�� CarClass�� ��ӹ޾Ƽ� �ٵ�����,����
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
