package Imp_programs1;

public class Employee9 {

	Double sal;
	int id;
	String dept;

	public Employee9(Double sal, int id, String dept) {
		this.sal = sal;
		this.id = id;
		this.dept = dept;
	}

	@Override
	public boolean equals(Object obj) {
		Employee9 emp=(Employee9)obj; //type/down casting
		return emp.sal==this.sal && emp.id==this.id && emp.dept==this.dept ;
	}

	@Override
	public String toString() {
		return "Employee9 [salary=" + sal + ", id=" + id + ", dept=" + dept + "]";
	}

	public static void main(String[] args) {
		Employee9 emp1=new Employee9(2500.50, 101, "IT");
		System.out.println(emp1);

		Employee9 emp2=new Employee9(3500.50, 101, "IT");
		System.out.println(emp2);
		
		System.out.println(emp1.equals(emp2));
	}
}
