package com.cjc.calculator.client;

import com.cjc.calculator.serviceImpl.Operation;
import java.util.Scanner;

public class Test 
{
	public static void main(String args[])
	{
		Operation op = new Operation();
		    while(true)
		    { 
		    	System.out.println("--------------------------------------");
		    	System.out.println("Enter 1 : Addition");
		    	System.out.println("Enter 2 : Substraction");
		    	System.out.println("Enter 3 : Multiplication");
		    	System.out.println("Enter 4 : Division");
			
		    	Scanner sc = new Scanner(System.in);
		    	int x = sc.nextInt();
		    	switch(x)
		    	{
		    		case 1 :
		    				op.add();
		    				break;
			            
		    		case 2 :
		    				op.sub();
		    				break;
				       
		    		case 3 :
		    				op.mul();
		    				break;
				       
		    		case 4 :
		    				op.div();
		    				break;
				   
		    	}
			 }
	}

}
