package com.example.ecommercebackend.service;

import com.example.ecommercebackend.model.LocalUser;
import com.example.ecommercebackend.model.WebOrder;
import com.example.ecommercebackend.model.dao.WebOrderDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private WebOrderDAO webOrderDAO;

    public OrderService(WebOrderDAO webOrderDAO){
        this.webOrderDAO = webOrderDAO;
    }

    public List<WebOrder> getOrders(LocalUser user){
        return webOrderDAO.findByUser(user);
    }
}
