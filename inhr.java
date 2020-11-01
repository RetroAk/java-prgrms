import java.util.Scanner;
class Employee{
String Name;
int Age;
String phno;
String Address;
double Salary;
Scanner sc=new Scanner(System.in);
void Input()
{
System.out.print("Enter Name:");
Name=sc.nextLine();
System.out.print("Enter Age:");
Age=sc.nextInt();
System.out.print("Enter Phone No.:");
sc.nextLine();
phno=sc.nextLine();
System.out.print("Enter Address:");
Address=sc.nextLine();
System.out.print("Enter Salary:");
Salary=sc.nextDouble();
}
void Display()
{
System.out.print("\n\nName:"+Name);

System.out.print("\nAge:"+Age);

System.out.print("\nPhone No.:"+phno);

System.out.print("\nAddress:"+Address);

System.out.print("\nSalary:"+Salary);

}
}
class Officer extends Employee{
	String specialization;
	String department;
	void off()
	{System.out.println("\n          DETAILS(officer)           "); 
	}	
	void subinp(){
		System.out.print("Enter specialization:");
		sc.nextLine();		
		specialization=sc.nextLine();
		System.out.print("Enter department:");
        	department=sc.nextLine();
	}
	void subdisp()
	{System.out.print("\nSpecialization:"+specialization);
	System.out.print("\nDepartment:"+department);
	}
}
class Manager extends Employee
	{
		
	String specialization;
	String department;
	void man()
	{	System.out.println("\n            DETAILS(manager)          ");
	 }
       void subinp(){
	    	System.out.print("Enter specialization:");
		sc.nextLine();
	    	specialization=sc.nextLine();
	    	System.out.print("Enter department:");
	    	department=sc.nextLine();
	    }
	void subdisp()
	{System.out.print("\nSpecialization:"+specialization);
	System.out.print("\nDepartment:"+department);
	}
}
class Main{
public static void main(String args[]){
	Officer O=new Officer();
	O.off();    	
	O.Input();
	O.subinp();
	O.off();
	O.Display();
	O.subdisp();
	Manager M=new Manager();
	M.man();
	M.Input();
	M.subinp();
	M.man();
	M.Display();
	M.subdisp();

}
}
