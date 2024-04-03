package com.example.shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.shopping.model.Product;

public interface ProductRepo extends JpaRepository<Product,Integer>{
    
}
