package br.com.gabriel.apirestspring.repository;

import br.com.gabriel.apirestspring.model.CustomerModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerModel, Integer> {


}
