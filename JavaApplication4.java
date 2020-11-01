ass demoOverloading
{
	    int add(int x,int y) //method definition
		        {
				        return (x+y);
					    }
	        double add(double x,double y) //method definition
			    {
				            return (x+y);
					        }
}
public class JavaApplication4 
{
	    public static void main(String[] args) 
		        {
				       demoOverloading demo=new demoOverloading(); //creating object for above class
				              System.out.println("Sum of Integer "+demo.add(10,20)); //calling integer add method
					             System.out.println("Sum of double "+demo.add(33.44,67.5)); //calling double add method
						         }
}

