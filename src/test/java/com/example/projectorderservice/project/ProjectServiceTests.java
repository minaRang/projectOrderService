package com.example.projectorderservice.project;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class ProjectServiceTests {
//    @Autowired
//    private ProjectService productService;
//    private ProductPort productPort;
//    private ProductRepository productRepository;
//
//
//    @BeforeEach
//    void setUp() {
//        productRepository = new ProductRepository();
//        productPort = new ProductAdapter(productRepository);
//        productService = new ProjectService(productPort);
//    }

    @Test
    void 상품등록(){


        final AddProductRequest request = 상품등록요청_생성();

        //productService.addProject(request);

    }
    private static AddProductRequest 상품등록요청_생성(){
        final String name = "상품명";
        final int price = 1000;
        final DiscountPolicy discountPolicy = DiscountPolicy.NONE;
        return new AddProductRequest(name, price, discountPolicy);

    };


}
