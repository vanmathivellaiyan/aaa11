package guviprogram;

import java.util.Scanner;

public class leapyear {
	public static void main(String[] args){
	int num;
	Scanner sc=new Scanner(System.in);
	num=sc.nextInt();
	if(num%4==0||num%400==0){
		System.out.println("leap year");
	}
		else if(num%100!=0){
			System.out.println("not a leap");
		}
	}
}

