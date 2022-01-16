package com.trilha.back.financys.service;

import com.trilha.back.financys.dto.CategoryDto;
import com.trilha.back.financys.entity.Category;
import com.trilha.back.financys.mapper.CategoryMapper;
import com.trilha.back.financys.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    @Autowired
    private CategoryMapper mapper;

    public Category save(CategoryDto body) {
        return repository.save(mapper.dtoToEntity(body));
    }

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long id) {
       return repository.findById(id).isPresent()
               ? repository.findById(id).get()
               : null ;
    }

    public Category update(Long id,CategoryDto body) {
        Category category = repository.findById(id).get();
        category.setDescription(body.getDescription());
        category.setName(body.getName());
        category.setType(body.getType());
        return repository.save(category);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public Long idCategoryByName(String nomeCategoria) {
        return repository.findByName(nomeCategoria).getId();
    }
}
