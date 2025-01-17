package com.market.kintu.backend.infrastructure.config;

import com.market.kintu.backend.application.*;
import com.market.kintu.backend.domain.model.port.ICategoryRepository;
import com.market.kintu.backend.domain.model.port.IOrderRepository;
import com.market.kintu.backend.domain.model.port.IProductRepository;
import com.market.kintu.backend.domain.model.port.IUserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeangConfiguration {
    @Bean
    public UserService userService(IUserRepository iUserRepository){
        return new UserService(iUserRepository);

    }
    @Bean
    public CategoryService categoryService(ICategoryRepository iCategoryRepository){
        return new CategoryService(iCategoryRepository);
    }
    @Bean
    public ProductService productService(IProductRepository iProductRepository, UploadFile uploadFile){
        return  new ProductService(iProductRepository,uploadFile);
    }
    @Bean
    public OrderService orderService(IOrderRepository iOrderRepository){
        return new OrderService(iOrderRepository);
    }
    @Bean
    public UploadFile uploadFile(){
        return new UploadFile();
    }
}
