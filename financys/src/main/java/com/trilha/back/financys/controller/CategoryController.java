package com.trilha.back.financys.controller;

import com.trilha.back.financys.entity.Category;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoryController {

    public List<Category> lista = new ArrayList<>();

    @PostMapping
    public String create(@RequestBody Category category){
        lista.add(category);
        return "Número da posição que foi inserido a categoria: " + lista.size();
    }

    @GetMapping
    public List<Category> read(){
        return lista;
    }


}
