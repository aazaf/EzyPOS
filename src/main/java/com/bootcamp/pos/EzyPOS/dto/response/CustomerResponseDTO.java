package com.bootcamp.pos.EzyPOS.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Mohamed Aazaf <aazafmax2@gmail.com> (www.aazafbiz.web.app)
 * @since 12/21/22
 */


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerResponseDTO {
    private String id;
    private String name;
    private String address;
    private double salary;
}
