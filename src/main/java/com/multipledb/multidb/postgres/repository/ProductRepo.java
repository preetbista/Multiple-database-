package com.multipledb.multidb.postgres.repository;

import com.multipledb.multidb.postgres.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {
    Product findByName(String name);
}
