import java.util.*;
class count{
	public static void main(String[] args){
		Scanner aa=new Scanner(System.in);
		System.out.print("entr no: ");
		long a=aa.nextLong();
		long c=a;
		int b=0;
		while (a>0){
			a=a/10;
			b++;
		}
		System.out.println(c+" has "+b+" digits.");
	}
}
