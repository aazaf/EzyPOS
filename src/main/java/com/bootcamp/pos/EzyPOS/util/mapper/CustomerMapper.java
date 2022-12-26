package com.bootcamp.pos.EzyPOS.util.mapper;

import com.bootcamp.pos.EzyPOS.dto.CustomerDTO;
import com.bootcamp.pos.EzyPOS.dto.request.CustomerRequestDTO;
import com.bootcamp.pos.EzyPOS.dto.response.CustomerResponseDTO;
import com.bootcamp.pos.EzyPOS.entity.Customer;
import org.mapstruct.Mapper;
import java.util.List;

/**
 * @author Mohamed Aazaf <aazafmax2@gmail.com> (www.aazafbiz.web.app)
 * @since 12/25/22
 */

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    Customer toCustomer(CustomerDTO dto);
    CustomerResponseDTO toCustomerResponseDTO(Customer customer);
    List<CustomerResponseDTO> toCustomerResponseDTOList(List<Customer> list);
}
