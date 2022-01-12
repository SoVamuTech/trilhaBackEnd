package com.trilha.back.financys.controller;

import com.trilha.back.financys.entity.Category;
import com.trilha.back.financys.repository.CategoryRepository;
import com.trilha.back.financys.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoryController {

    @Autowired
    private CategoryService service;

    @PostMapping
    public ResponseEntity<Category> create(@RequestBody Category body){
       return ResponseEntity.ok(service.save(body));
    }

    @GetMapping
    public ResponseEntity<List<Category>> read(){
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Category> findBy(@PathVariable Long id){
        return ResponseEntity.ok(service.findById(id));
    }

    @GetMapping("/nome_categoria/{nameCat}")
    public ResponseEntity<Long> idCategoryByName(@PathVariable String nameCat){
        return ResponseEntity.ok(service.idCategoryByName(nameCat));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Category> update(@PathVariable Long id, @RequestBody Category body){
        return ResponseEntity.ok(service.update(id,body));
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable Long id){
        service.deleteById(id);
    }
}
