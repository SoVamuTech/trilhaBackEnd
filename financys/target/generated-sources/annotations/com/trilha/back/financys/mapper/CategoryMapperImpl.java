package com.trilha.back.financys.mapper;

import com.trilha.back.financys.dto.CategoryDto;
import com.trilha.back.financys.entity.Category;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-16T16:50:26-0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11 (Oracle Corporation)"
)
@Component
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public Category dtoToEntity(CategoryDto dto) {
        if ( dto == null ) {
            return null;
        }

        Category category = new Category();

        category.setName( dto.getName() );
        category.setType( dto.getType() );
        category.setDescription( dto.getDescription() );

        return category;
    }

    @Override
    public CategoryDto entityToDto(Category entity) {
        if ( entity == null ) {
            return null;
        }

        CategoryDto categoryDto = new CategoryDto();

        categoryDto.setName( entity.getName() );
        categoryDto.setDescription( entity.getDescription() );
        categoryDto.setType( entity.getType() );

        return categoryDto;
    }
}
