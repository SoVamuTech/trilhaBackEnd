package com.trilha.back.financys.controller;

import com.trilha.back.financys.dto.ChartDto;
import com.trilha.back.financys.dto.EntryDto;
import com.trilha.back.financys.entity.Entry;
import com.trilha.back.financys.service.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/lancamentos")
public class EntryController {

    @Autowired
    private EntryService service;

    @PostMapping
    public ResponseEntity<Object> create(@RequestBody @Valid EntryDto body) {
        if (service.validateCategoryById(body.getCategoryId().getId()))
            return ResponseEntity.ok(service.save(body));
        return ResponseEntity.badRequest().body("Erro! Não existe a categoria na base de dados!");
    }

    @GetMapping
    public ResponseEntity<List<Entry>> read(@RequestParam(required = false) String situacao) {
        if (Objects.isNull(situacao))
            return ResponseEntity.ok(service.findAll());
        return ResponseEntity.ok(service
                .findAllByPaid(situacao.equalsIgnoreCase("pagos"))
                );
    }

    @GetMapping("/{id}")
    public ResponseEntity<Entry> findBy(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @GetMapping("/grafico")
    public ResponseEntity<List<ChartDto>> grafico(){
        return ResponseEntity.ok(service.grafico());
    }
    @PutMapping("/{id}")
    public ResponseEntity<Entry> update(@PathVariable Long id, @RequestBody @Valid EntryDto body) {
        return ResponseEntity.ok(service.update(id,body));
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable Long id) {
        service.deleteById(id);
    }
}
