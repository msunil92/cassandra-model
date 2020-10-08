package com.example.repository;

import com.example.model.Customer;
import com.example.model.CustomerKey;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface CustomerRepo extends CassandraRepository<Customer, CustomerKey> {

    List<Customer> findByKeyFirstName(final String firstName);

    List<Customer> findByKeyFirstNameAndKeyDateOfBirthGreaterThan(
            final String firstName, final LocalDateTime dateOfBirth);

    @Query(allowFiltering = true)
    List<Customer> findByLastName(final String lastName);

}