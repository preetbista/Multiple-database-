package com.multipledb.multidb.postgres.service;

import com.multipledb.multidb.mysql.model.User;
import com.multipledb.multidb.postgres.model.Product;
import com.multipledb.multidb.postgres.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepo productRepo;

    public Product save(Product product){
        return productRepo.save(product);
    }

    public Product findById(Integer id ){
        return productRepo.findById(id).orElseThrow(null);
    }
}
