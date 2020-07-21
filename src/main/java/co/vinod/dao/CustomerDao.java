package co.vinod.dao;

import java.util.List;

import co.vinod.entity.Customer;

public interface CustomerDao {

	public Customer getOneCustomer(int id);

	public List<Customer> getAllCustomers();
}
