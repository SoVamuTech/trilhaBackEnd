package com.trilha.back.financys.service;

import com.trilha.back.financys.entity.Entry;
import com.trilha.back.financys.repository.CategoryRepository;
import com.trilha.back.financys.repository.EntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntryService {

    @Autowired
    private EntryRepository entryRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    public boolean validateCategoryById(long idCategory){
        return categoryRepository.findById(idCategory).isPresent();
    }

    public Entry save(Entry body) {
        return entryRepository.save(body);
    }

    public List<Entry> findAll() {
        return entryRepository.findAll();
    }

    public List<Entry> findAllByPaid(boolean pagos) {
        return entryRepository.findAllByPaid(pagos);
    }

    public Entry findById(Long id) {
        return entryRepository.findById(id).isPresent()
                ? entryRepository.findById(id).get()
                : null;
    }

    public Entry update(Long id,Entry body) {
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

    public void deleteById(Long id) {
        entryRepository.deleteById(id);
    }
}
