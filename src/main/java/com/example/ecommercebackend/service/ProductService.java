package com.example.ecommercebackend.service;

import com.example.ecommercebackend.model.Product;
import com.example.ecommercebackend.model.dao.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductDAO productDAO;

    public ProductService(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    public List<Product> getProducts(){
        return productDAO.findAll();
    }

    public List<Product> getProductsMinusSix(){
        return productDAO.getByMinusSix();
    }

    public List<Product> getProductMinus(Integer numero){
        return productDAO.getByMinus(numero);
    }

    public List<Product> getProductMinusId(Integer numero, Integer id){
        return productDAO.getByMinusAndId(numero, id);
    }
}
