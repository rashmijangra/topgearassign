package topgear;

import java.util.Scanner;

public class ImplClassWithLambda {
	
	 public static void main(String args[]){
		 
		 System.out.println("enter a string to count words in it");
			Scanner sc=new Scanner(System.in);
			String st=sc.nextLine();
			 System.out.println("enter a charcater to count its occurence");
				
			 char ch=sc.nextLine().charAt(0);
			 
		 CharacterOccurence co=(String str,char c)->{
			 int res=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==c){
				res++;
			}
		}
			  return res;
		};
		int count=co.findOccurence(st, ch);
		 System.out.println("count of -"+ ch + "-given string is="+ count);
		 
		 
	 }
}
