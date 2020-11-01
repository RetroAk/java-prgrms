import java.util.*;
class em{
	String nam;int age;String adrs;int sal;int id;
	public static void main(String[] args){
		em A=new em();
		Scanner aa=new Scanner(System.in);
		System.out.print("wats ur id? ");
		A.id=aa.nextInt();
		aa.nextLine();
		System.out.print("wats ur name? ");
		A.nam=aa.nextLine();
		System.out.print("wats ur age? ");
		A.age=aa.nextInt();
		aa.nextLine();
		System.out.print("wats ur addrss? ");
		A.adrs=aa.nextLine();
		System.out.print("wats ur salary? ");
		A.sal=aa.nextInt();
	        clear();
	        A.show();}
	public void show(){
		System.out.println("Id: "+id);
		System.out.println("Name: "+nam);
		System.out.println("Age: "+age);
		System.out.println("Address: "+adrs);
		System.out.println("Salary: "+sal);}
	public static void clear(){
                System.out.print("\033[H\033[2J");
                System.out.flush();}}
