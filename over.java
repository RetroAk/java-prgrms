class Ovrld {  
    void check() {  
        System.out.println("No parameters");  
    }  
    // Overload check for single integer parameter  
    void check(int a) {  
        System.out.println("a: " + a);  
    }  
    // Overload check for two integer parameters.  
    void check(int a, int b) {  
        System.out.println("a and b: " + a + " " + b);  
    }  
    // overload check for a double parameter  
    double check(double a) {  
        System.out.println("double a: " + a);  
        return a * a;  
    }  
}  
class over {
    public static void main(String args[]) {
        Ovrld ob = new Ovrld();
        double result;
        // call all versions of check()
        ob.check();
        ob.check(10);
        ob.check(10, 20);
        result = ob.check(123.2);
        System.out.println("Result of ob.check(123.2): " + result);
    }
}
