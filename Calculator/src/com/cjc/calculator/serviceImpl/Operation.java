package com.cjc.calculator.serviceImpl;

import com.cjc.calculator.service.Calculator;
import java.util.Scanner;

public class Operation implements Calculator
{
	Scanner sc = new Scanner(System.in);
	public void add()
	{
		System.out.println("Enter value of first number");
		int num1 = sc.nextInt();
		System.out.println("Enter value of second number");
		int num2 = sc.nextInt();
		int sum = num1 + num2;
		System.out.println("Addition----->"+sum);
		
	}
	public void sub()
	{
		System.out.println("Enter first number");
		int num1 = sc.nextInt();
		System.out.println("Enter second number");
		int num2 = sc.nextInt();
		int sub = num1- num2;
		System.out.println("Substraction----->"+sub);
		
	}
	public void mul()
	{
		System.out.println("Enter first number");
		int num1 = sc.nextInt();
		System.out.println("Enter second number");
		int num2 = sc.nextInt();
		int mul = num1 * num2;
		System.out.println("Multiplication----->"+mul);
		
	}
	public void div()
	{
		System.out.println("Enter first number");
		int num1 = sc.nextInt();
		System.out.println("enter second number");
		int num2 = sc.nextInt();
		int div = num1/num2;
		System.out.println("Division----->"+div);
		
	}
	

}
