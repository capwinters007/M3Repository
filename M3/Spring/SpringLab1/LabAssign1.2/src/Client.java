import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		
		Employee emp=(Employee) context.getBean("emp");
		SBU sbu=emp.getSbuDetails();
		System.out.println(emp);
		System.out.println(sbu);
		
	}

}
