package com.trilha.back.financys.controller;

import com.trilha.back.financys.entity.Entry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/lancamentos")
public class EntryController {

    public List<Entry> lista = new ArrayList<>();

    @PostMapping
    public String create(@RequestBody Entry entry){
        lista.add(entry);
        return "Número da posição que foi inserido a lista: " + lista.size();
    }

    @GetMapping
    public List<Entry> read(){
        return lista
                .stream()
                .sorted(Comparator.comparing(Entry::getDate))
                .collect(Collectors.toList());
    }
}
