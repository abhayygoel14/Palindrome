package Palindrome;
import java.lang.*;
import java.util.*;
public class Palindrome {
	 
	public int ReverseNum(int r) {
		int n= r;
		int revrs=0;
		int rem=0;
		if(n>0 && n<10) {
			return n;
		}
		while(n!=0)
		{
			rem=n%10;
			revrs=revrs*10+rem;
			n=n/10;
		}
		return revrs;
	}
	public String ReverseString(int f) {
		int s=f;
		String d=String.valueOf(s);
		 char rev[] = d.toCharArray(); 
		  String revString="";
	        for (int i = rev.length-1; i>=0; i--) 
	        {
	             revString= revString+rev[i];
	        }
	        return revString;
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Palindrome ob=new Palindrome();
		int s= sc.nextInt();
		int reverse=ob.ReverseNum(s);
		String reverseString=ob.ReverseString(s);
		if(s==0) {
			System.out.println("true");
			System.exit(0);
		}
		if(s < 0) {
			System.out.println("false");
			System.out.println("Explanation: From left to right, it reads "+s+ ". From right to left, it becomes " + reverseString + ". Therefore it is not a palindrome.");

		}
		else if(s%10==0) {
			
		        System.out.println("false");
	 			System.out.println("Explanation: From left to right, it reads "+s+ ". From right to left, it becomes " + reverseString + ". Therefore it is not a palindrome.");
	        }
		else if(s== reverse ){
			System.out.println("true");
		}
		else {
			System.out.println("false");
			System.out.println("Explanation: From left to right, it reads "+s+ ". From right to left, it becomes " + reverseString + ". Therefore it is not a palindrome.");
		}

}
}
