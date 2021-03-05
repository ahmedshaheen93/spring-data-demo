package com.shaheen.springdatademo.service;

import com.shaheen.springdatademo.model.Cart;
import com.shaheen.springdatademo.model.Item;

import java.util.Set;

public interface CartService {
    Cart addToCart(Set<Item> items);
}
