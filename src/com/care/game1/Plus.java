package com.care.game1;

import java.util.Scanner;

class plus01{
	private int w=0;
	public int getW() {	return w; }
	public void setW(int w) { this.w = w; }
	
	public boolean show() {
		Scanner n = new Scanner(System.in);
		System.out.println("������ ���ǰԿ�!");
		w = n.nextInt();
		while(true) {
			int p = n.nextInt();
			if(p==1) {
				w+=1;
				if(w>=1) {
					System.out.println("�ٳ��Ϳ��� ��ǻ�͸� �����ϸ� 10% ����!!");
					w-=1;
				} else {					
					setW(w);
				}
			} else if(p==2) {
				w+=2;
				if(w>=2) {
					System.out.println("��ǻ�� �п��� ���� KG IT BANK!!");
					w-=2;
				} else {
					setW(w);
				}
			} else if(p==3) {
				w+=3;
					if(w>=3) {
						System.out.println("�� �ֵ��� ���� ���� �� 3�� 3000��!!");
						w-=3;
					} else {
						setW(w);
					}
				}
			else if(p==4) {
				w+=4;
				if(w>=4) {
					System.out.println("���� �����մϴ�.");
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


