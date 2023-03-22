package com.example.projectorderservice.project;

import org.springframework.stereotype.Component;

@Component
class ProductAdapter implements ProductPort {

    final private ProductRepository productRepository;

    ProductAdapter(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }
}
