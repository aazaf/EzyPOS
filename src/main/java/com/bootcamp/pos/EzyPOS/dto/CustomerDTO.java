package com.bootcamp.pos.EzyPOS.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Mohamed Aazaf <aazafmax2@gmail.com> (www.aazafbiz.web.app)
 * @since 12/18/22
 */

@NoArgsConstructor
@AllArgsConstructor
@Data // ==> @Getter, @Setter, @ToString, hashCode, equal
public class CustomerDTO {

    private String id;
    private String name;
    private String address;
    private double salary;

}
