package com.trilha.back.financys.mapper;

import com.trilha.back.financys.dto.CategoryDto;
import com.trilha.back.financys.entity.Category;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    Category dtoToEntity(CategoryDto dto);
    CategoryDto entityToDto(Category entity);


}
