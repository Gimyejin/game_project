package com.care.game1;

import java.util.Scanner;

class UpDown{
	public int com,max=99;
	public int ranNum() {
		com = (int)(Math.random()*99+1);
		return com;
	}
	public int jumsuScore(int jumsu) {
		if(max>jumsu){
			max = jumsu;
			return 0;
		}	
		return 1;
	}
	public int computerCheck(int player) {
		if(player > com)	return 2; 
		else if(player < com)	return 1;
		return 4;
	}
	public int record() {	return max;	}
}

public class UpDownGame {
	public static void main(String[] args) {
		UpDown updw = new UpDown();
		Scanner sc = new Scanner(System.in);
		int a=0, com=0, c=0, score=0, result=0;
		int player=0;
		while(true) {
			System.out.println(" ===== Up & Down Game ===== ");
			System.out.println(" 1. ���ӽ��� ");
			System.out.println(" 2. �������� ");
			System.out.println(" 3. �������� ");
			System.out.println(" > > ");
			a = sc.nextInt();
			
			switch(a){
			case 1:
				com = updw.ranNum();
				System.out.println("���� ���� : ");
				c = 3;
				while(true)
				{
					if(c==3){
						System.out.println(" ===  ���� ����!  ===");					
					}else if(c==1){
						System.out.println(" ===  ���� ������!  ===");
						score++;
					}else if(c==2) {
						System.out.println(" ===  ���� ���̿���!  === ");
						score++;

					}else{
						score++;
						System.out.println(score+"ȸ ���� ����!");
						result=updw.jumsuScore(player);
						score=0;
						if(result == 0){
							System.out.println("���� ���� ��� ����!! \n");
						}		
						break;
					}
					System.out.print("��ȣ �Է� --> ");
					player = sc.nextInt();			
					c=updw.computerCheck(player);
				}			
				break;
			case 2:
				if(updw.record() == 99)
				{
					System.out.println("������ �������� �ʾҽ��ϴ�");
					break;
				}
				System.out.println("���� ���� ��� "+updw.record()+"ȸ!");
				break;
			case 3:
				System.out.println("��������");
				return ;
			}
		}	
	}
}