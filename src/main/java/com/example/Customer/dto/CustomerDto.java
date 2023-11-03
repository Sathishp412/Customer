package com.example.Customer.dto;


import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
public class CustomerDto {

    private Long id;

    private String name;

    private List<Product> productList;


}
