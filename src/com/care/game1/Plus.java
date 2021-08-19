package com.care.game1;

import java.util.Scanner;

class plus01{
	private int w=0;
	public int getW() {	return w; }
	public void setW(int w) { this.w = w; }
	
	public boolean show() {
		Scanner n = new Scanner(System.in);
		System.out.println("광고보고 가실게요!");
		w = n.nextInt();
		while(true) {
			int p = n.nextInt();
			if(p==1) {
				w+=1;
				if(w>=1) {
					System.out.println("다나와에서 컴퓨터를 구매하면 10% 할인!!");
					w-=1;
				} else {					
					setW(w);
				}
			} else if(p==2) {
				w+=2;
				if(w>=2) {
					System.out.println("컴퓨터 학원은 역시 KG IT BANK!!");
					w-=2;
				} else {
					setW(w);
				}
			} else if(p==3) {
				w+=3;
					if(w>=3) {
						System.out.println("명량 핫도그 지금 구매 시 3개 3000원!!");
						w-=3;
					} else {
						setW(w);
					}
				}
			else if(p==4) {
				w+=4;
				if(w>=4) {
					System.out.println("광고를 종료합니다.");
					System.exit(0);
					w-=4;
				} else {
					setW(w);
				}
			} 			
		}
}
}


public class Plus {
	public static void main(String[] args) {
		plus01 pl01 = new plus01();
		pl01.show();
	}
}


