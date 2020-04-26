
public class Employee {
	
	private int id;
	private String name;
	private double salary;
	private String bu;
	private int age;
	private SBU sbu;
	
	Employee(SBU sbu){
		this.sbu=sbu;
	}
	
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
	public String getBu() {
		return bu;
	}
	public void setBu(String bu) {
		this.bu = bu;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public SBU getSbu() {
		return sbu;
	}
	public void setSbu(SBU sbu) {
		this.sbu = sbu;
	}
	
	public SBU getSbuDetails(){
		if(bu.equals("PES-BU")){
			sbu.sbuCode="PES-BU";
			sbu.sbuHead="Kiran Rao";
			sbu.sbuName="Engineering Services";
			sbu.list.add(this);
		}
		return sbu;
	}
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary
				+ ", age=" + age + "]";
	}
	
	

}
