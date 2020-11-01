class one 
{ 
    public void print_geek() 
    { 
        System.out.print("Geeks"); 
    } 
} 
  
class two extends one 
{ 
    public void print_for() 
    { 
        System.out.print("for"); 
    } 
} 
  
class three extends two 
{ 
    public void print_geek() 
    { 
        System.out.print("Geeks"); 
    } 
} 
  
// Drived class 
public class Main 
{ 
    public static void main(String[] args) 
    { 
        three g = new three(); 
        g.print_geek(); 
        g.print_for(); 
        g.print_geek(); 
    } 
} 
