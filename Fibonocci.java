package in.ineuron.poc2;

import java.util.Scanner;

public class Fibonocci {

	public static void main(String[] args) {
		
		System.out.println("Enter number: ");
	    
		int num;
		int num1=0;
		int num2=1;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
		System.out.print(num1+" "+num2+" ");
		if(num>=0) {
			 
			while(num1+num2<= num) {
				int res=num1+num2;
				System.out.print(res+" ");
				num1=num2;
				num2=res;
				 
			}
			
			
			
		}

	}

}
