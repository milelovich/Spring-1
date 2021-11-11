package ru.geekbrains.context;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ProductService { // по id продукта выдает название товара
    private ProductRepository productRepository;

    @Autowired // аннотация, позволяющая понять спрингу, что надо закинуть сюда ссылку на этот объект (заинжектить)
               // лучше эту аннотацию ставить над сеттером
               // теперь продуктовый сервис связан с репозиторием
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public String getTitleById(Long id) {
        return productRepository.findById(id).getTitle(); // обращаемся в хранилище продуктов
    }
}
