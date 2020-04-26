import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Client {
	
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		
		Employee emp=(Employee) context.getBean("emp");
		SBU sbu=emp.getSbuDetails();
		Employee emp2=(Employee) context.getBean("emp");
		emp2.setId(102);
		emp2.setName("Arun");
		emp2.setSalary(17000);
		emp2.setBu("PES-BU");
		emp2.setAge(25);
		sbu.list.add(emp2);
		System.out.println("Enter id to search");
		int id=sc.nextInt();
		for(int i=0;i<(sbu.list).size();i++){
			Employee emp1=(Employee) sbu.list.get(i);
			if(emp1.getId()==id)
				System.out.println(emp1);
				
		}
		
	}

}
