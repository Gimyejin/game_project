package com.care.game4;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class Record{
	public int winn; public Date d;
	SimpleDateFormat ss = new SimpleDateFormat("mm�� ss��");
	public void record(int e) {
		if(e==1) {
			Date d2 = new Date();
			long d3 = d2.getTime()-d.getTime();
			String str = ss.format(d3);		
			System.out.print(winn+"ȸ ����, ");
			System.out.println(str+" ����Ͽ����ϴ�");
		} else System.exit(0);
	}
}

public class Game04 extends Record{

	String word = null;
	String[] wordList = { "����", "�ݼ���", "����", "����", "��å", "å��" }; 
	int r1 = 0;
	
	public String getWord() {return word;}
	public void setWord(String word) {this.word = word;	}
	
	public void run() {
		
		
		Game04 si = new Game04();
		si.word = si.wordList[(int)(Math.random()*si.wordList.length)];
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�����ձ� �����Դϴ�");
		System.out.println("1. 3~4����/ 2. 3����/ 3.4~5���� ");
		int x = scan.nextInt();
		Date d1 = new Date();
		d = d1;
		int win=0;
		int cnt=2;
			while(cnt!=0) {			
			System.out.println(si.word+" �ڿ� ���� ���ڸ� �Է��ϼ���: ");
			String s = scan.next();	
			if(s.equals(si.word)) { 
				System.out.println("���� �ܾ��Դϴ�"); cnt--;}
				else {
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
			}  }
			winn = win;
			System.out.println("������ �����մϴ�.");
			if(win>=1) {
				System.out.println("����� Ȯ���Ͻðڽ��ϱ�? 1.o 2.x");
				int re = scan.nextInt();
				record(re);
			}
			
	}
}
	
	