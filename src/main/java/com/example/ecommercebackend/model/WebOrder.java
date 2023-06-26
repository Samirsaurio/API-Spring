package com.example.ecommercebackend.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "web_order")
public class WebOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private LocalUser user;

    @ManyToOne(optional = false)
    @JoinColumn(name = "address_id", nullable = false)
    private Address address;

    public LocalUser getUser() {
        return user;
    }

    @OneToMany(mappedBy = "order", cascade = CascadeType.REMOVE, orphanRemoval = true) //One to many porque solo hay 1
    private List<WebOrderQuantities> quanties = new ArrayList<>();

    public List<WebOrderQuantities> getQuanties() {
        return quanties;
    }

    public void setQuanties(List<WebOrderQuantities> quanties) {
        this.quanties = quanties;
    }

    public void setUser(LocalUser user) {
        this.user = user;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
