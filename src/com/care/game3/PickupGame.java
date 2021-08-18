package com.care.game3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import com.care.def.MainClass;

public class PickupGame extends Print {
	Scanner input = new Scanner(System.in);
	private int coin;
	HashMap<Integer, String> item = new HashMap<Integer, String>();
	ArrayList pick = new ArrayList();
	HashMap< String, String > useprint =new HashMap<String, String>();
	public void start() {
		System.out.println("---- ������ �̱� ----");
		System.out.print("���� �־��ּ���[100���� �� 1ȸ] >>> ");
		coin = input.nextInt();
		check();
	}

	public void check() {
		if (coin < 100) {
			System.out.println("! �ܾ��� �����մϴ�. !");
			System.out.println("[�ܾ��� �����Ͻðڽ��ϱ�?]");
			System.out.println("[1.Yes]   [2.No]");
			String check = input.next();

			if (check.equals("1")) {
				System.out.println("�߰��� �ݾ��� �־��ּ���");
				int plus = input.nextInt();
				System.out.println(plus + "������ �߰��Ǿ����ϴ�.\n");
				coin += plus;
				System.out.println(">���� �ݾ�: " + coin + "����");
				if (coin > 100)
					play();
				else
					check();
			} else if (check.equals("2")) {
				System.out.println("�ܾ� �������� ����ȭ������ �̵��մϴ�.");
				System.out.println("==============================\n");;
				MainClass mc = new MainClass();
				mc.main(null);
				
			} else {
				System.out.println("1���� 2�� �� ����ּ���.\n");
				check();

			}
		} else {
			System.out.println("[�̱⸦ �����մϴ�.]");

			play();
		}

	}

	public void play() {
		System.out.println(" �ѤѤѤѤѤѤѤѤѤѤѤѤ�");
		System.out.println("| ~~~ ������ �̱� ~~~ |");
		System.out.println(" �ѤѤѤѤѤѤѤѤѤѤѤѤ�");
		items();
		while (true) {
			System.out.println("1.�̱�  2.���� ������  3.����");
			int num = input.nextInt();
			switch (num) {
			case 1:
				if (coin >= 100) {
					pickup();
					coin -= 100;
					System.out.println(">���� �ݾ�: "+coin+"����\n");
					break;
				} else {
					check();
				}
			case 2:
				myItem();
				System.out.println("�������� ������ ���ðڽ��ϱ�? [yes/no]");
				String choose = input.next();
				if(choose.equals("yes")) {
					super.cut(useprint);
				}
				break;
			case 3:
				System.exit(1);

			}
		}
	}

	public void items() { // item����
		item.put(1, "[������]�� ���Դ�. 100���ΰ� �ٲ� �����̴�");
		item.put(2, "[������ ����]�� ���Դ�. 100���ΰ� �����⸦ �ٲ��.");
		item.put(3, "[������]�� ���Դ�. 'û�� ������'��� �����ִ�.");
		item.put(4, "[���׶� �Ȱ�]�� ���Դ�. �мǾ������� �����.");
		item.put(5, "[���� �ռҵ�]�� ���Դ�. ���𰡸� �� �� ���� �� ���� �ʴ�.");
		item.put(6, "[����]�� ���Դ�. ���� 1������� �ִ�.");
		item.put(7, "[����]�� ���Դ�. ��ũ�� �ʿ��� �� ����.");
		item.put(8, "[B�� ��ȭå]�� ���Դ�. �̰� �� �����?");
		item.put(9, "[����]�� ���Դ�. �䳢 �����̴�.");
		item.put(10, "[������]�� ���Դ�. �α��� ������ ���̴�.");
		item.put(11, "[�Ƿ�ȸ����]�� ���Դ�. �Ƿθ� -30 ���ִ� �����̴�.");
		item.put(12, "[���� ����]�� ���Դ�. ������ +30 ���ִ� �����̴�.");
		item.put(13, "[ü�� ����]�� ���Դ�. ü���� +30 ���ִ� �����̴�.");
		item.put(14, "[2000����]�� ���Դ�. ���� ���� ���ڴ�!");
	}

	public void pickup() {
		int ran = (int) (Math.random() * 100) + 1;
		if (ran == 2) {
			System.out.println("!!!�� ����!!!");;
			System.out.println(item.get(14));
			coin +=2000;
		} else if (ran > 2 && ran < 11) {
			System.out.println("!!����!!");;
			int random = (int) (Math.random() * 3) + 11;
			System.out.println(item.get(random));
			inMyItem(random);
		} else {
			int random = (int) (Math.random() * 10) + 1;
			System.out.println(item.get(random));
			inMyItem(random);
		}
	}

	public void inMyItem(int key) {
		String i = item.get(key);
		int finalIndex = i.indexOf("]");
		i = i.substring(1, finalIndex);
		pick.add(i);
		useprint.put(i,item.get(key));
	}

	public void myItem() {// pick����
		System.out.print("�� ������: ");
		for (int i = 0; i < pick.size(); i++) {
			System.out.print(pick.get(i));
			if(i != (
					pick.size()-1))System.out.print(", ");
		}
		System.out.println();
	}
}
