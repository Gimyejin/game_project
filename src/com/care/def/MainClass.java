package com.care.def;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("--- ���ӱ� ---");
		while (true) {
			System.out.println("1.Up&Down ���ڸ��߱�");
			System.out.println("2.����������");
			System.out.println("3.������ �̱�");
			System.out.println("4.�����ձ�");
			System.out.println("5.���� ����");
			System.out.println(">>>: ");
			num = input.nextInt();
			switch (num) {
			case 1:
				System.out.println("Up&Down ���ڸ��߱�");
				break;
			case 2:
				System.out.println("����������");
				break;
			case 3:
				System.out.println("������ �̱�");
				break;
			case 4:
				System.out.println("�����ձ�");
				break;
			case 5:
				System.out.println("������ �����մϴ�.");
				System.exit(1);
			}
		}
	}
}
