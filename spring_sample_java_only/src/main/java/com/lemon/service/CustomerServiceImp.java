package com.lemon.service;

import java.util.List;


import com.lemon.model.Customer;
import com.lemon.repository.CustomerRepository;

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
