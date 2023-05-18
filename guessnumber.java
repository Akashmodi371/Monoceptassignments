package com.techlabs.controlstructures;

import java.util.Random;
import java.util.Scanner;

public class Enhanceforloop {

	public static void main(String[] args) {
		
		Random rd=new Random();
		int number=rd.nextInt(100);
		
		int noofguess=1;
		
		Scanner sc=new Scanner(System.in);
		
		int value=sc.nextInt();
		
		while(number!=value) {
			if(noofguess>10) {
				System.out.println("No of guess should not greater than 10");
				break;
			}
			else if(value<number) {
				System.out.println("Too low number");
				noofguess++;
				value=sc.nextInt();
			}
			else {
				System.out.println("Too High number");
				noofguess++;
				value=sc.nextInt();
			}
		}
		if(noofguess<10 && number ==value) {
			System.out.println("You win and number of guess are"+" "+ noofguess);
		}
		else {
			System.out.println("Guess less then 10");
		}
		

	}

}
