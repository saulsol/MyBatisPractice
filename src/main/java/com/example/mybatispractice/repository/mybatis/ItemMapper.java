package com.example.mybatispractice.repository.mybatis;

import com.example.mybatispractice.domain.Item;
import com.example.mybatispractice.domain.ItemSearchCond;
import com.example.mybatispractice.dto.ItemUpdateDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface ItemMapper {

    void save(Item item);

    void update(@Param("id") Long id, @Param("updateParam")ItemUpdateDto itemUpdateDto);
    Optional<Item> findById(Long id);
    List<Item> findAll(ItemSearchCond itemSearchCond);



}
