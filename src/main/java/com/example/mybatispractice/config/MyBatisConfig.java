package com.example.mybatispractice.config;

import com.example.mybatispractice.repository.ItemRepository;
import com.example.mybatispractice.repository.mybatis.ItemMapper;
import com.example.mybatispractice.repository.mybatis.MybatisItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@RequiredArgsConstructor
public class MyBatisConfig {

    private final ItemMapper itemMapper;


    public ItemRepository itemRepository(){
        return new MybatisItemRepository(itemMapper);
    }







}
