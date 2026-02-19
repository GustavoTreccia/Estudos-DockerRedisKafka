package com.example.demo.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;
import java.util.Set;

import com.example.demo.entities.Category;
import com.example.demo.entities.Product;

public record ProductDTO(Long id, String name, String description, Double price, String imgUrl, Instant date, List<CategoryDTO> categories) implements Serializable {

    private static final long serialVersionUID = -6665832153300212918L;

    // Construtor baseado na entidade (sem categorias externas)
    public ProductDTO(Product entity) {
        this(
            entity.getId(),
            entity.getName(),
            entity.getDescription(),
            entity.getPrice(),
            entity.getImgUrl(),
            entity.getDate(),
            entity.getCategories()
                  .stream()
                  .map(CategoryDTO::new)
                  .toList()
        );
    }

    // Construtor recebendo Set<Category>
    public ProductDTO(Product entity, Set<Category> categories) {
        this(
            entity.getId(),
            entity.getName(),
            entity.getDescription(),
            entity.getPrice(),
            entity.getImgUrl(),
            entity.getDate(),
            categories.stream().map(CategoryDTO::new).toList()
        );
    }
}
