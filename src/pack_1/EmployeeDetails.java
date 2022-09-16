package pack_1;

public class EmployeeDetails {
	String empname;
	 int empid;
	 long empsalary;
	 String empdesign;
	 static String companyname="tieto";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  EmployeeDetails emp1 = new EmployeeDetails();
		  emp1.init("lahari",1, 900000,"test engineer");
		  emp1.display();
		  EmployeeDetails emp2 = new EmployeeDetails();
		  emp2.init("pooja",2, 800000,"Trainee");
		  emp2.display();
		  EmployeeDetails emp3 = new EmployeeDetails();
		  emp3.init("minaz",1, 600000,"Java developer");
		  emp3.display();
		 }
		 void init(String empname_temp, int empid_temp, int empsalary_temp, String empdesign_temp) {
		  empname = empname_temp;
		  empid = empid_temp;
		  empsalary = empsalary_temp;
		  empdesign = empdesign_temp;
		 }
		 void display() {
		  System.out.println("Employee name : "+empname);
		  System.out.println("Employee ID : "+empid);
		  System.out.println("Employee salary : "+empsalary);
		  System.out.println("Employee designation : "+empdesign);
		 }	
		 static void initstaticData()
		 {
			 companyname="tieto";
		 }
		 static {
			 System.out.println("welcome to tieto");
		 }
}
