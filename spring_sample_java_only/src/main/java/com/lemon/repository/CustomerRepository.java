package com.lemon.repository;

import java.util.List;

import com.lemon.model.Customer;

public interface CustomerRepository {

	public List<Customer> findAll();

}