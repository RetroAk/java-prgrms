class student{
    int rollno;
	int age;
	int DOB;
	int physics;
	int chemistry;
	int maths;
	void total()
	{
		System.out.print("rollno is \n");
		System.out.println(rollno);
		System.out.println("age is:");
		System.out.println(age );
		System.out.print("total mark is: ");
		System.out.println(physics+chemistry+maths);
	}
}
class marks{
	public static void main(String args[]){
		student mymark1 = new student();
		mymark1.rollno = 4;
                mymark1.DOB = 30;
		mymark1.age = 17;
		mymark1.physics = 70;
		mymark1.chemistry = 55;
		mymark1.maths = 59;
		mymark1.total();
	}}
