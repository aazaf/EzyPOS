package com.bootcamp.pos.EzyPOS.dto.request;

import lombok.*;

/**
 * @author Mohamed Aazaf <aazafmax2@gmail.com> (www.aazafbiz.web.app)
 * @since 12/18/22
 */

@NoArgsConstructor
@AllArgsConstructor
@Data // ==> @Getter, @Setter, @ToString, hashCode, equal
public class CustomerRequestDTO {
    private String name;
    private String address;
    private double salary;

}
