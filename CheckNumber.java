package in.ineuron.poc1;

import java.util.Scanner;

public class CheckNumber {

	public static void main(String[] args) {
	    System.out.println("Enter number: ");
	    
	    Scanner sc=new Scanner(System.in);
	    int num=sc.nextInt();
	    
	    if(num>0) {
	    	System.out.println(num+ " is positive number");
	    }
	    else if(num<0) {
	    	System.out.println(num+ " is negative number");
	    }
	    else {
	    	System.out.println(num+ " is zero");
	    }
	}

}
