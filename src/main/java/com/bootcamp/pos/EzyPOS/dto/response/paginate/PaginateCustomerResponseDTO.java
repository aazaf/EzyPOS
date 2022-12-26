package com.bootcamp.pos.EzyPOS.dto.response.paginate;

import com.bootcamp.pos.EzyPOS.dto.response.CustomerResponseDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

/**
 * @author Mohamed Aazaf <aazafmax2@gmail.com> (www.aazafbiz.web.app)
 * @since 12/26/22
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaginateCustomerResponseDTO {

    private long pageCount;
    private List<CustomerResponseDTO> dataList;
}
