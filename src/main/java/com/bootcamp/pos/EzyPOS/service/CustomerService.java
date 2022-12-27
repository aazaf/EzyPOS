package com.bootcamp.pos.EzyPOS.service;

import com.bootcamp.pos.EzyPOS.dto.request.CustomerRequestDTO;
import com.bootcamp.pos.EzyPOS.dto.response.CustomerResponseDTO;
import com.bootcamp.pos.EzyPOS.dto.response.paginate.PaginateCustomerResponseDTO;

/**
 * @author Mohamed Aazaf <aazafmax2@gmail.com> (www.aazafbiz.web.app)
 * @since 12/18/22
 */
public interface CustomerService {

    public String saveCustomer(CustomerRequestDTO dto);
    public CustomerResponseDTO findCustomer(String id) throws ClassNotFoundException;
    public String updateCustomer(CustomerRequestDTO dto, String id) throws ClassNotFoundException;
    public String deleteCustomer(String id);
    public PaginateCustomerResponseDTO findAllCustomers(
            String searchText, int page, int size
    );
}
