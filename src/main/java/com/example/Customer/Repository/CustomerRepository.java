package com.example.Customer.Repository;


import com.example.Customer.domine.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
