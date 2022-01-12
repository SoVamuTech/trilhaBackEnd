package com.trilha.back.financys.controller;

import com.trilha.back.financys.entity.Category;
import com.trilha.back.financys.entity.Entry;
import com.trilha.back.financys.repository.CategoryRepository;
import com.trilha.back.financys.repository.EntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/lancamentos")
public class EntryController {

    @Autowired
    private EntryRepository entryRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @PostMapping
    public Long create(@RequestBody Entry body) {
        if (categoryRepository.findById(body.getCategoryId().getId()).isPresent()) {
            Entry entry = entryRepository.save(body);
            return entry.getId();
        }
        System.out.println("Erro! Não existe a categoria na base de dados!");
        return null;
    }

    @GetMapping
    public List<Entry> read(@RequestParam(required = false) String situacao) {
        if (Objects.isNull(situacao))
            return entryRepository.findAll();
        return entryRepository
                .findAllByPaid(situacao.equalsIgnoreCase("pagos"));
    }

    @GetMapping("/{id}")
    public Entry findBy(@PathVariable Long id) {
        return entryRepository.findById(id).isPresent()
                ? null
                : entryRepository.findById(id).get();
    }

    @PutMapping("/{id}")
    public Entry update(@PathVariable Long id, @RequestBody Entry body) {
        Entry entry = entryRepository.findById(id).get();
        entry.setDescription(body.getDescription());
        entry.setName(body.getName());
        entry.setDescription(body.getDescription());
        entry.setType(body.getType());
        entry.setAmount(body.getAmount());
        entry.setDate(body.getDate());
        entry.setPaid(body.isPaid());
        entry.setCategoryId(body.getCategoryId());
        return entryRepository.save(entry);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable Long id) {
        entryRepository.deleteById(id);
    }
}
