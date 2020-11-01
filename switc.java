import java.util.*;

class switch_
{
	public static void main(String[] args)
	{
		Scanner aa=new Scanner(System.in);
		System.out.println("choose from 1 to 7");
			int n=aa.nextInt();
			String d;
			switch(n){
				case 1:
					d="monday";
					break;
				case 2:
					d="tueday";
					break;
				case 3:
					d="wednesday";
					break;
				case 4:
					d="thursday";
					break;
				case 5:
				        d="friday";
					break;
				case 6:
					d="saturday";
					break;
				case 7:
					d="sunday";
					break;
				default:
					d="Invalid entry";
					break;
			}
			System.out.println("its "+d);
	}
}
