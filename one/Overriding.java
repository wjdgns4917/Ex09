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
		//��ü ������ ���̿� ���� ��ȯ���� �޶���
		Weapon wp=new Weapon();
		System.out.println("�⺻�ɷ�:"+wp.fire());
		wp=new Cannon();
		System.out.println("�����ɷ�:"+wp.fire());
	}
}
