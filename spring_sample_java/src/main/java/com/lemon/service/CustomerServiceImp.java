package com.lemon.service;

import java.util.List;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.lemon.model.Customer;
import com.lemon.repository.CustomerRepository;

@Service("customerServiceImp")                   // this is for annotation, can't use the one from AppConfig
//@Scope("singleton")   // this is also default
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)  // every time create a new instance, this is for scope, not for java AppConfig
public class CustomerServiceImp implements CustomerService {

	private CustomerRepository customerRepository;
	
	
	public CustomerServiceImp(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}
	
}
