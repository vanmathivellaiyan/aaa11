package guviprogram;

import java.util.Scanner;

public class powofnum {
	public static void main(String[] args){
		int num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		int nn;
		int sum;
		nn=sc.nextInt();
		sum=(int)Math.pow(num,nn);
		System.out.println(sum);
		}
	}


