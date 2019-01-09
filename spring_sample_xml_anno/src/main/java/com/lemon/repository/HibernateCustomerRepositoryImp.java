package com.lemon.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.lemon.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImp implements CustomerRepository {

	/* (non-Javadoc)
	 * @see com.lemon.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		List<Customer> customers = new ArrayList<>();
		Customer c1 = new Customer();
		c1.setFirstName("Ryan");
		c1.setLastName("Chen");
		customers.add(c1);
		return customers;
	}
	
}
