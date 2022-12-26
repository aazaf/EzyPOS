package com.bootcamp.pos.EzyPOS.entity;

import lombok.*;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Mohamed Aazaf <aazafmax2@gmail.com> (www.aazafbiz.web.app)
 * @since 12/18/22
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "Customer")
@ToString
public class Customer {

    @Id
    private String id;
    private String name;
    private String address;
    private double salary;
}
