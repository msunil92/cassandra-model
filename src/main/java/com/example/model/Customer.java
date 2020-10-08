package com.example.model;

import lombok.*;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("customers")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Customer {

    @PrimaryKey
    private CustomerKey key;

    @Column("last_name")
    private String lastName;

    @Column("salary")
    private double salary;

}