package com.example.ecommercebackend.model.dao;

import com.example.ecommercebackend.model.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface ProductDAO extends ListCrudRepository<Product, Long> {

    @Query(value = "SELECT * FROM product where price < 6", nativeQuery = true)
    List<Product> getByMinusSix();

    @Query(value = "SELECT * FROM product where price < :price", nativeQuery = true)
    List<Product> getByMinus(@Param("price") Integer price);

    @Query(value = "SELECT * FROM product where price < :price AND id=:id", nativeQuery = true)
    List<Product> getByMinusAndId(@Param("price") Integer price, @Param("id") Integer id);


}
