package guviprogram;

import java.util.Scanner;

public class primeno {
	public static void main(String[] args){
		int num;
		int rem;
		int reverse = 0;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		int sum = 0;
		sum=num;
		while(num!=0){
			rem=num%10;
			reverse=reverse*10+rem;
			num=num/10;
			}
		if(reverse==sum){
			System.out.println("palindrome");
		}
		else{
			System.out.println("not a palindrome");
		}
		}
	

}
