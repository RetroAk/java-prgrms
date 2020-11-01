import java.util.*;
class larg
{
	public static void main(String[] args)
	{
		Scanner aa=new Scanner(System.in);
		System.out.print("entr 1st no: ");
		int a=aa.nextInt();
		System.out.print("entr 2nd no: ");
		int b=aa.nextInt();
		System.out.print("entr 3rd no: ");
		int c=aa.nextInt();
	
		/*if(a>b&a>c){System.out.print(a+" is great");}
		else if(b>c&b>a){System.out.print(b+" is great");}
		else{System.out.print(c+" is great");}*/
	
		/*int d=a>b?a:b;
		int e=d>c?d:c;
		System.out.print(e+" is great");*/
	
		int f=c>(a>b?a:b)?c:(a>b?a:b);
		System.out.println(f+" is the greatest");
	}
}
