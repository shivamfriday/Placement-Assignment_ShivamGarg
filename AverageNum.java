package in.ineuron.poc3;

import java.util.Scanner;

public class AverageNum {

	public static void main(String[] args) {
      System.out.println("Enter number: ");
	    
	    Scanner sc=new Scanner(System.in);
	    int num=sc.nextInt();
		int[] arr=new int[num];
		int sum=0;
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		
		int average=sum/num;
		System.out.println("the average of given array of numbers is : "+average);
		
		
		
		

	}

}
