package com.trilha.back.financys.mapper;

import com.trilha.back.financys.dto.EntryDto;
import com.trilha.back.financys.entity.Entry;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EntryMapper {

    Entry dtoToEntity(EntryDto dto);
    EntryDto entityToDto(Entry entity);

}
