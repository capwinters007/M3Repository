

public class Employee {
	
	private int id;
	private String name;
	private double salary;
	private String BU;
	private int age;
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
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



	public void getDetails(){
		System.out.println("Name: "+name);
		System.out.println("Id: "+id);
		System.out.println("Salary: "+salary);
		System.out.println("BU: "+BU);
		System.out.println("Age: "+age);
	}

}
