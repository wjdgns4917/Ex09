package com.three2;

import java.util.Scanner;

public class CarTest{
	public static void main(String[] args) {
		//CarClass �θ�Ŭ������ �������� ���볻�� �߰�
		//Benz, Sonata�� CarClass�� ��ӹ޾Ƽ� �ٵ�����,����
		//������� 1�� Benz, 2�� Son, 3�� Equus
		//switch���
		Scanner scan=new Scanner(System.in);
		BenzClass bc=new BenzClass();
		SonataClass sc=new SonataClass();
		EquusClass ec=new EquusClass();
		ec=null;
		
		while (true) {
			System.out.println("������� ���� : (1,2,3)");
			int lineNum=scan.nextInt();
			
			if (lineNum==-1) {
				System.out.println("��������");
				break;
			}
			switch (lineNum) {
			case 1:
				bc.carBase("Benz");
				bc.doJoripBen();
				break;
			case 2:
				sc.carBase("Sonata");
				sc.doJoripSon();
				break;
			case 3:
				ec.carBase("Equus");
				ec.doJoripEq();
				break;
			
			default:
				System.out.println("���μ��� ����");
				break;
		
			}
		}
		
		
		
	}
}
