package com.trilha.back.financys.mapper;

import com.trilha.back.financys.dto.EntryDto;
import com.trilha.back.financys.entity.Entry;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-16T16:25:40-0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11 (Oracle Corporation)"
)
@Component
public class EntryMapperImpl implements EntryMapper {

    @Override
    public Entry dtoToEntity(EntryDto dto) {
        if ( dto == null ) {
            return null;
        }

        Entry entry = new Entry();

        entry.setName( dto.getName() );
        entry.setDescription( dto.getDescription() );
        entry.setAmount( dto.getAmount() );
        entry.setDate( dto.getDate() );
        entry.setPaid( dto.isPaid() );
        entry.setCategoryId( dto.getCategoryId() );

        return entry;
    }

    @Override
    public EntryDto entityToDto(Entry entity) {
        if ( entity == null ) {
            return null;
        }

        EntryDto entryDto = new EntryDto();

        entryDto.setName( entity.getName() );
        entryDto.setDescription( entity.getDescription() );
        entryDto.setAmount( entity.getAmount() );
        entryDto.setDate( entity.getDate() );
        entryDto.setPaid( entity.isPaid() );
        entryDto.setCategoryId( entity.getCategoryId() );

        return entryDto;
    }
}
