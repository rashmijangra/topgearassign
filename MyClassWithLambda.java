package topgear;

import java.util.Scanner;

public class MyClassWithLambda{
	 
		
public static void main(String args[]){
	System.out.println("enter a string to count words in it");
	Scanner sc=new Scanner(System.in);
	String st=sc.nextLine();
	
	WordCount wc= (String str) ->{
		
		String[] arr=str.split("\\W");
		int len=arr.length;
		for(String a:arr){
			System.out.println(a);
		}
		return len;
		};
	
	int len=wc.count(st);
	System.out.println("number of words in given string is "+len);
	
	
	}


}
