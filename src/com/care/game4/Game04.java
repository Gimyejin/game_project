package com.care.game4;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class Record{
	public int winn; public Date d;
	SimpleDateFormat ss = new SimpleDateFormat("mm분 ss초");
	public void record(int e) {
		if(e==1) {
			Date d2 = new Date();
			long d3 = d2.getTime()-d.getTime();
			String str = ss.format(d3);		
			System.out.print(winn+"회 성공, ");
			System.out.println(str+" 경과하였습니다");
		} else System.exit(0);
	}
}

public class Game04 extends Record{

	String word = null;
	String[] wordList = { "지금", "금수저", "저장", "강산", "산책", "책임" }; 
	int r1 = 0;
	
	public String getWord() {return word;}
	public void setWord(String word) {this.word = word;	}
	
	public void run() {
		
		
		Game04 si = new Game04();
		si.word = si.wordList[(int)(Math.random()*si.wordList.length)];
		
		Scanner scan = new Scanner(System.in);
		System.out.println("끝말잇기 게임입니다");
		System.out.println("1. 3~4글자/ 2. 3글자/ 3.4~5글자 ");
		int x = scan.nextInt();
		Date d1 = new Date();
		d = d1;
		int win=0;
		int cnt=2;
			while(cnt!=0) {			
			System.out.println(si.word+" 뒤에 이을 글자를 입력하세요: ");
			String s = scan.next();	
			if(s.equals(si.word)) { 
				System.out.println("같은 단어입니다"); cnt--;}
				else {
			switch(x) {
			case 1: if ((s.length()==4 || s.length()==3) && (si.word.charAt(si.word.length() - 1) == s.charAt(0))) {
				si.word = s ; win++; cnt=2; 
			} else {
				System.out.println("틀렸습니다."); cnt--; 
				} break;
			case 2: if ((s.length()==3) && (si.word.charAt(si.word.length() - 1) == s.charAt(0))) {
				si.word = s ; win++; cnt=2; 
			} else {
				System.out.println("틀렸습니다."); cnt--;
			} break;
			case 3: if ((s.length()==4 || s.length()==5) && (si.word.charAt(si.word.length() - 1) == s.charAt(0))) {
				si.word = s ; win++; cnt=2; 
			} else {
				System.out.println("틀렸습니다."); cnt--;
				} break;
			default : System.out.println("잘못 입력하였습니다"); 			
			}	
			}  }
			winn = win;
			System.out.println("게임을 종료합니다.");
			if(win>=1) {
				System.out.println("기록을 확인하시겠습니까? 1.o 2.x");
				int re = scan.nextInt();
				record(re);
			}
			
	}
}
	
	