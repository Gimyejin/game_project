package com.care.def;

import java.util.Scanner;

<<<<<<< HEAD
import com.care.game3.PickupGame;
import com.care.game4.Game04;
import com.care.game1.UpDownGame;
import com.care.game2.Game2_leenayoung;
=======
import com.care.game02.Game02_leenayoung;
import com.care.game1.UpDownGame;
import com.care.game3.PickupGame;
import com.care.game4.Game04;

>>>>>>> c7addb67a3067047e1fbd3abe366050042e00865

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
				UpDownGame g1=new UpDownGame();
				//g1.UpDownGame();
				System.out.println("Up&Down ���ڸ��߱�");
				UpDownGame updw = new UpDownGame();
				updw.display();
				break;
			case 2:
				System.out.println("����������");
				Game2_leenayoung g2 = new Game2_leenayoung();
				g2.main(args);
				break;
			case 3:
				PickupGame g3 = new PickupGame();
				g3.start();
				System.out.println("������ �̱�");
				break;
			case 4:
				System.out.println("�����ձ�");
				Game04 g4=new Game04();
				g4.run();

				break;
			case 5:
				System.out.println("������ �����մϴ�.");
				System.exit(1);
			}

		}

	}
}
