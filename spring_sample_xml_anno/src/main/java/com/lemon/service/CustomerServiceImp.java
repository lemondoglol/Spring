package com.lemon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lemon.model.Customer;
import com.lemon.repository.CustomerRepository;

@Service("customerServiceImp")
public class CustomerServiceImp implements CustomerService {

	//@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	public CustomerServiceImp(CustomerRepository customerRepository) {
		System.out.println("Using Constructor Injection");
		this.customerRepository = customerRepository;
	}
	
	
	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}
	
	// testing setter injection
	//@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("Using setter injection");
		this.customerRepository = customerRepository;
	}
	
}
