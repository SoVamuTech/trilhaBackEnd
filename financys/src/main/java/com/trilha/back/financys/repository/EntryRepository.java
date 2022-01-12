package com.trilha.back.financys.repository;

import com.trilha.back.financys.entity.Entry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EntryRepository extends JpaRepository<Entry,Long> {
    List<Entry> findAllByPaid(boolean situacao);
}
