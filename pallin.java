import java.util.*;
class pall_num
{
	public static void main(String[] args)
	{
		Scanner aa=new Scanner(System.in);
		System.out.print("enter a number: ");
		int a=aa.nextInt();
		int b=0;
		int c=a;
		while(a!=0){
			b=b*10+a%10;
			a=a/10;}
		if(c==b){System.out.println(c+" is a pallindrome");}
		else{System.out.println(c+" is not a pallindrome");}
	}
}

