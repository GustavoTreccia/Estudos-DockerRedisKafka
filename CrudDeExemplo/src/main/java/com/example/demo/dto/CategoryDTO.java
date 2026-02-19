package com.example.demo.dto;

import java.io.Serializable;

import com.example.demo.entities.Category;

public record CategoryDTO(
        Long id,
        String name
) implements Serializable {

    private static final long serialVersionUID = 1313123214L;

    public CategoryDTO(Category entity) {
        this(
            entity.getId(),
            entity.getName()
        );
    }
}
