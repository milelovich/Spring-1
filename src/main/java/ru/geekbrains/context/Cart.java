package ru.geekbrains.context;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class Cart {
    private Long id;

    @Autowired
    private ProductService productService;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

//    public Cart(Long id) {
//        this.id = id;
//    }

    public void addProductToCart(Long id) {
        System.out.print("Заказ помещен в корзину —" + " ");
        System.out.println(productService.getTitleById(id));


    }

}


