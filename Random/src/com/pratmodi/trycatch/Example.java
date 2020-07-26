package com.pratmodi.trycatch;

public class Example {
public static void main(String args[]) {
try {
int a[]= new int[10];
a[10]= 10/0;
}
catch(ArithmeticException e)
{
System.out.println("Arithmetic exception in first catch block");
e.printStackTrace();
System.out.println("This is e.getMessage(): "+e.getMessage());
System.out.println("This is e.getStackTrace(): "+e.getStackTrace());
System.out.println("This is e.getCause(): "+e.getCause());
System.out.println("This is e.toString(): "+e.toString());
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Array index out of bounds in second catch block");
}
catch(Exception e)
{
System.out.println("Any exception in third catch block");
}
}
}
