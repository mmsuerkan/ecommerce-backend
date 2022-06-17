package com.educative.ecommerce.exceptions;

public class ProductNotExistException extends Exception {
    public ProductNotExistException(String message) {
        super(message);
    }
}
