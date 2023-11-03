package com.example.Customer.service;

import com.example.Customer.Repository.CustomerRepository;
import com.example.Customer.domine.Customer;
import com.example.Customer.dto.CustomerDto;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

@Autowired
private  final ModelMapper modelMapper;

    public CustomerService(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public CustomerDto createCustomer(CustomerDto customerDto){


        Customer customer =  customerRepository.save(modelMapper.map(customerDto, Customer.class));

        return modelMapper.map(customer, CustomerDto.class);
        //return null;
    }

    public List<CustomerDto> getAllCustomer() {


        List<Customer> customerList = customerRepository.findAll();

return customerList.stream().map(customer -> modelMapper.map(customer,CustomerDto.class)).collect(Collectors.toList());
    }
}
