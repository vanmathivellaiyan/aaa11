package guviprogram;

import java.util.Scanner;

public class alphabet {
	public static void main(String[] args){
		char c;
		Scanner sc=new Scanner(System.in);
		c=(char) sc.next().charAt(0);
		if((c>='a'&&c<='z')||(c>='A'&&c<='Z')){
			System.out.println("string is present");
		}
		else{
			System.out.println("not present");
		}
	}

}
