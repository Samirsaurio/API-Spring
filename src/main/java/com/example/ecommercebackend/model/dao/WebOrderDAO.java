package com.example.ecommercebackend.model.dao;

import com.example.ecommercebackend.model.LocalUser;
import com.example.ecommercebackend.model.WebOrder;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface WebOrderDAO extends ListCrudRepository<WebOrder, Long> {

    List<WebOrder> findByUser(LocalUser user);
}
