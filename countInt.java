package guviprogram;

import java.util.Scanner;



public class countInt {
public static void main(String[] args){
	int num;
	int rem=0;
	int count;
	Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		while(num!=0){
			count=num%10;
			rem++;
			num=num/10;
	}
		System.out.println(rem++);
}
}
