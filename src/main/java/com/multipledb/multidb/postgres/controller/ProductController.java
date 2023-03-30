package com.multipledb.multidb.postgres.controller;

import com.multipledb.multidb.mysql.model.User;
import com.multipledb.multidb.mysql.service.UserService;
import com.multipledb.multidb.postgres.model.Product;
import com.multipledb.multidb.postgres.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping
    public Product save(@RequestBody Product product){
        return productService.save(product);
    }
    @GetMapping("/{id}")
    public Product findById( @PathVariable(value = "id") Integer id ){
        return productService.findById(id);
    }
}
