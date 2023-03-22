package com.example.projectorderservice.project;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
class ProjectService {
    private final ProductPort productPort;

    ProjectService(final ProductPort productPort) {
        this.productPort = productPort;
    }

    @Transactional
    public void addProject(AddProductRequest request) {

        //여기서 product는 아마 entity?
        final Product product = new Product(request.name(), request.price(), request.discountPolicy());

        productPort.save(product);


    }
}
