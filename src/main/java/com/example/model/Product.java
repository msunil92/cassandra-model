package com.example.model;


import lombok.*;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;

import static org.springframework.data.cassandra.core.cql.PrimaryKeyType.PARTITIONED;

@Table("product")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product
{
    @PrimaryKeyColumn(name = "product_id", type = PARTITIONED)
    private String productId;

    @Column("name")
    private String name;

    @Column("brand_id")
    private UUID brandId;

    @Column("catogery_id")
    private String catogeryId;

    @Column("model_year")
    private double modelYear;

    @Column("price")
    private double price;

}
