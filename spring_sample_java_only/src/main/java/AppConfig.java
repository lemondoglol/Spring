import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.lemon.repository.CustomerRepository;
import com.lemon.repository.HibernateCustomerRepositoryImp;
import com.lemon.service.CustomerService;
import com.lemon.service.CustomerServiceImp;

@Configuration
@ComponentScan({"com.lemon"})
public class AppConfig {

	/**
	 * @Configuration  at class level
	 * @Bean at method level
	 * Define object here
	 * */
	
	@Bean(name = "customerServiceImp")
	@Scope("prototype")
	public CustomerService getCustomerServiceImp() {
		return new CustomerServiceImp(getHibernateCustomerRepositoryImp());
	}
	
	@Bean(name = "hibernateCustomerRepositoryImp")
	@Scope("singleton")
	public CustomerRepository getHibernateCustomerRepositoryImp() {
		return new HibernateCustomerRepositoryImp();
	}

}
