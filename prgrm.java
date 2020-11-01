import java.util.*;
class prgrm
{
	public static void main(String[] args)
	{
		Scanner aa=new Scanner(System.in);
		System.out.print("\n   simple program.... \n Please enter your name >> ");
		String a=aa.nextLine();
		System.out.print("  Hello "+a+"\n");
		System.out.print("\nPlease select your language....\n 1-English\n 2-Hindi \n 3-Malayalam \n >> ");
	        int b=aa.nextInt();
		switch(b){
			case 1:
				System.out.print("   Hello "+a+", you've chosen ENGLISH\n");
				break;
			case 2:
				System.out.print("   Namaskaar "+a+"...aapne hindi choose kiya he\n");
				break;
			case 3:
				System.out.print("   Namaskaaram "+a+"...ningal malayalam thiranjedthirikunnu\n");
			default:
				System.out.print("Invalid input\n");
				break;
			}
		 }
}
