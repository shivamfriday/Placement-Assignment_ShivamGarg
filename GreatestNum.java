package in.ineuron.poc4;

import java.util.Scanner;

public class GreatestNum {

	public static void main(String[] args) {
       System.out.println("Enter three numbers: ");
	    
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    int c=sc.nextInt();
	    
	    if(a>b ) {
	    	if(a>c) {
	    	System.out.println("Greatest number is "+ a);
	    	}
	    	else {
	    		System.out.println("Greatest number is "+ c);
	    	}
	    	
	    }
	    else {
	    	System.out.println("Greatest number is "+ b);
	    }

	}

}
