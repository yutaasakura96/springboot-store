package com.example.store.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import com.example.store.dtos.ProductDto;
import com.example.store.entities.Product;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    @Mapping(target = "categoryId", source = "category.id")
    ProductDto toDto(Product product);
}
