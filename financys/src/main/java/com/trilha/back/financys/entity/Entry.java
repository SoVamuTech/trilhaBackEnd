package com.trilha.back.financys.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Entry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String type;
    private String amount;
    private LocalDate date;
    private boolean paid;

    @ManyToOne
    @JoinColumn(name = "categoryId", referencedColumnName = "id")
    private Category categoryId;

}

