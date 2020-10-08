CREATE KEYSPACE commerce WITH replication = {'class': 'SimpleStrategy', 'replication_factor': 1};


CREATE TABLE product (
  product_id TEXT,
  name text,
  brand_id UUID,
  catogery_id TEXT,
  model_year DOUBLE,
  price double,
  PRIMARY KEY ((product_id))
);


insert into product (product_id, name, catogery_id, model_year, price,brand_id) values ('stk671','RealMe','mobiles',2019,9899,uuid());
insert into product (product_id, name, catogery_id, model_year, price,brand_id) values ('abc561','Moto','mobiles',2019,9899,uuid());
insert into product (product_id, name, catogery_id, model_year, price,brand_id) values ('z01831','RealMe','mobiles',2019,9899,uuid());

drop table customers;
CREATE TABLE customers(
  first_name TEXT,
  date_of_birth timestamp,
  person_id UUID,
  last_name TEXT,
  salary DOUBLE,
  PRIMARY KEY ((first_name), date_of_birth, person_id)
) WITH CLUSTERING ORDER BY (date_of_birth ASC, person_id DESC);


insert into customers (first_name, date_of_birth, person_id, last_name, salary ) values ('Sunil','2017-05-05',uuid(),'M',20101010);
