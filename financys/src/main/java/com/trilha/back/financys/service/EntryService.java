package com.trilha.back.financys.service;

import com.trilha.back.financys.dto.ChartDto;
import com.trilha.back.financys.dto.EntryDto;
import com.trilha.back.financys.entity.Category;
import com.trilha.back.financys.entity.Entry;
import com.trilha.back.financys.mapper.EntryMapper;
import com.trilha.back.financys.repository.CategoryRepository;
import com.trilha.back.financys.repository.EntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class EntryService {

    @Autowired
    private EntryRepository entryRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private EntryMapper mapper;

    public boolean validateCategoryById(long idCategory){
        return categoryRepository.findById(idCategory).isPresent();
    }

    public Entry save(EntryDto body) {
        return entryRepository.save(mapper.dtoToEntity(body));
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

    public Entry update(Long id,EntryDto body) {
        Entry entry = entryRepository.findById(id).get();
        entry.setDescription(body.getDescription());
        entry.setName(body.getName());
        entry.setDescription(body.getDescription());
        entry.setAmount(body.getAmount());
        entry.setDate(body.getDate());
        entry.setPaid(body.isPaid());
        entry.setCategoryId(body.getCategoryId());
        return entryRepository.save(entry);
    }

    public void deleteById(Long id) {
        entryRepository.deleteById(id);
    }

    public List<ChartDto> grafico() {
        List<ChartDto> retorno = new ArrayList<>();
        List<Category> categoryList =  categoryRepository.findAll();
        BigDecimal total = BigDecimal.ZERO;
        for (int i = 0 ; i <= categoryList.size()-1; i++){

            for (int j = 0 ; j <= categoryList.get(i).getEntries().size()-1; j++){
               total = total.add(categoryList.get(i).getEntries().get(j).getAmount());
            }
            retorno.add(new ChartDto(categoryList.get(i).getName(),
                                    categoryList.get(i).getType(),
                                    total));
        }
        return retorno;
    }
}
