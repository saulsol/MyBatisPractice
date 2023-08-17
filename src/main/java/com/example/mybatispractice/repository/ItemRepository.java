package com.example.mybatispractice.repository;

import com.example.mybatispractice.domain.Item;
import com.example.mybatispractice.domain.ItemSearchCond;
import com.example.mybatispractice.dto.ItemUpdateDto;

import java.util.List;
import java.util.Optional;

public interface ItemRepository {

    Item save(Item item);
    void update(Long itemId, ItemUpdateDto updateParam);
    Optional<Item> findById(Long id);
    List<Item> findAll(ItemSearchCond cond);
}
