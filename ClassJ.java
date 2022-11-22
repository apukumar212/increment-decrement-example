package com.pack1;

public class ClassJ
{
void meth1()
{
	int a=10;
	System.out.println(a);
	System.out.println(a++);    //post Increment
	System.out.println(a);
}
void meth2()
{
	int a=20;
	System.out.println(a);
	System.out.println(++a);    //pre Increment
	System.out.println(a);
}
void meth3()
{
	int a=100;
	System.out.println(a);
	System.out.println(a--);
	System.out.println(a);
}
void meth4()
{
	int a=50;
	System.out.println(a);
	System.out.println(--a);   //pre Decrement
	System.out.println(a);
}
void meth5()
{
	int a=10;
	int b=a++;
	System.out.println("a :"+a);
	System.out.println("b :"+b);
	System.out.println(a+b);	
}
public static void main(String[] args) 
{
	ClassJ aobj=new ClassJ();
	aobj.meth1();
	System.out.println("-----------------");
	aobj.meth2();
	System.out.println("-----------------");
	aobj.meth3();
	System.out.println("-----------------");
	aobj.meth4();
	System.out.println("-----------------");
	aobj.meth5();
}
}

