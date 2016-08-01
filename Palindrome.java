package guviprogram;

import java.util.Scanner;

class Palindrome{
	public static void main(String args[]){
		
		int num = 0; 
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		int reverse=0,remainder;
		int n=num;
		while(num > 0){
			remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
		}
		if(reverse == n)
			System.out.println(n+" is a Palindrome Number");
		else
			System.out.println(n+" is not a Palindrome Number");
	}
}