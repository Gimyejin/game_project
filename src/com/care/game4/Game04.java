package com.care.game4;

import java.util.Scanner;

public class Game04 {
	String word = null;
	String[] wordList = { "지금", "금수저", "저장", "강산", "산책", "책임" }; 
	
	public String getWord() {return word;}
	public void setWord(String word) {this.word = word;	}
	
	public void run() {
		Game04 si = new Game04();
		si.word = si.wordList[(int)(Math.random()*si.wordList.length)];
		
		Scanner scan = new Scanner(System.in);
		System.out.println("끝말잇기 게임입니다");
		System.out.println("1. 3~4글자/ 2. 3글자/ 3.4~5글자 ");
		int x = scan.nextInt();
		int win=0;
		int cnt=2;
			while(cnt!=0) {			
			System.out.println(si.word+" 뒤에 이을 글자를 입력하세요: ");
			String s = scan.next();
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
			}
			System.out.println("게임을 종료합니다.\n"+win+"회 성공");
	}
}
	
	