package AssignmentQ4;

public class Q4 {

	 int eid;
	    String ename;
	    String email;
	    float salary;
	    Department_Q4 department;
	    public int getEid() {
	        return eid;
	    }
	    public void setEid(int eid) {
	        this.eid = eid;
	    }
	    public String getEname() {
	        return ename;
	    }
	    public void setEname(String ename) {
	        this.ename = ename;
	    }
	    public String getEmail() {
	        return email;
	    }
	    public void setEmail(String email) {
	        this.email = email;
	    }
	    public float getSalary() {
	        return salary;
	    }
	    public void setSalary(float salary) {
	        this.salary = salary;
	    }
	    public Department_Q4 getDepartment() {
	        return department;
	    }
	    public void setDepartment(Department_Q4 department) {
	        this.department = department;
	    }



	    @Override
	    public String toString() {
	        return "Emp_Q4 [eid=" + eid + ", ename=" + ename + ", email=" + email + ", salary=" + salary + ", department="
	                + department + "]";
	    }
	    public void employeeDetails() {
	        System.out.println("Employee id : "+eid);
	        System.out.println(department);
	        System.out.println("Employee name : "+ename);
	        System.out.println("Employee email : "+email);
	        System.out.println("Employee salary: "+salary);

	    }



}
