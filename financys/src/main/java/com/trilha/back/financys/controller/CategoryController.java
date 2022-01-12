package com.trilha.back.financys.controller;

import com.trilha.back.financys.entity.Category;
import com.trilha.back.financys.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoryController {

    @Autowired
    private CategoryRepository repository;

    @PostMapping
    public Long create(@RequestBody Category body){
       Category c1 = repository.save(body);
        return c1.getId();
    }

    @GetMapping
    public List<Category> read(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Category findBy(@PathVariable Long id){
        return repository.findById(id).isPresent()
                ? null
                : repository.findById(id).get();
    }

    @PutMapping("/{id}")
    public Category update(@PathVariable Long id, @RequestBody Category body){
        Category category = repository.findById(id).get();
        category.setDescription(body.getDescription());
        category.setName(body.getName());
        return repository.save(category);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable Long id){
        repository.deleteById(id);
    }
}
