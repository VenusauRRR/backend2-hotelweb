package org.example.backend.Service;

import org.example.backend.DTO.CustomerDto;
import org.example.backend.Model.Customer;

import java.util.List;

public interface CustomerService {
    public Customer customerDtoToCustomer(CustomerDto c);

    public CustomerDto customeerToCustomerDto(Customer c);

    public List<CustomerDto> getAll();

    public String addCustomer(CustomerDto c);

    public String addCustomer2(String name, String phone);

    public String deleteCustomerByName(String name);

    public String updateCustomer(Long id, String name, String phone);
}
