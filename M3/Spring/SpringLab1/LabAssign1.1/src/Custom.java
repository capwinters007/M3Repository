

public class Custom {
	
	private int empId;
	private String empName;
	private double salary;
	private String BU;
	private int age;
	private Employee employee;
	
	Custom(Employee employee){
		this.employee=employee;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getBU() {
		return BU;
	}
	public void setBU(String bU) {
		BU = bU;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public void setDetails(){
		employee.setName(empName);
		employee.setId(empId);
		employee.setSalary(salary);
		employee.setBU(BU);
		employee.setAge(age);
		employee.getDetails();
	}

}
