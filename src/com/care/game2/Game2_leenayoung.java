package com.care.game2;

import java.util.Random;
import java.util.Scanner;

class Advertise {
	public void display() {
		System.out.println(" ---- ���� Ÿ�� ---- ");
		System.out.println("5�ʸ� ��ٷ� �ּ���~~");
		for(int i=0; i<5; i++) {
			System.out.print(">");
			try {
				Thread.sleep(1000);
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println("������ �ٽ� �����մϴ�!");
	}
	
}

public class Game2_leenayoung extends Advertise {
	static public final int Rock =0;
	static public final int Scis =1;
	static public final int Paper =2;
	
	static public final int Win = 1;
	static public final int Draw = 0;
	static public final int Lose = -1;
	
	public static void main(String[] args) {
		int sel;
		boolean isPlaying = true;
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		Advertise ad = new Advertise();
		
		System.out.println("������ �����մϴ�!");
		while(isPlaying) {
			System.out.println("(0=����, 1=����, 2=��)");
			System.out.print("�Է� >>> ");
			int com = rnd.nextInt(3);
			sel =sc.nextInt();
			int result = WhoisWin(sel,com);
			switch(result) {
			case Win: System.out.println("�̰���ϴ�!");
					  isPlaying = false;
					  break;
			case Draw: System.out.println("���׿�~");
					   isPlaying = false;
					   break;
			case Lose: System.out.println("�����ϴ�. �ѹ���!");
					   ad.display();
					   break;
			}
		}
	}
			
	public static int  WhoisWin(int player, int com) {
		int result = player - com;
		if(result == 0) return Draw;
		if(player == Paper) {
			if(result == 2)return Win;
			if(result == 1)return Lose;
		}
		if (result == -1)return Win;
		return Lose;
		
	}
}
