import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lemon.service.CustomerService;

public class Application {

	public static void main(String[] args) {
		
		// need to close it
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// create instance of CustomerServiceImp
		CustomerService service = appContext.getBean("customerServiceImp", CustomerService.class);
		System.out.println(service.findAll().get(0).getFirstName());
	}

}
