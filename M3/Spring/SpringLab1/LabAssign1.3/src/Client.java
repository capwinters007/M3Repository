import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Client {
	
	public static void main(String[] args){
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("Bean.xml");
		
		Employee emp=(Employee) context.getBean("emp");
		SBU sbu=emp.getSbuDetails();
		Employee emp2=(Employee) context.getBean("emp");
		emp2.setId(102);
		emp2.setName("Arun");
		emp2.setSalary(17000);
		emp2.setBu("PES-BU");
		emp2.setAge(25);
		sbu.list.add(emp2);
		System.out.println(sbu);
		System.out.println(sbu.list);
	}

}
