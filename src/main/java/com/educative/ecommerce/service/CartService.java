package com.educative.ecommerce.service;

import com.educative.ecommerce.common.ApiResponse;
import com.educative.ecommerce.dto.AddToCartDto;
import com.educative.ecommerce.exceptions.AuthenticationFailException;
import com.educative.ecommerce.model.Cart;
import com.educative.ecommerce.model.Product;
import com.educative.ecommerce.model.User;
import com.educative.ecommerce.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CartService {

    @Autowired
    CartRepository cartRepository;

    public void addToCart(AddToCartDto addToCartDto, Product product, User user) {
        Cart cart = new Cart(product, addToCartDto.getQuantity(), user);
        cartRepository.save(cart);
    }
}
