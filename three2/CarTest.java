package com.three2;

import java.util.Scanner;

public class CarTest{
	public static void main(String[] args) {
		//CarClass 부모클래스로 엔진장착 공통내용 추가
		//Benz, Sonata는 CarClass를 상속받아서 바디장착,생산
		//생산라인 1번 Benz, 2번 Son, 3번 Equus
		//switch사용
		Scanner scan=new Scanner(System.in);
		BenzClass bc=new BenzClass();
		SonataClass sc=new SonataClass();
		EquusClass ec=new EquusClass();
		ec=null;
		
		while (true) {
			System.out.println("생산라인 선택 : (1,2,3)");
			int lineNum=scan.nextInt();
			
			if (lineNum==-1) {
				System.out.println("생산종료");
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
				System.out.println("라인선택 오류");
				break;
		
			}
		}
		
		
		
	}
}
