import java.util.Scanner;
class rectangle
{
int length;
int width;

rectangle()
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the length :");
length=sc.nextInt();
Scanner sd=new Scanner(System.in);
System.out.print("Enter the width :");
width=sd.nextInt();
}
int area()
{
return (length*width);
}
}
class rect
{
public static void main(String [] args)
{
rectangle rect1=new rectangle();
int A;
A=rect1.area();
System.out.println("The area of rectangle is : " +A);
}
}
