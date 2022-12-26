package com.bootcamp.pos.EzyPOS.repo;

import com.bootcamp.pos.EzyPOS.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author Mohamed Aazaf <aazafmax2@gmail.com> (www.aazafbiz.web.app)
 * @since 12/18/22
 */

@EnableJpaRepositories
public interface CustomerRepo extends JpaRepository<Customer, String> {

}
