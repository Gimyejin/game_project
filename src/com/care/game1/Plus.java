package com.care.game1;

import java.util.Scanner;



public class Plus {
		public void show() {
			int p = (int) (Math.random() * 4) + 1;
			if (p >= 1) {
				System.out.println("�ٳ��Ϳ��� ��ǻ�͸� �����ϸ� 10% ����!!");
			} else if (p >= 2) {
				System.out.println("��ǻ�� �п��� ���� KG IT BANK!!");
			} else if (p >= 3) {
				System.out.println("�� �ֵ��� ���� ���� �� 3�� 3000��!!");
			} else if (p >= 4) {
				System.out.println("���� ĩ�� ���� �� 3�� 1000��!!");
			} 
		}
	}

