package com.lemon.service;

import java.util.List;

import com.lemon.model.Customer;
import com.lemon.repository.CustomerRepository;
import com.lemon.repository.HibernateCustomerRepositoryImp;

public class CustomerServiceImp implements CustomerService {

	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImp();
	
	/* (non-Javadoc)
	 * @see com.lemon.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}
	
}
