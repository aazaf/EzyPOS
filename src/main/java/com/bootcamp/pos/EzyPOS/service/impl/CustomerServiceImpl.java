package com.bootcamp.pos.EzyPOS.service.impl;

import com.bootcamp.pos.EzyPOS.dto.CustomerDTO;
import com.bootcamp.pos.EzyPOS.dto.request.CustomerRequestDTO;
import com.bootcamp.pos.EzyPOS.dto.response.CustomerResponseDTO;
import com.bootcamp.pos.EzyPOS.dto.response.paginate.PaginateCustomerResponseDTO;
import com.bootcamp.pos.EzyPOS.entity.Customer;
import com.bootcamp.pos.EzyPOS.repo.CustomerRepo;
import com.bootcamp.pos.EzyPOS.service.CustomerService;
import com.bootcamp.pos.EzyPOS.util.IdGenerator;
import com.bootcamp.pos.EzyPOS.util.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author Mohamed Aazaf <aazafmax2@gmail.com> (www.aazafbiz.web.app)
 * @since 12/18/22
 */

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private IdGenerator idGenerator;

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public String saveCustomer(CustomerRequestDTO dto) {
        CustomerDTO customerDTO = new CustomerDTO(
                idGenerator.generateId(10), dto.getName(), dto.getAddress(), dto.getSalary());
        return customerRepo.save(customerMapper.toCustomer(customerDTO)).getId() + " saved";
    }

    @Override
    public CustomerResponseDTO findCustomer(String id) throws ClassNotFoundException {

        Optional<Customer> byId = customerRepo.findById(id);
        if (byId.isPresent()) {
            return customerMapper.toCustomerResponseDTO(byId.get());
        }
        throw new ClassNotFoundException("Not found");
    }

    @Override
    public String updateCustomer(CustomerRequestDTO dto, String id) throws ClassNotFoundException {
        Optional<Customer> byId = customerRepo.findById(id);
        if (byId.isPresent()) {
            byId.get().setName(dto.getName());
            byId.get().setAddress(dto.getAddress());
            byId.get().setSalary(dto.getSalary());
            customerRepo.save(byId.get());
            return byId.get().getName() + " was updated!";
        }
        throw new ClassNotFoundException("Not found");
    }

    @Override
    public String deleteCustomer(String id) {
        customerRepo.deleteById(id);
        return id + " was deleted!";
    }

    @Override
    public PaginateCustomerResponseDTO findAllCustomers(
            String searchText, int page, int size
    ) {

        return new PaginateCustomerResponseDTO(
                customerRepo.countCustomer(searchText),
                customerMapper.toCustomerResponseDTOList(
                        customerRepo.searchCustomer(searchText, PageRequest.of(page, size)))
        );
    }
}
