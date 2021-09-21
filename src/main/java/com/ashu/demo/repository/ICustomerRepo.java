package com.ashu.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashu.demo.entity.Customer;



@Repository
public interface ICustomerRepo extends JpaRepository<Customer, Long> {

}