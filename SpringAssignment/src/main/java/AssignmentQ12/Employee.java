package AssignmentQ12;

public class Employee {

	 int eid;
	    String ename;
	    String department;
	    float salary;
	    public Employee(int eid, String ename, String department, float salary) {
	        super();
	        this.eid = eid;
	        this.ename = ename;
	        this.department = department;
	        this.salary = salary;
	    }
	    @Override
	    public String toString() {
	        return "Employee [eid=" + eid + ", ename=" + ename + ", department=" + department + ", salary=" + salary + "]";
	    }
}
