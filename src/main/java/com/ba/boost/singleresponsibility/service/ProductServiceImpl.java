package com.ba.boost.singleresponsibility.service;

import com.ba.boost.singleresponsibility.model.Product;

public class ProductServiceImpl implements IProductService {
    @Override
    public Product createProduct() {
        Product product1 = new Product("MacBook", 5, 20000);
        return product1;
    }

    @Override
    public Product getProduct() {
        return createProduct() ;
    }
}
