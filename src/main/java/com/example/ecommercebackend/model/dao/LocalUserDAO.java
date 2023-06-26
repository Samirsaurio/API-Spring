package com.example.ecommercebackend.model.dao;

import com.example.ecommercebackend.model.LocalUser;
import org.springframework.data.repository.ListCrudRepository;

import java.util.Optional;

public interface LocalUserDAO extends ListCrudRepository<LocalUser, Long> {

    Optional<LocalUser> findByUsernameIgnoreCase(String username); //para ver si ya existe el username

    Optional<LocalUser> findByEmailIgnoreCase(String email); // y  el email
}
