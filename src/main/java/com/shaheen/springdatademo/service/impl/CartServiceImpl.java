package com.shaheen.springdatademo.service.impl;

import com.shaheen.springdatademo.model.Cart;
import com.shaheen.springdatademo.model.Item;
import com.shaheen.springdatademo.repository.CartRepository;
import com.shaheen.springdatademo.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class CartServiceImpl implements CartService {
    private CartRepository cartRepository;

    @Autowired
    public CartServiceImpl(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    @Override
    public Cart addToCart(Set<Item> items) {
        Cart cart = new Cart();
        items.forEach(item -> item.setCart(cart));
        cart.setItems(items);
        return cartRepository.save(cart);
    }
}
