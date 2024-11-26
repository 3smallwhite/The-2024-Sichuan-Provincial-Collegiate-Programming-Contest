package com.example.javabigwork.repository;


import com.example.javabigwork.pojo.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface ProductRepository extends JpaRepository<Product, String> {

}
