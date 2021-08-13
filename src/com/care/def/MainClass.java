package com.care.def;

import java.util.Scanner;

import com.care.game02.Game02_leenayoung;
import com.care.game1.UpDownGame;
import com.care.game3.PickupGame;
import com.care.game4.Game04;



public class MainClass {

	public static void main(String[] args) {
		
		Game04 si = new Game04();
		
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("--- 게임기 ---");
		
		while (true) {
			System.out.println("1.Up&Down 숫자맞추기");
			System.out.println("2.가위바위보");
			System.out.println("3.아이템 뽑기");
			System.out.println("4.끝말잇기");
			System.out.println("5.게임 종료");
			System.out.println(">>>: ");
			num = input.nextInt();
			switch (num) {
			case 1:
				UpDownGame g1=new UpDownGame();
				//g1.UpDownGame();
				System.out.println("Up&Down 숫자맞추기");
				break;
			case 2:
				System.out.println("가위바위보");
				Game02_leenayoung g2 = new Game02_leenayoung();
				g2.main(args);
				break;
			case 3:
				PickupGame g3 = new PickupGame();
				g3.start();
				System.out.println("아이템 뽑기");
				break;
			case 4:
				System.out.println("끝말잇기");
				si.run();
				break;
			case 5:
				System.out.println("게임을 종료합니다.");
				System.exit(1);
			}
		}
	}
}
