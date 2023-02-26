package com.example.casestudy_furama.repository;

import com.example.casestudy_furama.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer,Long> {
    @Query(value = "select * from customer where name_customer like %?% ",nativeQuery = true)
    Page <Customer>findAllCustomerWithPage(String nameCustomer, PageRequest pageRequest);

    Customer findCustomerBynameCustomer(String nameCustomer);



}
