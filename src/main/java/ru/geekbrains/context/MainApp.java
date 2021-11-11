package ru.geekbrains.context;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class); // создали "умную коробку", кот будет создавать объекты и отдавать их нам
        // OrderService orderService = context.getBean(OrderService.class);
       // orderService.createOrderFromProduct(1L);


        Cart cart = context.getBean(Cart.class);
        cart.addProductToCart(1L);
//        System.out.println(cart);

        Scanner sc = new Scanner(System.in);
        Long id = sc.nextLong();
        cart.addProductToCart(id);

//        orderService.createOrderFromProduct(1L);
//        orderService.createOrderFromProduct(1L);
//        orderService.createOrderFromProduct(1L);
//        orderService.createOrderFromProduct(1L);
        context.close();
    }
}
