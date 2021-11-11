package ru.geekbrains.context;

import org.springframework.stereotype.Component;

@Component
public interface ProductRepository { // хранилище продуктов
    Product findById(Long id);
}
