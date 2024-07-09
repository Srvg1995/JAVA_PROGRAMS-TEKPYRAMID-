package Imp_programs1;

	public class Student8 {
	    private int id;
	    private String name;

	    public Student8(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }
	    public void display() {
	        System.out.println("Student ID: " + id);
	        System.out.println("Student Name: " + name);
	    }
	    
	    

	    public static void main(String[] args) {
	        Student8 student1 = new Student8(101, "Ram");
	        Student8 student2 = new Student8(102, "Krish");
	        student1.display();
	        student2.display();
	    }
	}

