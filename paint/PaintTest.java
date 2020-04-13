package com.paint;

import java.util.Scanner;

public class PaintTest extends Paint {
	public static void main(String[] args) {
//		Paint 밑그림 작업
//		WaterPaint 수채화물감 준비, 수채화 채색, 완성
//		1,2,3입력 입력된 값에 의해 장르구분
//		반복
		Scanner sc=new Scanner(System.in);
		WaterPaint wp=new WaterPaint();
		OilPaint op=new OilPaint();
		OrientPaint orp=new OrientPaint();
		
		while (true) {
			System.out.println("화풍선택 : (1,2,3)");
			int PaintNum=sc.nextInt();
			if (PaintNum==-1) {
				System.out.println("그리기 종료");
				break;
			}
			switch (PaintNum) {
			case 1:
				wp.doPaint("수채화");
				wp.doWPaint();
				break;
			case 2:
				op.doPaint("유채화");
				op.doOPaint();
				break;
			case 3:
				orp.doPaint("동양화");
				orp.doOrPaint();
				break;
			
			default:
				System.out.println("화풍선택 오류");
				break;
		
		}
	}
	}
}

