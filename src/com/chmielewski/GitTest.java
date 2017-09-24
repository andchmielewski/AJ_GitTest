package com.chmielewski;

import java.util.Scanner;

public class GitTest {
	enum zamowienia {NOWE, OCZEKUJĄCE, REALIZOWANE, WYSŁANE, ZWROT};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		System.out.println(Math.PI * Math.pow(25.5,2));
		System.out.println("Hello world!3");
		
		String[] tKursanci = {"a","b"};
		StringBuilder sb = new StringBuilder();
		for (String kursant: tKursanci) {
			sb.append(kursant).append(",");
		}
		System.out.println(sb.toString());
		
		String[] str1 = new String[10];
		str1[0] = "a";

		for(int i =0; i< 10; i++)
		{System.out.println(str1[i]);}
		
		for(String s : str1)
		{System.out.println(s);}
		
		int i = 0;
		while(i<10){
		  System.out.println(str1[i]);
		  i++;
		}
		
		
		int[][] values={{3,8,16},
				{1,22,28,24},
				{3},
				{41,42}};
		
		int max,min;
		max=values[0][0];
		min=values[0][0];
		for(int[] s1 : values)
		{
			for(int i : s1 )
			{
				min = i < min ? i:min;
				max = i > max ? i:max;
			}
		}
		System.out.println(min);
		System.out.println(max);
		
		System.out.println("Podaj liczbę:");
		Scanner terminalInput = new Scanner(System.in);
		String xString = terminalInput.nextLine();
		int xInt = Integer.parseInt(xString);
		
		int[] str1 = {1,2,3,4};
		for(int i : str1)
		{
			if ((i/xInt) == (i%xInt))
			{
				System.out.println(xInt);
			}
		}
		terminalInput.close();
		*/
		
		processZamowienie(zamowienia.REALIZOWANE);
		
		}
		public static void processZamowienie(zamowienia stan) {
			switch (stan) {
			case REALIZOWANE:
				System.out.println("Pilne!");
				break;
			case ZWROT:
				System.out.println("Kontakt!");
				break;
			default:
				System.out.println(stan);
			}
		}
}
