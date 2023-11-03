package com.example.Customer.controller;


import com.example.Customer.dto.CustomerDto;
import com.example.Customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cust")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping
    public String getName(){

        return "XYZ";
    }

    @PostMapping(path = "/save")
    public ResponseEntity<CustomerDto> createCustomer(
            @RequestBody CustomerDto customerDto
    ) {
        return new ResponseEntity<>(customerService.createCustomer(customerDto), HttpStatus.OK);

    }

    @GetMapping("/getAll")
    public ResponseEntity<List<CustomerDto>> getAllCustomer(

    )  {

        System.out.println("-------------");

        return new ResponseEntity<>(customerService.getAllCustomer(), HttpStatus.OK);
    }
}
