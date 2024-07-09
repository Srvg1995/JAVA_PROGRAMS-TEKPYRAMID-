package Imp_programs1;

public class MethodOverloading7 {
	
	    public int add(int a, int b) {
	        return a + b;
	    }

	    public double add(double a, double b) {
	        return a + b;
	    }

	    public double add(int a, double b) {
	        return a + b;
	    }

	    public double add(double a, int b) {
	        return a + b;
	    }

	    public static void main(String[] args) {
	    	MethodOverloading7 methdOvrload = new MethodOverloading7();
	        
	        System.out.println("Sum of 10 and 20 (int): " + methdOvrload.add(10, 20));
	        System.out.println("Sum of 10.5 and 20.5 (double): " + methdOvrload.add(10.5, 20.5));
	        System.out.println("Sum of 10 (int) and 20.5 (double): " + methdOvrload.add(10, 20.5));
	        System.out.println("Sum of 10.5 (double) and 20 (int): " + methdOvrload.add(10.5, 20));
	    }
	}


