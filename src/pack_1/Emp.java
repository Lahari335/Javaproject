package pack_1;

public class Emp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String empname;
		int empid;
		long empsalary;
		String empdesig;
		Emp emp1 = new Emp();
		  emp1.init("Sanvi",1, 800000,"Associate");
		  emp1.display();
		  Emp emp2 = new Emp();
		  emp2.init("Sathvik",2, 500000,"Trainee");
		  emp2.display();
		  Emp emp3 = new Emp();
		  emp3.init("Hemanth",1, 600000,"Associate");
		  emp3.display();
		 }
		 void init(String empname_temp, int empid_temp, int empsalary_temp, String empdesig_temp) {
		  empname = empname_temp;
		  empid = empid_temp;
		  empsalary = empsalary_temp;
		  empdesig = empdesig_temp;
		 }
		 void display() {
		  System.out.println("Employee name : "+empname);
		  System.out.println("Employee ID : "+empid);
		  System.out.println("Employee salary : "+empsalary);
		  System.out.println("Employee designation : "+empdesig);
		 }

}
