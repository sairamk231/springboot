package com.springboot.config;

import com.springboot.mapper.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {

    @Bean
    public AddressMapper addressMapper(){
        return new AddressMapperImpl();
    }

    @Bean
    public UserMapper userMapper(){
        return new UserMapperImpl();
    }

    @Bean
    public OccupationMapper occupationMapper(){
        return new OccupationMapperImpl();
    }
}
