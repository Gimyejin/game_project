package com.care.game4;

import java.util.Scanner;

public class Game04 {
	String word = null;
	String[] wordList = { "����", "�ݼ���", "����", "����", "��å", "å��" }; 
	
	public String getWord() {return word;}
	public void setWord(String word) {this.word = word;	}
	
	public void run() {
		Game04 si = new Game04();
		si.word = si.wordList[(int)(Math.random()*si.wordList.length)];
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�����ձ� �����Դϴ�");
		System.out.println("1. 3~4����/ 2. 3����/ 3.4~5���� ");
		int x = scan.nextInt();
		int win=0;
		int cnt=2;
			while(cnt!=0) {			
			System.out.println(si.word+" �ڿ� ���� ���ڸ� �Է��ϼ���: ");
			String s = scan.next();
			switch(x) {
			case 1: if ((s.length()==4 || s.length()==3) && (si.word.charAt(si.word.length() - 1) == s.charAt(0))) {
				si.word = s ; win++; cnt=2;
			} else {
				System.out.println("Ʋ�Ƚ��ϴ�."); cnt--;
				} break;
			case 2: if ((s.length()==3) && (si.word.charAt(si.word.length() - 1) == s.charAt(0))) {
				si.word = s ; win++; cnt=2;
			} else {
				System.out.println("Ʋ�Ƚ��ϴ�."); cnt--;
			} break;
			case 3: if ((s.length()==4 || s.length()==5) && (si.word.charAt(si.word.length() - 1) == s.charAt(0))) {
				si.word = s ; win++; cnt=2;
			} else {
				System.out.println("Ʋ�Ƚ��ϴ�."); cnt--;
				} break;
			default : System.out.println("�߸� �Է��Ͽ����ϴ�"); 			
			}	
			}
			System.out.println("������ �����մϴ�.\n"+win+"ȸ ����");
	}
}
	
	